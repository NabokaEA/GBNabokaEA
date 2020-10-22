package Lesson5;

public class Main {
    public static void main(String[] args) {
        Person[] persArray = new Person[5]; // Объявляем массив Сотрудников
        persArray[0] = new Person("Иванов Геннадий Николаевич", "Начальник бюро", "ivivan@mailbox.com",
                "89211951111", 5000000, 60);
        persArray[1] = new Person("Ганев Эдуард Евгеньевич", "Инженер электроник", "ed30@mailbox.com",
                "89211951112", 300000, 39);
        persArray[2] = new Person("Набока Евгений Алексеевич", "Инженер электроник", "naboka@mailbox.com",
                "89211951113", 300000, 50);
        persArray[3] = new Person("Кубышкин Алексей Николаевич", "Инженер электроник", "kuba@mailbox.com",
                "89211951114", 300000, 55);
        persArray[4] = new Person("Стрижевский Александр Владимирович", "Начальник АСУ", "strig@mailbox.com",
                "89211951115", 1000000, 60);
        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].getPersonAge()>40){
                persArray[i].PrintToConsole();
        }
        }
    }
}
