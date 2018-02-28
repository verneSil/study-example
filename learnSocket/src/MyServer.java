
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

public class MyServer {
    private ServerSocketChannel serverSocketChannel;
    private InetSocketAddress inetSocketAddress;
    private Selector selector;
    public void startServer() throws IOException {
        System.out.println("start server");
        selector = Selector.open();
        inetSocketAddress = new InetSocketAddress("localhost", 9999);
        serverSocketChannel = ServerSocketChannel.open();
        serverSocketChannel.configureBlocking(false);
        serverSocketChannel.bind(inetSocketAddress);
        serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);
        while (true) {
            selector.select();
            Set<SelectionKey> keys = selector.selectedKeys();
            Iterator<SelectionKey> iterator = keys.iterator();
            while (iterator.hasNext()) {
                SelectionKey key = iterator.next();
                iterator.remove();
                if(key.isAcceptable()) {
                    this.accept(key);
                }
                if(key.isReadable()) {
                    this.read(key);
                }

            }
        }
    }

    public void accept(SelectionKey key) throws IOException {
        System.out.println("accept socket");
        ServerSocketChannel serverSocketChannel = (ServerSocketChannel) key.channel();
        SocketChannel accept = serverSocketChannel.accept();
        accept.configureBlocking(false);
        SocketAddress remoteAddress = accept.getRemoteAddress();
        System.out.println(remoteAddress);
        accept.register(selector, SelectionKey.OP_READ);
    }

    public void read(SelectionKey key) throws IOException {
        System.out.println("read socket");
       SocketChannel socketChannel = (SocketChannel) key.channel();
        ByteBuffer allocate = ByteBuffer.allocate(1024);
        int read = socketChannel.read(allocate);
        if(read == -1) {
            Socket socket = socketChannel.socket();
            socket.close();
            socketChannel.close();
            key.cancel();
            return;
        }
//        byte[] array = allocate.array();
//        String s = new String(array);
//        System.out.println(s);
//        allocate.clear();
        byte[] data = new byte[read];
        System.arraycopy(allocate.array(), 0, data, 0, read);
        System.out.println(new String(data) + "");
    }
}
