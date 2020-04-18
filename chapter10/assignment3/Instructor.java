package chapter10.assignment3;

public class Instructor {
    //Instantiation 
    private int wNumber;
    private String firstName;
    private String lastName;


    //Construction
    public Instructor() {
        wNumber = 0000000;
        firstName = "John";
        lastName = "Doe";
    }

    public Instructor(int wNumber, String firstName, String lastName) {
        this.wNumber = wNumber;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //Collection
    public int getWNumber() {
        return wNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void printInfo () {
        System.out.printf(
            "Name: %s \n" +
            "W-Number: %d \n" +
            "Course List: ",
            firstName + " " + lastName, wNumber);
    }
}