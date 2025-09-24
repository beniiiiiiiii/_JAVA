import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        //szorzotabla
        for (int i = 1; i <= 10; i++) {
            System.out.print("");
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%3d", i * j);
            }
            System.out.println();
        }
        System.out.println("<---------------------------------------------------------->");

        //haromszo
        Scanner scn = new Scanner(System.in);
        System.out.println("Adja meg a haromszog elso oldalat: ");
        int a = scn.nextInt();
        System.out.println("Adja meg a haromszog masodik oldalat: ");
        int b = scn.nextInt();
        System.out.println("Adja meg a haromszog harmadik oldalat: ");
        int c = scn.nextInt();

        if (a + b > c || a + c > b || b + c > a){
            System.out.println("A megadott szakaszok alkothatnak háromszöget.");
            }
        else {
            System.out.println("A megadott szakaszok nem alkothatnak háromszöget.");
        }

        //paros szamok osszege
        System.out.println("Adja meg az intervallum alsó végpontját: ");
        int also = scn.nextInt();
        System.out.println("Adja meg az intervallum felso végpontját: ");
        int felso = scn.nextInt();

        int osszeg = 0;

        for(int i = also; i <= felso; i++){
            if (i % 2 == 0){
                osszeg += i;
            }
        }

        System.out.print(String.format("A(z) [%d : %d] intervallumba eso paros szamok osszege: %d", also, felso, osszeg));

        //nyeremenyjatek

        System.out.println("adj szamot");
        int csoki = scn.nextInt();

        boolean prim = true;
        for (int i = 2; i < csoki; i++){
            if(csoki % i == 0){
                prim = false;
                break;
            }
        }
        if (prim){
            System.out.println("Gratulálunk nyert");
        }
        else {
            System.out.println("nem nyert");
        }

        //gyakorlati jegy
        System.out.print("adja meg a pontszámát: ");
        int pont = scn.nextInt();

        if (pont <= 100 && pont >= 85) {
            System.out.println("A pontszámod: " + pont);
            System.out.println("Az érdemjegyed: Jeles (5)");
        } else if (pont <= 84 && pont >= 70) {
            System.out.println("A pontszámod: " + pont);
            System.out.println("Az érdemjegyed: Jó (4)");
        } else if (pont <= 69 && pont >= 55) {
            System.out.println("A pontszámod: " + pont);
            System.out.println("Az érdemjegyed: Közepes (3)");
        } else if (pont <= 54 && pont >= 40) {
            System.out.println("A pontszámod: " + pont);
            System.out.println("Az érdemjegyed: Elégséges (2)");
        } else if (pont <= 39 && pont >= 0) {
            System.out.println("A pontszámod: " + pont);
            System.out.println("Az érdemjegyed: Elégtelen (1)");
        } else if (pont > 100 || pont<0) {
            System.out.println("Hibás pontszám");
        }
    }
}