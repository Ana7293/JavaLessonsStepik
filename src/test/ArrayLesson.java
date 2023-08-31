package test;

public class ArrayLesson {
    public static void main(String[] args) {

        String[] workers = getWorkers();  //получаем список сотрудников из метода

        String[] newWorkers = new String[workers.length + 1];  //если нужно добавить нового сотрудника
        for (int i = 0; i < workers.length; i++) {             //создаем новый массив на 1 ячейку больше
            newWorkers[i] = workers[i];                     //копируем все элементы из старого массива
        }
        newWorkers[newWorkers.length - 1] = "Олеся";       //вносим имя нового сотрудника в новую ячейку нового массива
        workers = newWorkers;                              // значение нового массива присваиваем в старую переменную

        newWorkers[0] = null;         //если нужно удалить какого-то сотрудника(у нас в ячейке 0, те Настю), но ячейку пустую оставить

        String[] newWorkers2 = new String[workers.length-1];  //если нужно удапить сотрудника
        for (int i = 0, j = 0; i < workers.length; i++) {             //и уменьшить размер на 1 ячейку, где пусто
            String work = workers[i];
            if (work != null) {
                newWorkers2[j] = work;                    //копируем все элементы из старого массива, кроме null
            j++;
            }
        }

        workers = newWorkers2;                  // значение нового (без насти) массива присваиваем в старую переменную

        System.out.println("Список всех работников:"); //с помощью цикла выводим всех сотрудников
        for (String worker : workers) {
            System.out.println(worker);
        }




    }

    private static String[] getWorkers() {   //метод который возвращает список сотрудников -
        String[] workers = new String[5];    // в нашем случае нельзя изменять данный метод
        workers[0] = "Настя";
        workers[1] = "Дима";
        workers[2] = "Андрей";
        workers[3] = "Света";
        workers[4] = "Тихон";
        return workers;
    }


}
