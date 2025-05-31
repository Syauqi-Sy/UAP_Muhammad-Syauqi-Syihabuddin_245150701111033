import java.util.Scanner;

public class main {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=============================================");
        System.out.println("Kalkulator Pabrik Donat Rumahan");
        System.out.println("Muhammad Syauqi Syihabuddin");
        System.out.println("245150701111033");
        System.out.println("=============================================");
        System.out.println("Donat dengan lubang");
        System.out.println("=============================================");
        System.out.print("Isikan Radius     : ");
        double r1 = input.nextDouble();
        System.out.print("Isikan radius     : ");
        double r2 = input.nextDouble();
        System.out.println("=============================================");
        Torus donatlubang = new Torus(r1, r2);
        donatlubang.printInfo();
        System.out.println("");
        System.out.println("=============================================");
        System.out.println("Donat tanpa lubang");
        System.out.println("=============================================");
        System.out.print("Isikan radius     : ");
        double r3 = input.nextDouble();
        System.out.println("=============================================");
        Sphere donatnirlubang = new Sphere(r3);
        donatnirlubang.printInfo();
        System.out.println("=============================================");
        input.close();
    }
}
