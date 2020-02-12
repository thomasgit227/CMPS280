package chapter9.bingo;

public class Board {
    
    int[][] board = new int[5][5]; //Creates a 5x5 Bingo Card
    int[] numsUsed = new int[25]; //Single Dimension Array of the Board
    
    public Board() {
        generateCard();
        board[2][2] = 0; //Free Space
        
    }

    //Columns are randomized along an interval that increases 15 places every Row
    public void generateCard() {
        int k = 0;
        //Column Iterations
        for(int i = 0; i < board.length; i++) {
            //Row Iterations
            for(int j = 0; j < board[i].length; j++) {
                int numGenerated = generateNumber(j);
                board[i][j] = numGenerated;
                numsUsed[k] = numGenerated;

                //Number Regenerates if Used Already on Card
                while(containsRepeat(numsUsed, numGenerated)) {
                    numGenerated = generateNumber(j);
                    board[i][j] = numGenerated;
                    numsUsed[k] = numGenerated;
                }

                k++;
            }
        }
    }

    //Prints a 5x5 2-Dimension Array without "BINGO" formatting
    public void printRawCard() {
        //Column Iterations
        for(int i = 0; i < board.length; i++) {
            //Row Iterations
            for(int j = 0; j < board[i].length; j++) {
                //Print Data at Place, Justfy left and Add space
                System.out.printf("%-3d ", board[i][j]);
            }
            //Skip Line Every Row
            System.out.println();
        }
    }

    //Prints Bingo Card with Fun Title
    public void printBingoCard() {
        System.out.println("B * I * N * G * O");
        System.out.println("------------------");
        printRawCard();
    }

    //Finds where the user number is and replaces it with a 0
    public void markNumber(int userNum) {
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[i].length; j++) {
                if(board[i][j] == userNum) {
                    board[i][j] = 0;
                }
            }
        }
    }

    //Generates Random Number with a 15 Number Interval specifed by the Column
    public int generateNumber(int col) {
        //Interval Set
        int lowLimit =  (col * 15) + 1;
        int upperLimit = ((col + 1) * 15) + 1;

        //Random Number Generated
        int randNum = lowLimit + (int)((Math.random()) * (upperLimit - lowLimit));
        
        return randNum;
    }

    //Returns true if "target" value is found at least twice in "data" array
    public boolean containsRepeat(int[] data, int target) {
        int count = 0;
        for(int i = 0; i < data.length; i++) {
            if(data[i] == target) {
                count++;
            }
        }

        if(count >= 2) {
            return true;
        }
        return false;
    }

    //Returns true if an entire row, column, or diagonal ONLY contains zeros.
    public boolean isWinning() {
        
        //Row Check
        for(int i = 0; i < board.length; i++) {
            int sum = 0;
            for(int j = 0; j < board[i].length; j++) {
                sum += board[i][j];
            }
            if(sum == 0) {
                return true;
            }
        }
        
        //Column Check
        for(int i = 0; i < board.length; i++) {
            int sum = 0;
            for(int j = 0; j < board[i].length; j++) {
                sum += board[j][i];
            }
            if(sum == 0) {
                return true;
            }
        }

        //Diagonal Check
        int leftDiagonal = 0;
        int rightDiagonal = 0;

        for(int i = 0; i < board.length; i++) {
            leftDiagonal += board[i][i];
        }

        for(int i = (board.length-1); i >= 0; i--) {
            int j = Math.abs(i - 4);

            rightDiagonal += board[i][j];
        }

        if((leftDiagonal == 0) || (rightDiagonal == 0)) {
            return true;
        }

        return false;
    }
}