public class Triangle {
    double a;
    double b;
    double c;

    Triangle(double a, double b, double c){
        if(a + b > c && a + c > b && b + c > a){
            this.a = a;
            this.b = b;
            this.c = c;
        }
        else{
            throw new RuntimeException("There is no figure with such parameters.");
        }
    }

    public Double Perimeter(){
        return (a + b + c);
    }
    public Double Square(){
        double p = (a+b+c)/2;
        return (Math.sqrt(p*(p-a)*(p-b)*(p-c)));
    }
}
