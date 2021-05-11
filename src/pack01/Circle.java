package pack01;

public class Circle {
    private double radius;
    private  String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Circle() {
        this.radius = 1.0;
        this.color = "red";
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double area(){
        double area = Math.PI*radius*radius;
        return area;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                " area = " + area() +
                '}';
    }
}
 class Cylinder extends Circle{
    private double height;
    public Cylinder(){
        this.height = 1.0;
    }

     public Cylinder(double radius1, String color, double height) {
         super(radius1, color);
         this.height = height;
     }
     public Cylinder( double height) {
         this.height = height;
     }

     public double getHeight() {
         return height;
     }

     public void setHeight(double height) {
         this.height = height;
     }
     public double volume(){
        double volume = area()*this.height;
        return volume;
     }

     @Override
     public String toString() {
         return " Cylinder {" +
                 " color = " + getColor()+
                 " height= " + height +
                 " radius = " + getRadius()+
                 " area = " + area()+
                 " volume =" + volume() +
                 '}';
     }
 }

class Test{
    public static void main(String[] args) {
        Cylinder obj1 = new Cylinder(2.0,"blue",5.0);
        System.out.println(obj1);
        obj1.setRadius(5.0);
        obj1.setColor("red");
        System.out.println(obj1);
    }
}
