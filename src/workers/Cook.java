package workers;

public class Cook implements Worker, Driver{
    @Override
    public void work() {
        System.out.println("Я - повар!");
    }

    @Override
    public void drive() {
        System.out.println("Повар умеет водить авто!");
    }
}
