public class main {
    public static void main(String[] args) {
        Cat[] catArray = new Cat[5];
        Plate plate = new Plate(100);
        catArray[0] = new Cat("Жан", 90);
        catArray[1] = new Cat("Мурзик", 12);
        catArray[2] = new Cat("Шизик", 20);
        catArray[3] = new Cat("Алекс", 10);
        catArray[4] = new Cat("Альфред", 30);
        plate.info();
        for (int i = 0; i < catArray.length; i++) {
            catArray[i].eat(plate);
        }
        plate.info();
    }
}
