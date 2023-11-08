// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //Q1
        Book b1 = new Book("math",100,"hamad");
        System.out.println("the price: "+b1.getPrice() );
        //after discount
        System.out.println("the price after 20% discount:"+b1.getDiscount());

        Movie m1 = new Movie("titanic",70,"james");

        System.out.println("the price: "+m1.getPrice());
        System.out.println("the price after 50% discount: "+m1.getDiscount());

        System.out.println("-------------------------------------------------------");


        //Q2
        MovablePoint mv = new MovablePoint(10,20,5,9);
        System.out.println(mv.toString());
        mv.moveDown();
        mv.moveLeft();
        System.out.println(mv.toString());
        mv.moveUp();
        mv.moveUp();
        System.out.println(mv.toString());
        mv.moveRight();
        System.out.println(mv.toString());


    }
}