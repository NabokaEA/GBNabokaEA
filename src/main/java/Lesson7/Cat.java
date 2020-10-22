package Lesson7;

public class Cat {
    private String name;

    // 3. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту удалось покушать (хватило еды), сытость = true
    private boolean isFull;
    private int appetite;

    public Cat(String name, int appetite)
    {
        this.name = name;
        this.appetite = appetite;
        isFull = false;
    }

    public void eat(Plate plate)
    {
        // 2. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды (например, в миске 10 еды, а кот пытается покушать 15-20)
        // 4. Считаем, что если коту мало еды в тарелке, то он ее просто не трогает, то есть не может быть наполовину сыт (это сделано для упрощения логики программы)

        if (plate.hasEnoughFood(appetite) && !isFull)
        {
            plate.decreaseFood(appetite);
            isFull = true;
            System.out.println(name + " покушал");
        }
        else if (isFull)
        {
            System.out.println(name + " не хочет кушать");
        }
        else
        {
            plate.decreaseFood(appetite);
            isFull = false;
            System.out.println(name + " покушал, но не наелся");
        }
    }
}
