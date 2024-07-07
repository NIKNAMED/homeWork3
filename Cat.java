class Cat extends Animal {
    private static int count = 0;
    private boolean isFull = false;

    @Override
    void run(int distance) {
        if (distance <= 200) {
            System.out.println("Кот пробежал " + distance + " м.");
        } else {
            System.out.println("Кот не может пробежать такое расстояние");
        }
    }

    @Override
    void swim(int distance) {
        System.out.println("Кот не умеет плавать");
    }

    public Cat() {
        count++;
    }

    public static int getCount() {
        return count;
    }

    public void eat(int amount) {
        if (amount > 0) {
            isFull = true;
            System.out.println("Кот покушал");
        } else {
            System.out.println("В миске нет столько еды");
        }
    }

    public boolean isFull() {
        return isFull;
    }
}