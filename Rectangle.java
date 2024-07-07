class Rectangle implements Shape {
    private double width;
    private double height;
    private String fillColor;
    private String strokeColor;

    public Rectangle(double width, double height, String fillColor, String strokeColor) {
        this.width = width;
        this.height = height;
        this.fillColor = fillColor;
        this.strokeColor = strokeColor;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public double getArea() {
        return width * height;
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