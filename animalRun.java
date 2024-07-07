public class animalRun {
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
}
