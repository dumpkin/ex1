public class Main {

    public static void main(String[] args) {
        System.out.println("Ex Class");
        System.out.println();


        Rectangle rectangle= new Rectangle(4,9);

        rectangle.height=5;
        rectangle.width=10;

        System.out.println("perimetr = "+(rectangle.width+rectangle.width)*2);
        System.out.println("square = "+rectangle.width*rectangle.width);

        Rectangle box= rectangle;
        System.out.println("perimetr = "+(rectangle.width+rectangle.width)*2);
        box=null;

       // Rectangle box2= new rectangle();







    }

}
