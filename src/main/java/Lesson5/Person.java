package Lesson5;

public class Person {
    private String personFIO;
    private String personPosition;
    private String personEmail;
    private String personPhoneNumber;
    private Integer personPay;
    private Integer personAge;

    public String getPersonFIO() {
        return personFIO;
    }

    public void setPersonFIO(String personFIO) {
        this.personFIO = personFIO;
    }

    public String getPersonPosition() {
        return personPosition;
    }

    public void setPersonPosition(String personPosition) {
        this.personPosition = personPosition;
    }

    public String getPersonEmail() {
        return personEmail;
    }

    public void setPersonEmail(String personEmail) {
        this.personEmail = personEmail;
    }

    public String getPersonPhoneNumber() {
        return personPhoneNumber;
    }

    public void setPersonPhoneNumber(String personPhoneNumber) {
        this.personPhoneNumber = personPhoneNumber;
    }

    public Integer getPersonPay() {
        return personPay;
    }

    public void setPersonPay(Integer personPay) {
        this.personPay = personPay;
    }

    public Integer getPersonAge() {
        return personAge;
    }

    public void setPersonAge(Integer personAge) {
        this.personAge = personAge;
    }

    public Person(String personFIO, String personPosition, String personEmail, String personPhoneNumber, Integer personPay, Integer personAge) {
        this.personFIO = personFIO;
        this.personPosition = personPosition;
        this.personEmail = personEmail;
        this.personPhoneNumber = personPhoneNumber;
        this.personPay = personPay;
        this.personAge = personAge;
    }

    public void PrintToConsole (){
        System.out.printf("\nФИО: "+personFIO+"\nДолжность : "+personPosition+"\nE-mail : "+personEmail+"\nЗряплата : "+personPay+"\nВозраст : "+personAge+"\n");
    }

}
