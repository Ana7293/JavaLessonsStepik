package exceptoins;

public class Main {
    public static void main(String[] args) {

        int[] testExc = new int[5];

        try {
            testExc[0] = 1;
            testExc[1] = 2;
            testExc[2] = 3;
            testExc[3] = 4;
            testExc[4] = 5;
         //   testExc[5] = 6;  //проверка на ошибку
            System.out.println("Выводим весь список: ");
            for (int j : testExc) {
                System.out.println(j);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Внимание! Нет такого индекса!!!");
            System.out.println("Выводим весь список: ");
            for (int j : testExc) {
                System.out.println(j);
            }

        }
    }
}
