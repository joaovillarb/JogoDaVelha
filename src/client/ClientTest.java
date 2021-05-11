
import javax.swing.JFrame;

class ClientTest {
    public static void main(String[] args) {
        Client application; // declare client application

        // Check for command line args
        if (args.length == 0) {
            application = new Client("191.187.190.35"); // localhost
        } else {
            application = new Client(args[0]); // use args
        }

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}