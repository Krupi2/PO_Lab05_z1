package Figures;

public class Cuboid {
    private double a,b,c;

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

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private double ppc(double a, double b, double c){return 2*a*b+2*b*c+2*a*c;}

    private double volume(double a, double b, double c){return a*b*c;}

    public void view(){
        System.out.format("Figura: %s, długość boku a: %.2f długość boku b: %.2f długość boku c: %.2f pole powierzchni całkowitej: %.2f, objętość: %.2f \n", name, a, b, c, ppc(a,b,c), volume(a,b,c));
    }
}
