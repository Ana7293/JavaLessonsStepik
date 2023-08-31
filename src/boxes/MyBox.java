package boxes;

public class MyBox extends Box {
    public double weight;

    public MyBox() {
        this.weight = 10;
    }

    public MyBox(double length, double width, double height, double weight) {
        super(length, width, height);
        this.weight = weight;
    }

    public MyBox(double size, double weight) {
        super(size);
        this.weight = weight;
    }

    public MyBox(Box another, double weight) {
        super(another);
        this.weight = 10;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("вес коробки: " + weight);

    }
}


