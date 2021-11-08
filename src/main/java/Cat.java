public class Cat {
    private String name;
    private int appetite;
    private boolean hunger;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.hunger = false;
    }
    public boolean eat(Plate p) {
        if (getAppetite() > p.getFood()){
            System.out.println("Котику " + name + " Нужна миска больше");
            System.out.println(getHunger());
            return false;
        }
        p.decreaseFood(getAppetite());
        hunger = true;
        System.out.println("Котик " + name + " поел");
        System.out.println(getHunger());
        return true;
    }
    public int getAppetite() {
        return appetite;
    }

    public boolean getHunger() {
        return hunger;
    }
}