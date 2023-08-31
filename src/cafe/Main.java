package cafe;

public class Main {
    public static void main(String[] args) {

        Guest oneGuest = new Guest();
     //   WaiterNasty oneWaiter = new WaiterNasty();
     //  oneGuest.makeAnOrder(oneWaiter, "Суп");
         oneGuest.makeAnOrder(new Waiter() {
             @Override
             public void bringAnOrder(String brish) {
                 System.out.println("Заказ принят - " + brish);
             }
         }, "Суп");
    }
}
