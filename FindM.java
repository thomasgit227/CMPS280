public class FindM {

    static int maxCheck = (int)Math.pow(10, 6); //The starting point to check from

    //The coefficients for the expressio
    static int coA = 4;
    static int coB = 5;
    static int coC = 7;

    public static void main(String[] args) {

        for(int i = maxCheck; i >=0; i--) { //Start from the top and work down
            if(satisfies(i)) {
                System.out.println("Works: " + i);
            }
            else {
                System.out.println("Does not Work: " + i);
                System.out.println("M is " + (i+1));
                break; //Ends Loop
            }
        }
    }

    static boolean satisfies(int m) {
        //These stacked For Loops will iterate for every possible combination of m, but I was able
        //save processing time by limiting them to values less than m, since the other numbers must be ADDED to the sum
        for(int a = 1; a < m; a++) {
            for(int b = 1; b < m; b++) {
                for(int c = 1; c < m; c++) {

                    //Does m equal one of these combinations?
                    int result = (coA * a) + (coB * b) + (coC * c);
                    if(result == m) 
                        return true; //I can stop iterating when I find one 

                }
            }
        }

        //If I cannot express a number as the above form I return a false boolean
        return false;
    }
}