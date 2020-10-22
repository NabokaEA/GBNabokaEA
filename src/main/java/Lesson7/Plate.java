package Lesson7;

public class Plate {
    private int food;

    public Plate(int food)
    {
        this.food = food;
    }

    public void increaseFood(int food)
    {
        this.food += food;
        System.out.println("....добавили пищи");
    }

    public void decreaseFood(int appetite)
    {
        if (!hasEnoughFood(appetite))
        {
            System.out.println("Не достаточно пищи в тарелке");
            return;
        }

        food = food - appetite;
    }

    public boolean hasEnoughFood(int appetite)
    {
        return appetite <= food;
    }
}
