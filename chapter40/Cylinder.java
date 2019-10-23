public class Cylinder{

    private double height;
    private double radius;

    public Cylinder(double radius, double height){
        this.height = height;
        this.radius = radius;
    }

    public double volume(){ // needs to be changed
        return (2*Math.PI*radius*radius) + (2*Math.PI*radius*height);
    }

    public double surfaceArea(){
        return Math.PI*radius*radius*height;
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