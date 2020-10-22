package Lesson6;

public abstract class Animal {
    String name;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public void animalInfo() {
        System.out.println("Животное: " + name);
    }

    protected abstract void run(float dist);

    protected abstract void sweem(float dist);

}
