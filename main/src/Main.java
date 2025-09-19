import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //paros szamok osszege

        /*9Scanner scn = new Scanner(System.in);
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
        */
        //nyeremeny jatek

        /*Scanner scn = new Scanner(System.in);
        System.out.println("adj szamot");
        int csoki = scn.nextInt();

        boolean prim = true;
        for (int i = 2; i < csoki; i++){
            if(scoki % i == 0){
                prim = false;
                break;
            }
        }
        if (prim){
            System.out.println("Gratulálunk nyert");
        }
        else {
            System.out.println("nem nyert");
        }*/

        //gyakorlati jegy

        /*Scanner scn = new Scanner(System.in);
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
        }*/

        //szorzotabla



        //osztondij
        Scanner scn = new Scanner(System.in);

        System.out.println("Jegyek száma: ");
        int numOfGrade = scn.nextInt();
        
        double sum = 0;
        double avg = 0;

        System.out.println("ajda meg a jegyeket: ");
        for(int i = 1; i <= numOfGrade; i++){
            sum += scn.nextInt();
        }
        avg = sum / numOfGrade;

        if(avg >= 4.0){
            System.out.println("a jegyek átlaga: " + avg);
            System.out.println("On jogosult az osztondijra");
        }
        else {
            System.out.println("a jegyek átlaga: " + avg);
            System.out.println("A hallgato nem jogosult osztondijra");
        }

    }

}