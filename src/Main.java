public class Main {
    public static void main(String[] args) {
        System.out.println("Poligonul!");

        Square square=new Square();
        Circle circle= new Circle();
        Polygon pSquare =new Square();
        Polygon pCircle =new Circle();


        square.render();
        circle.render();
        pSquare.render();
        pCircle.render();


    }
}