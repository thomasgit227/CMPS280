package chapter10.assignment3;

public class Student {
    //Instantiation 
    private int wNumber;
    private String firstName;
    private String lastName;
    private Course[] courseList = new Course[7]; //Max Credit Hours is 21, this is 7 courses Max (3 Credit Hours per Class)

    private int courseListPlace = 0;

    //Construction
    public Student() {
        wNumber = 0000000;
        firstName = "John";
        lastName = "Doe";
    }

    public Student(int wNumber, String firstName, String lastName) {
        this.wNumber = wNumber;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //Modification
    public void registerClass(Course c) {
        if(courseListPlace < courseList.length) {
            courseList[courseListPlace] = c;
            courseListPlace ++;
        }
        else {
            System.out.println("ERROR: Class is Full, Cannot add: " + c.getName());
            System.exit(1);
        }
    }

    public void dropClass(Course c) {
        //Linear Search for Course
        int indexToDrop = -1;
        for(int i = 0; i < courseList.length; i++) {
            if( (courseList[i] != null) && (courseList[i].getName().equals(c.getName())) ) {
                indexToDrop = i;
            }
        }

        //Remove Course and "Push" other's back
        for(int i = indexToDrop; i < courseList.length-1; i++) {
            courseList[i] = courseList[i+1];
        }

        courseListPlace --;
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
        System.out.print("\n");
        System.out.printf(
            "Name: %s \n" +
            "W-Number: %d \n" +
            "Course List: ",
            firstName + " " + lastName, wNumber);

        for(int i = 0; i < courseList.length; i++) {
            if(courseList[i] != null) {
                System.out.println(courseList[i].getNumber() + "-" + courseList[i].getName());
            }
        }
    }

    public boolean isTaking(Course c) {
        for(int i = 0; i < courseList.length; i ++) {
            if( (courseList[i] != null) && (courseList[i].getName().equals(c.getName())) ) {
                return true;
            }
        }
        return false;
    }
}