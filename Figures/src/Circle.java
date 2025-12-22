public class Circle {
    double r;

    Circle(double r){
        if(r > 0){
            this.r = r;
        }
        else{
            throw new RuntimeException("There is no figure with such parameters.");
        }
    }

    public Double Perimeter(){
        return (6.2830 * r);
    }
    public Double Square(){
        return (3.1415 * r * r);
    }
}
