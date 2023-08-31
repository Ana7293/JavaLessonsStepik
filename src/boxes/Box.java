package boxes;

public class Box {
    public double length;
    public double width;
    public    double height;

    public Box() {this(10);}

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Box(double size) { //создает куб
        this(size, size, size);
    }

    public Box(Box another) {                                   //создаем копию коробки - второй(новый) объект,
        this(another.length, another.width, another.height);     //но с такими параметрами
    }

   /* public double getVolume() {                         //   метод вычисляет объем и возвращает значение типа double
        return length * width * height;
    }

    private void showVolume() {
        double volume = getVolume();
        System.out.println(volume);
    }

    private void setDimens(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
    private void compare(Box another) {
        double currentVolume = getVolume();
        double anotherVolume = another.getVolume();
        //int result;
        if (currentVolume > anotherVolume) {
            System.out.println("Коробка current больше, чем коробка another");
        } else if (currentVolume < anotherVolume) {
            System.out.println("Коробка current меньше, чем коробка another");
        } else {
            System.out.println("Коробка current равна коробке another");
        }
    }

  //  private Box copy () {  //создаем метод, который возвращает новый объект - копию текущего объекта (или указанного)
  //      return new Box(this.length, this.width, this.height);

 //   }

  //  public Box increase () {  //создаем метод, который возвращает новый объект
  //      return new Box(length * 2, width * 2, height * 2); // только размеры в 2 раза больше, чем у текущего объекта

 //   }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }



    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
*/
    public void showInfo (){
        System.out.println("Размеры коробки: " + length + " , " + width + " , " + height + ".");

    }

}
