package Running;

import Figures.*;

public class Run {

    Input input = new Input();
    public void running(){
        int wybor;
        while(true){
            Menu();//menu programu
            wybor = input.inputInt();//metoda do wczytania int
            switch(wybor){
                case 1 -> viewCircle();
                case 2 -> viewSquare();
                case 3 -> viewRectangle();
                case 4 -> viewCube();
                case 5 -> viewCuboid();
                case 6 -> viewOrb();
                case 7 -> viewCone();
                default -> defaultInstruction();
            }//koniec switch
        }//koniec while
    }//koniec run

    private void defaultInstruction() {
        System.out.println("Błędne dane, koniec programu");
        System.exit(0);
    }

    private void Close(){
        System.out.println("Czy na pewno chcesz wyjść? t || T");
        String znak = input.inputChar();
        String str1 = "t", str2 = "T";
        if (znak.equals(str1) || znak.equals(str2)) {
            System.exit(0);
        }
    }
    private void viewCircle(){
        System.out.println("Podaj r ");
        double r = input.inputDouble();
        Circle circle = new Circle();
        circle.setName("Koło");
        circle.setR(r);
        circle.view();
    }

    private void viewSquare(){
        System.out.println("Podaj a ");
        double a = input.inputDouble();
        Square square = new Square();
        square.setName("Kwadrat");
        square.setA(a);
        square.view();
    }

    private void viewRectangle(){
        System.out.println("Podaj a ");
        double a = input.inputDouble();
        System.out.println("Podaj b ");
        double b = input.inputDouble();
        Rectangle rectangle = new Rectangle();
        rectangle.setName("Prostokąt");
        rectangle.setA(a);
        rectangle.setB(b);
        rectangle.view();
    }

    private void viewCube(){
        System.out.println("Podaj a ");
        double a = input.inputDouble();
        Cube cube = new Cube();
        cube.setName("Sześcian");
        cube.setA(a);
        cube.view();
    }

    private void viewCuboid(){
        System.out.println("Podaj a ");
        double a = input.inputDouble();
        System.out.println("Podaj b ");
        double b = input.inputDouble();
        System.out.println("Podaj c ");
        double c = input.inputDouble();
        Cuboid cuboid = new Cuboid();
        cuboid.setName("Prostopadłościan");
        cuboid.setA(a);
        cuboid.setB(b);
        cuboid.setC(c);
        cuboid.view();
    }

    private void viewOrb(){
        System.out.println("Podaj r ");
        double r = input.inputDouble();
        Orb orb = new Orb();
        orb.setR(r);
        orb.setName("Kula");
        orb.view();
    }

    private void viewCone(){
        System.out.println("Podaj r ");
        double r = input.inputDouble();
        System.out.println("Podaj l ");
        double l = input.inputDouble();
        Cone cone = new Cone();
        cone.setR(r);
        cone.setL(l);
        cone.setName("Stożek");
        cone.view();
    }
    private void Menu(){
        System.out.println("Kalkulator figur geometrycznych");
        System.out.println("1. Koło");
        System.out.println("2. Kwadrat");
        System.out.println("3. Prostokąt");
        System.out.println("4. Sześcian");
        System.out.println("5. Prostopadłościan");
        System.out.println("6. Kula");
        System.out.println("7. Stożek");
        System.out.println("8. Wyjście");

        System.out.println("\n\nWybierz opcje:");
    }
}
