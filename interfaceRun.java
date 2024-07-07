public class interfaceRun {

    public class Main2 {
        public static void main(String[] args) {
            Circle c = new Circle(5, "голубой", "нигга");
            Rectangle rectangle = new Rectangle(4, 6, "грин", "красный");
            Triangle triangle = new Triangle(3, 4, 5, "жёлтый", "розовый");

            System.out.println("Круг:");
            System.out.println("Периметр: " + c.getPerimeter());
            System.out.println("Площадь: " + c.getArea());
            System.out.println("Цвет заливки: " + c.getFillColor());
            System.out.println("Цвет обводки: " + c.getStrokeColor());

            System.out.println("Прямоугольник:");
            System.out.println("Периметр: " + rectangle.getPerimeter());
            System.out.println("Площадь: " + rectangle.getArea());
            System.out.println("Цвет заливки: " + rectangle.getFillColor());
            System.out.println("Цвет обводки: " + rectangle.getStrokeColor());

            System.out.println("Триугольник:");
            System.out.println("Периметр: " + triangle.getPerimeter());
            System.out.println("Area: " + triangle.getArea());
            System.out.println("Цвет заливки: " + triangle.getFillColor());
            System.out.println("Цвет заливки: " + triangle.getStrokeColor());
        }
    }
}
