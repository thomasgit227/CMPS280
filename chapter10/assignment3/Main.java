package chapter10.assignment3;

public class Main {
    public static void main(String[] args) {

        //Instructor List
        Instructor regis = new Instructor(3141592, "Paulo", "Regis");
        Instructor hopper = new Instructor(6283039, "Grace", "Hopper");

        //Student List
        Student thomas = new Student(699719, "Thomas", "Floyd");
        Student daniel = new Student(699720, "Daniel", "Floyd");
        Student george = new Student(1777420, "George", "Washington");
        Student steph = new Student(3030321, "Stephen", "Curry");

        Student setsuna = new Student(1583130, "Setsuna", "Seiei");
        Student lockon = new Student(2125915, "Lockon", "Stratos");
        Student allelujah = new Student(3398123, "Allelujah", "Haptism");
        Student tiere = new Student(4890345, "Tiere", "Erde");

        //Course List
        Course javaTwo = new Course(161, 23, "Algorithim Design & Implementation II", hopper);
        Course mechaPiloting = new Course(101, 10, "Intro to Gundam Piloting", regis);

        //Register Students
        mechaPiloting.registerStudent(thomas);
        mechaPiloting.registerStudent(setsuna);
        mechaPiloting.registerStudent(lockon);
        mechaPiloting.registerStudent(allelujah);
        mechaPiloting.registerStudent(tiere);

        javaTwo.registerStudent(thomas);
        javaTwo.registerStudent(daniel);
        javaTwo.registerStudent(george);
        javaTwo.registerStudent(steph);

        //Rosters
        javaTwo.printRoster();
        mechaPiloting.printRoster();

        //Students
        thomas.printInfo();
        steph.printInfo();
    }
}
