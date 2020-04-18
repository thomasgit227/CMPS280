package chapter10.assignment2;
import java.util.Scanner;

public class Main {

    //HARD CODED OFFSET
    static int offset = 27;

    public static void main(String[] args) {

    //Gets Message to Encode
        Scanner keys = new Scanner(System.in);
        System.out.println("Please Enter the Message you would like to Encode: ");
        String message = keys.nextLine();
    
    //Setup Encoding/Decoding
        char[] msgArray = message.toCharArray();
        Encoder encoder = new Encoder(msgArray, offset);
        Decoder decoder = new Decoder(offset);
        keys.close();

    //Encoded Message
        encoder.encode(msgArray);
        System.out.printf("Your Encoded Message Is: %s\n", encoder.getEncodedMessageString());

    //Decoded Message
        decoder.decode(encoder.getEncodedMessage());
        String decodedMessage = decoder.getDecodedMessage();
        System.out.printf("Your Decoded Message Is: %s\n", decodedMessage);
    }
}
