package Lesson6;

public class Dog extends Animal {

    public Dog(String name){
        super(name);
    };

    protected void run(float dist) {
        if (dist>500) {dist=500;}
        System.out.println("Пёс "+name+" пробежал"+ dist+ "М");

    }

    protected void sweem(float dist) {
        if (dist>10) {dist=10;}
        System.out.println("Пёс "+name+" проплыл"+ dist+ "М");

    }
}
