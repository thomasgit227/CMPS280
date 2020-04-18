package chapter10;

public class Dog {

    String name;
    String breed;
    int age;

    public Dog() {
        name = "Spot";
        breed = "Labrador Retriever";
        age = 1;
    }

    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public String getname() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }
}
