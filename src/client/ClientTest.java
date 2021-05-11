package client;

import javax.swing.JFrame;

class ClientTest {
    public static void main(String[] args) {
        Client application; 
        
        if (args.length == 0) {
            application = new Client("dnsredes.ddns.net"); 
        } else {
            application = new Client(args[0]); 
        }

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
} 