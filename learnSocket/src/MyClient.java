import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

public class MyClient {
    InetSocketAddress address;
    Selector selector;
    SocketChannel socketChannel;

    public void startClient() throws IOException, InterruptedException {
        System.out.println("start client");
        address = new InetSocketAddress("localhost", 9999);
        selector = Selector.open();
        socketChannel = SocketChannel.open(address);
        int i = 0;
        while (true) {
            socketChannel.write(ByteBuffer.wrap(new String("asdfasdf").getBytes()));
            Thread.sleep(50);
            Thread.sleep(50);
        }


    }
}
