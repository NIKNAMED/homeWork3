class Circle implements Shape {
    private double radius;
    private String fillColor;
    private String strokeColor;

    public Circle(double radius, String fillColor, String strokeColor) {
        this.radius = radius;
        this.fillColor = fillColor;
        this.strokeColor = strokeColor;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
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