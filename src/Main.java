import boxes.MyBox;
import inheritance.Cat;
import inheritance.Lion;
import inheritance.Rectangle;
import inheritance.Triangle;
import test.MyArrayList;
import test.Person;
import boxes.Box;

import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("----------");

        MyArrayList employers = getEmployers();
        employers.add("Виктория");
        employers.remove("Настя");
        employers.remove(1);
        for (int i = 0; i < employers.getSize(); i++) {
            System.out.println(employers.get(i));
        }

        System.out.println("----------");

        String ank = "Привет. Меня зовут Настя, мне 34 года.";
        String name = ank.substring(19, 24);
        String age = ank.substring(30, 32);
        // System.out.println(name);
        // System.out.println(age);
        int a = Integer.parseInt(age);
        System.out.println(a);
        Person workOne = new Person(name, a);
        workOne.getInfoPers(name, a);

        System.out.println("----------");

        ArrayList<Integer> numbers = new ArrayList<>();    //создаем список
        for (int i = 0; i <= 1000; i++) {                    //заполняем числами
            numbers.add(i);
        }
        for (int number : numbers) {
            System.out.println(number);                    //выводим в консоль
        }

        System.out.println("----------");

        ArrayList<Integer> simbs = new ArrayList<>();    //создаем список
        for (int i = 1; i <= 5; i++) {                    //заполняем числами
            simbs.add(i);
        }
        for (int simb : simbs) {
            System.out.println(simb);                    //выводим в консоль
        }

        System.out.println("----------");

        ArrayList<String> names = new ArrayList<>();    //создаем список
        names.add("Настя");          //заполняем строками
        names.add("Саша");
        names.add("Костя");
        names.add("Андрей");
        names.add("Тихон");
        for (String nam : names) {
            System.out.println(nam);                    //выводим в консоль
        }
        System.out.println("----------");

        ArrayList<String> inform = new ArrayList<>(); //создаем еще один список
        for (int i = 0; i < names.size(); i++) {
            inform.add(simbs.get(i) + " - " + names.get(i));       //заполняем числами + строками из предыдущих списков
        }
        for (String art : inform) {
            System.out.println(art);                    //выводим в консоль
        }

        System.out.println("----------");

        Cat catOne = new Cat();
        Lion lionOne = new Lion();
        System.out.println(catOne.isDangerous());
        System.out.println(lionOne.isDangerous());
        catOne.eat();
        lionOne.eat();

        System.out.println("----------");

        MyBox oneBox = new MyBox(6, 7.9, 4, 7.32);
        oneBox.showInfo();

        System.out.println("----------");

        Box twoBox = new Box(10);
        twoBox.showInfo();

        System.out.println("----------");

        Rectangle oneFig = new Rectangle(4,5);
        System.out.println(oneFig.getPerimetr());

        Triangle twoFig = new Triangle(1,2,3);
        System.out.println(twoFig.getPerimetr());

        System.out.println("----------");



    }

    private static MyArrayList getEmployers() {
        MyArrayList employers = new MyArrayList();
        employers.add("Настя");
        employers.add("Олеся");
        employers.add("Луиза");
        return employers;
    }


}