public class Rectangle extends Shape {
    protected double width, length;

    public Rectangle(){
        this.filled = false;
        this.color = "green";
        width = 1;
        length = 2;
    }

    public Rectangle(double width,double length){
        this.filled = false;
        this.color = "green";
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled){
        this.width = width;
        this.color = color;
        this.filled = filled;
        this.length = length;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public boolean isFilled() {
        return false;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        return "Shape: rectangle, width: "+this.width+", length: "+this.length+", color: "+this.color;
    }
}
