package test;

import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {

        Random random = new Random();     //вызываем случайные числа
        for (int i = 0; i < 100; i++){         //цикл чтобы указать количество случайных чисел
            int a = random.nextInt(5,11);   //указываем в каких пределах число
            System.out.print(a + " ");
        }
        System.out.println();
        System.out.println("----------");

        Random randomCub = new Random();     //вызываем случайные числа
        for (int i = 0; i < 100; i++){         //цикл чтобы указать количество случайных чисел
            int b = randomCub.nextInt(1,7);   //указываем в каких пределах число
            String format = String.format("Ваше число %s", b);
            System.out.println(format);
        }




    }
}
