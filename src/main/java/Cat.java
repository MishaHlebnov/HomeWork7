public class Cat {
    private String name;
    private int appetite;
    private int hunger;
    private int satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.hunger = appetite;
    }
    public boolean eat(Plate p) {
        if (getAppetite() > p.getFood()){
            System.out.println("Котику " + name + " Нужна миска больше");
            return false;
        }
        p.decreaseFood(getAppetite());
        System.out.println("Котик " + name + " поел");
        cat_Hunger();
        return true;
    }

    public void cat_Hunger (){
        satiety = getHunger();
        System.out.println(true);
    }

    public int getAppetite() {
        return appetite;
    }

    public int getHunger() {
        return hunger;
    }
}