package test;

public class MyArrayList {
    private String[] array = new String[10];
    private int size = 0;


    public String get(int index){
        return array[index];
    }

    public void add(String element) {
        array[size] = element;
        size++;
        if (size == array.length) {
            String[] newArray = new String[array.length * 2];   //создаем новый массив в 2 раза больше
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];                     //копируем все элементы из старого массива
            }
            array = newArray;
        }
    }

    public void remove(int index) {
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        array[size] = null;
        size--;
    }

    public void remove(String element) {
        for (int i = 0; i < size; i++) {
            if (element.equals(array[i])){
                remove(i);
                return;
            }
        }
    }

    public int getSize() {
        return size;
    }
}
