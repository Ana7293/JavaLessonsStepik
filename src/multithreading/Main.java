package multithreading;

public class Main {
    static boolean isFive = false;
    public static void main(String[] args) {

      //  Timer timer = new Timer(); //если интерфейс реализуем в классе таймер
        Thread thread = new Thread(new Runnable() {      //а так если интерфейс реализуем в анонимном классе
            @Override
            public void run() {
                for (int i = 0; i <= 10; i++){
                    if (i == 5){
                        isFive = true;
                    }
                    System.out.println(i);
                    try {
                        Thread.sleep(1000);          //усыпить таймер на 1 сек
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });  //создаем поток
        thread.start();  //метод чтобы запустить поток

      /*  for (int i = 0; i < 20; i++){
            System.out.println("Nasty");
        }
       */
        Thread thread2 = new Thread(new Runnable() {      //а так если интерфейс реализуем в анонимном классе
            @Override
            public void run() {
                for (int i = 0; i <= 10; i++){
                    if (isFive){
                        break;
                    }
                    System.out.println(i);
                    try {
                        Thread.sleep(1000);          //усыпить таймер на 1 сек
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });  //создаем поток
        thread2.start();  //метод чтобы запустить поток



    }
}
