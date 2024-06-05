abstract class Animal {
    abstract void run(int distance);
    abstract void swim(int distance);
}


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

public class Main {
    public static void main(String[] args) {
        Cat[] cats = new Cat[3];
        for (int i = 0; i < cats.length; i++) {
            cats[i] = new Cat();
            cats[i].eat(500000000);
        }

        for (Cat cat : cats) {
            System.out.println("Кот сыт: " + cat.isFull());
        }

        Dog dog = new Dog();
        dog.run(228);
        dog.swim(5);

        System.out.println("Количество созданных котов: " + Cat.getCount());
        System.out.println("Количество созданных собак: " + Dog.getCount());
        System.out.println("Количество созданных животных: " + (Cat.getCount() + Dog.getCount()));
    }
}
