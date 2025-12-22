//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Circle a = new Circle(5);
        System.out.println("Периметр круга: " + a.Perimeter());
        System.out.println("Площадь круга: " + a.Square());

        System.out.println("---------------------");

        Rectangle b = new Rectangle(5,4);
        System.out.println("Периметр прямоугольника: " + b.Perimeter());
        System.out.println("Площадь прямоугольника: " + b.Square());

        System.out.println("---------------------");

        Triangle c = new Triangle(5,4, 3);
        System.out.println("Периметр треугольника: " + c.Perimeter());
        System.out.println("Площадь треугольника: " + c.Square());

        System.out.println("---------------------");
    }
}