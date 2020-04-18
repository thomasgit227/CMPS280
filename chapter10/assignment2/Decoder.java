package chapter10.assignment2;

public class Decoder {

    String decodedMsg = "";
    int offset;

    public Decoder(int offset) {
        this.offset = offset;
    }

    public void decode(int[] message) {
        System.out.println("Decoding...");
        for(int i = 0; i < message.length; i ++) {
            decodedMsg += Character.toString(message[i] - offset);
        }
    }

    public String getDecodedMessage() {
        return decodedMsg;
    }
}