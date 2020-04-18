package chapter10.assignment2;

public class Encoder {

    int offset;
    int[] encodedMsg;

    public Encoder(char[] message, int offset) {
        encodedMsg = new int[message.length];
        this.offset = offset;
        System.out.printf("* Encoding with %d offset *\n", offset);
    }

    public void encode(char[] message) {
        System.out.println("Encoding...");
        for(int i = 0; i < message.length; i ++) {
            encodedMsg[i] = (int)message[i] + offset;
        }
    }

    public String getEncodedMessageString() {
        String output = "";
        for(int i = 0; i < encodedMsg.length; i ++) {
            output += (encodedMsg[i] + " ");
        }
        return output;
    }

    public int[] getEncodedMessage() {
        return encodedMsg;
    }
}