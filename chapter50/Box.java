class Box{

    private double width;
    private double height;
    private double length;
    private double side;
    private boolean cube;       //to know what constructor was used in main

    public Box(double width, double height, double length){

        this.width = width;
        this.height = height;
        this.length = length;
        this.cube = false;

    }

    public Box(double side){

        this.side = side;
        this.cube = true;

    }

    public double getLength(){
        if(cube){
            return side;
        }
        return this.length;
    }

    public double getHeight(){
        if(cube){
            return side;
        }
        return this.height;
    }

    public double getWidth(){
        if(cube){
            return side;
        }
        return this.width;
    }

    public double surfaceArea(){
        return (facePairArea(width, height)) + (facePairArea(height, length)) + (facePairArea(length, width));
    }

    public double volume(){
        if(cube){
            return side*side*side;
        }
        return width*height*length;
    }

    public String toString(){
        return "SA: " + surfaceArea() + "\n" + "Volume: " + volume() + "\n" + "Length: " + length + " Width: " + width + " Height: " + height;
    }

    private double facePairArea(double s1, double s2){
        return s1 * s2 * 2;
    }
    

}