package inheritance;

public class CatFamily {
    protected int legs;
    protected int eyes;
   protected boolean dangerous;


    public CatFamily(int legs, int eyes, boolean dangerous) {
        this.legs = legs;
        this.eyes = eyes;
        this.dangerous = dangerous;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }

    public void setDangerous(boolean dangerous) {
        this.dangerous = dangerous;
    }

    public int getLegs() {
        return legs;
    }

    public int getEyes() {
        return eyes;
    }

    public boolean isDangerous() {
        return dangerous;
    }

    public void eat(){
        System.out.print("Я люблю покушать... ");
    }



}
