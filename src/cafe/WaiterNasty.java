package cafe;

public class WaiterNasty implements Waiter{


    @Override
    public void bringAnOrder(String menu) {
        System.out.println("Заказ принят - " + menu);
    }
}
