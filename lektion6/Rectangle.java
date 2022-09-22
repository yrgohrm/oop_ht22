public class Rectangle {
    private double height = 1.0;
    private double width = 2.0;
    private String color = "green";
    
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public void print() {
        System.out.printf("Rectangle[%f %f %s]%n", height, width, color);
    }
}
