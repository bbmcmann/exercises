class Box{

    private double width;
    private double height;
    private double length;
    private double side;

    public Box(double width, double height, double length){

        this.width = width;
        this.height = height;
        this.length = length;

    }

    public Box(double side){

        this.side = side;

    }

    public double volume(){
        return width*height*length;
    }

    

}