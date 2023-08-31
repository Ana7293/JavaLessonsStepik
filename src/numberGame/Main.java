package numberGame;

import java.util.Random;

public class Main {

    static boolean bingo = false;

    public static void main(String[] args) {
        Random random = new Random();     //вызываем случайное число
        int a = random.nextInt(1000000000);   //указываем в каких пределах число
        // System.out.println(a + " "); //чтобы посмотреть какое число

        Thread threadNum = new Thread(new Runnable() {
            @Override
            public void run() {
                int x;
                do {
                    x = random.nextInt(1000000000);
                    //    System.out.println("Не угадал! Попробуй еще раз"); //чтобы посмотреть с какого раза угадал
                } while (x != a);
                bingo = true;
                System.out.println("Верно, вы угадали число! Это - " + x);
            }
        });
        threadNum.start();

        Thread thread2 = new Thread(new Runnable() {      //а так если интерфейс реализуем в анонимном классе
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    if (bingo) {
                        break;
                    }
                    System.out.println(i);
                    try {

                        Thread.sleep(1000);          //усыпить таймер на 1 сек
                    } catch (InterruptedException e) {
                    }
                }
            }
        });
        thread2.start();

    }
}

