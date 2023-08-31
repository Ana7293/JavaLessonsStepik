package workers;

public class Programmer implements Worker, Driver {

    @Override
    public void work() {
        System.out.println("Я - разработчик!");
    }

    @Override
    public void drive() {
        System.out.println("Разработчик умеет водить авто!");
    }
}
