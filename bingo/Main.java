package bingo;

public class Main {

    public static Board myCard = new Board();
    public static Caller user = new Caller("Bingo");

    public static void main(String[] args) {
        myCard.printBingoCard();

        while(!myCard.isWinning()) {
            myCard.markNumber(user.getUserNumber());
            myCard.printBingoCard();
        }

        user.endGame();
    }
}