public class Cone{

    private double height;
    private double radius;

    public Cone(double radius, double height){
        this.height = height;
        this.radius = radius;
    }

    public double area(){
        return Math.PI*radius*(radius + Math.sqrt(height*height + radius*radius) );
    }

    public double volume(){
        return Math.PI*radius*radius*height/3.0;
    }

    public double slantheight(){
        return squrt((radius * radius) + (height * height));
    }

    public double angle(){
        return Math.atan(radius/height);
    }

    public void setHeight(){
        this.height = height;
    }

    public void setRadius(){
        this.radius = radius;
    }

    public double getHeight(){
        return this.height;
    }

    public double getRadius(){
        return this.radius;
    }

}