public class Rectangle {

    public int width;
    public int height;

    public double findArea(int width, int height){

        this.width = width;
        this.height = height;
        return height*width*(0.5);
    }

    public double findPerimeter(int width, int height){

        this.width = width;
        this.height = height;
        return 100;
    }

    public void display(){
        System.out.println("Width: "+width);
        System.out.println("Height: "+height);
        System.out.println("Area: "+ findArea(width,height));
        System.out.println("Perimeter: "+findPerimeter(width,height));

    }
}
