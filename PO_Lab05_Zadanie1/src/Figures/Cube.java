package Figures;

public class Cube {
    private double a;

    private String name;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private double ppc(double a){return 6*a;}

    private double volume(double a){return a*a*a;}

    public void view(){
        System.out.format("Figura: %s, długość boku: %.2f pole powierzchni całkowitej: %.2f, objętość: %.2f \n", name, a, ppc(a), volume(a));
    }
}
