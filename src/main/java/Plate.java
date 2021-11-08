public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
        increaseFood(50);
    }
    public void increaseFood (int n) {
        food = getFood() + n;
    }
    public void decreaseFood(int n) {
        food = getFood() - n;
    }
    public void info() {
        System.out.println("plate: " + food);
    }

    public void setFood(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }
}