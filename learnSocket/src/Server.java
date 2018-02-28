import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.*;
import java.util.*;

public class Server {
    private Selector selector;
    private Map<SocketChannel, List> dataMapper;
    private InetSocketAddress listenAddress;

    public static void main(String[] args) {
        Runnable server = () -> {
            try {
                new Server("localhost", 12099).startServer();
            } catch (Exception e) {
                e.printStackTrace();
            }
        };

        Runnable client = () -> {
            try {
                new SocketClient().startClient();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

//        new Thread(() ->{
//            try {
//                new Server("localhost", 8009).startServer();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }).start();
//        new Thread(()->{
//            try {
//                new SocketClient().startClient();
//            } catch (IOException e) {
//                e.printStackTrace();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }, "client-A").start();
//        new Thread(()->{
//            try {
//                new SocketClient().startClient();
//            } catch (IOException e) {
//                e.printStackTrace();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//
//        }, "client-B").start();
        new Thread(server).start();
//        new Thread(client, "client-A").start();
//        new Thread(client, "client-B").start();
    }

    public Server(String address, int port) {
        listenAddress = new InetSocketAddress(address, port);
        dataMapper = new HashMap<SocketChannel, List>();
    }

    private void startServer() throws IOException {
        this.selector = Selector.open();
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        serverSocketChannel.configureBlocking(false);

        serverSocketChannel.socket().bind(listenAddress);
        serverSocketChannel.register(this.selector, SelectionKey.OP_ACCEPT);

        System.out.println("Server started....");

        while (true) {
            this.selector.select();
            Iterator<SelectionKey> keys= this.selector.selectedKeys().iterator();
            while (keys.hasNext()) {
                SelectionKey key = keys.next();
                keys.remove();

                if(!key.isValid()) {
                    continue;
                }
                if(key.isAcceptable()) {
                    this.accept(key);
                } else if(key.isReadable()) {
                    this.read(key);
                }
            }
        }
    }

    private void startServer2() throws IOException {
        Selector selector;
        selector = Selector.open();
        InetSocketAddress address = new InetSocketAddress("127.0.0.1", 8099);
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        serverSocketChannel.configureBlocking(false);
        serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);
        serverSocketChannel.socket().bind(address);
        System.out.println("Server start");

        while (true) {
            selector.select();
            Set<SelectionKey> keys = selector.keys();
            for(SelectionKey key : keys) {
                if(key.isAcceptable()) {
                    serverSocketChannel.accept();
                }
                if(key.isReadable()) {

                    SelectableChannel channel1 = key.channel();
                    SocketChannel channel = (SocketChannel) key.channel();
                    ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
                    int numRead = -1;
                    numRead = channel.read(byteBuffer);
                    if(numRead == -1) {
                        this.dataMapper.remove(channel);
                        Socket socket = channel.socket();
                        SocketAddress remoteSocketAddress = socket.getRemoteSocketAddress();
                        channel.close();
                        key.cancel();
                    }
                    byte[] bytes = new byte[numRead];
                    String s = new String(bytes);
                    System.out.println(s);
                }
            }
        }
    }

    private void accept(SelectionKey key) throws IOException {
        ServerSocketChannel serverSocketChannel = (ServerSocketChannel) key.channel();
        SocketChannel socketChannel = serverSocketChannel.accept();
        socketChannel.configureBlocking(false);
        Socket socket = socketChannel.socket();
        SocketAddress remoteAddr = socket.getRemoteSocketAddress();
        System.out.println("Connected to : " + remoteAddr);

        dataMapper.put(socketChannel, new ArrayList());
        socketChannel.register(this.selector, SelectionKey.OP_READ);
    }

    private void read(SelectionKey key) throws IOException {
        SocketChannel channel = (SocketChannel) key.channel();
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        int numRead = -1;
        numRead = channel.read(buffer);
        if (numRead == -1) {
            this.dataMapper.remove(channel);
            Socket socket = channel.socket();
            SocketAddress remoteAddr = socket.getRemoteSocketAddress();
            System.out.println("Connection closed by client: " + remoteAddr);
            channel.close();
            key.cancel();
            return;
        }
        byte[] data = new byte[numRead];
        System.arraycopy(buffer.array(), 0, data, 0, numRead);
        System.out.println("Got: " + new String(data));
    }
}
