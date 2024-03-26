package Figures;

public class Rectangle {
    private double a,b;

    private String name;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private double pole(double a, double b){return a*b;}

    private double obwod(double a, double b){return 2*a+2*b;}

    public void view(){
        System.out.format("Figura: %s, długość boku a: %.2f długość boku b: %.2f pole: %.2f, obwód: %.2f \n", name, a, b, pole(a,b), obwod(a,b));
    }
}
