package test;

public class Person {
    private String namePers;
    private int agePers;

    public Person(String namePers, int agePers) {
        this.namePers = namePers;
        this.agePers = agePers;
    }

    public void getInfoPers (String namePers,int agePers){
        this.namePers = namePers;
        this.agePers = agePers;
        System.out.println("Новый сотрудник " + namePers + ". Возраст " + agePers + ".");
    }

    @Override
    public String toString() {
        return "Имя: "  + namePers + ", возраст: " + agePers;
    }
}
