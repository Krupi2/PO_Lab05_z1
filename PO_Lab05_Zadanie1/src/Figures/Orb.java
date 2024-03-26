package Figures;

public class Orb {

    private double r;

    private String name;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private double ppc(double r){return 4*Math.PI*r*r;}

    private double volume(double r){return (4*Math.PI*r*r*r)/3;}

    public void view(){
        System.out.format("Figura: %s, promień: %.2f pole powierzchni całkowitej: %.2f, objętość: %.2f \n", name, r, ppc(r), volume(r));
    }
}
