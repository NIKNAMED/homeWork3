class Dog extends Animal {
    private static int count = 0;

    @Override
    void run(int distance) {
        if (distance <= 500) {
            System.out.println("Собака пробежала " + distance + " метров ");
        } else {
            System.out.println("Собака не может пробежать такое расстояние");
        }
    }

    @Override
    void swim(int distance) {
        if (distance <= 10) {
            System.out.println("Собака проплыла " + distance + " метров");
        } else {
            System.out.println("Собака не может проплыть такое расстояние");
        }
    }

    public Dog() {
        count++;
    }

    public static int getCount() {
        return count;
    }
}