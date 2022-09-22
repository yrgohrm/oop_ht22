public class Rectangle2 {
    private double height;
    private double width;
    private String color;

    public Rectangle2(double height, double width) {
        this.height = height;
        this.width = width;
        this.color = "marineblue";
    }

    public Rectangle2(double length) {
        this(length, length);
    }

    public Rectangle2(String color) {
        if ("blue".equals(color)) {
            this.height = 99;
        }
        else {
            this.height = 12;
        }

        this.width = 12;
        this.color = color;
    }
    


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
