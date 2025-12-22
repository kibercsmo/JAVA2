public class Rectangle {
    double a;
    double b;

    Rectangle(double a, double b){
        if(a > 0 && b > 0){
            this.a = a;
            this.b = b;
        }
        else{
            throw new RuntimeException("There is no figure with such parameters.");
        }
    }

    public Double Perimeter(){
        return (2 * a + 2 * b);
    }
    public Double Square(){
        return (a * b);
    }
}
