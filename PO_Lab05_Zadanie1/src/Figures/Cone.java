package Figures;

public class Cone {
    private double r,l;

    private String name;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getL() {
        return l;
    }

    public void setL(double l) {
        this.l = l;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private double ppc(double r, double l){return Math.PI*r*(l+r);}

    private double volume(double r){return (Math.PI*r*r)/3;}

    public void view(){
        System.out.format("Figura: %s, promień podstawy: %.2f, tworząca stożka: %.2f, pole powierzchni całkowitej: %.2f, objętość: %.2f \n", name, r, l, ppc(r,l), volume(r));
    }
}
