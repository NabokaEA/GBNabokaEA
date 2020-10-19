package Lesson6;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    protected void run(float dist) {
        if (dist>200) {dist=200;}
        System.out.println("Кот "+name+" пробежал"+ dist+ "М");

    }

    protected void sweem(float dist) {
        System.out.println("Кот "+name+" не умеет плавать");
    }
}
