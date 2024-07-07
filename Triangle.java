class Triangle implements Shape {
    private double side1;
    private double side2;
    private double side3;
    private String fillColor;
    private String strokeColor;

    public Triangle(double side1, double side2, double side3, String fillColor, String strokeColor) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.fillColor = fillColor;
        this.strokeColor = strokeColor;
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public double getArea() {
        double semiperimeter = getPerimeter() / 2;
        return Math.sqrt(semiperimeter * (semiperimeter - side1) * (semiperimeter - side2) * (semiperimeter - side3));
    }

    @Override
    public String getFillColor() {
        return fillColor;
    }

    @Override
    public String getStrokeColor() {
        return strokeColor;
    }
}
