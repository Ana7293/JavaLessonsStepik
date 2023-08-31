package workers;

import interfaces.AbleToRun;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Director director = new Director();
        Programmer programmer = new Programmer();
        Cook cook = new Cook();

        ArrayList<Worker> workers = new ArrayList<>();  //тип имя интерфейса
      //  workers.add(director);
        workers.add(programmer);
        workers.add(cook);
        for (Worker sotr : workers) {
            sotr.work();
        }

        System.out.println("----------");

        Driver driver1 = new Programmer();
        Driver driver2 = new Cook();
        driver1.drive();
        driver2.drive();

        System.out.println("----------");

        Director director2 = new Director();
     //   Cook cook2 = new Cook();
      //  director2.force(cook2);
        director2.force(new Worker() {            //Создаем анонимный класс!
            @Override                            //переопред.все методы
            public void work() {
                System.out.println("Приходиться работать!");  //дополняем
            }
        });


    }
}
