import java.io.IOException;

public class MyMain {
    public static void main(String[] args) {
        Thread server = new Thread(() -> {
            try {
                new MyServer().startServer();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }, "server");
        Thread client = new Thread(() -> {
            try {
                new MyClient().startClient();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "client");
        server.start();
        client.start();
    }
}
