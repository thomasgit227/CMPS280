package chapter10.assignment3;

public class Course {
    //Instantiation 
    private int number;
    private int size;
    private String name;
    private Instructor professor;
    private Student[] roster;

    private int rosterPlace = 0;

    //Construction
    public Course() {
        number = 0;
        size = 0;
        name = "Undefined";
        professor = null;
        roster = new Student[size];
    }

    public Course(int number, int size, String name, Instructor professor) {
        this.number = number;
        this.size = size;
        this.name = name;
        this.professor = professor;
        roster = new Student[size];
    }

    //Modification
    public void registerStudent(Student s) {
        //Add Student if space is avaliable and student is not previously enrolled
        if(s.isTaking(this)) {
            System.out.println("ERROR: Previously Enrolled, Cannot add: " + s.getFirstName() + " " + s.getLastName());
            System.exit(1);  
        }
        else if(rosterPlace < size) {
            roster[rosterPlace] = s;
            s.registerClass(this);
            rosterPlace ++;
        }
        else {
            System.out.println("ERROR: Class is Full, Cannot add: " + s.getFirstName() + " " + s.getLastName());
            System.exit(1);
        }
    }

    public void dropStudent(Student s) {
        //Linear Search for Student
        int indexToDrop = -1;
        for(int i = 0; i < size; i++) {
            if( (roster[i] != null) && (roster[i].getWNumber() == s.getWNumber()) ) {
                indexToDrop = i;
            }
        }

        //Remove Student and "Push" other's back
        for(int i = indexToDrop; i < size-1; i++) {
            roster[i] = roster[i+1];
        }
        s.dropClass(this);
        rosterPlace --;
    }

    public void clearCourse() {
        System.out.println("Course Cleared");
        for(int i = 0; i < size; i++) {
            roster[i] = null;
        }
    }

    //Collection
    public int getNumber() {
        return number;
    }

    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    public Instructor getInstructor() {
        return professor;
    }

    public void printRoster() {
        System.out.println("\nROSTER: " + getName());
        for(int i = 0; i < size; i ++) {
            if(roster[i] != null) {
                System.out.println(roster[i].getFirstName() + " " + roster[i].getLastName());
            }
        }
    }
}