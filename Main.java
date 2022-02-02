package com.company;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random r = new Random();

        // Intro
        System.out.println("Esi sveicināts Riga Coding School!");
        System.out.println("Atbildi uz pāris jautājumiem, lai noskaidrotu, kura programmēšanas valoda ir tev piemērotākā!");
        System.out.println("");


        boolean exit = false;
        while(!exit) {
            // Pirmais jautājums
            System.out.println("1) Kāds ir tavs vārds?");
            String vards = scan.nextLine();
            System.out.println("Patīkami iepazīties, " + vards + "!");

            System.out.println("");

            // Otrais jautājums
            System.out.println("2) Cik tev ir gadu?");
            int vecums = scan.nextInt();
            if (vecums >= 18) {
                System.out.println("Ļoti labi, tavs vecums: " + vecums + " - esi gatavs uzsākt apmācības!");
            } else {
                System.out.println("Atvaino, bet mēs pieņemam studentus sākot no 18 gadu vecuma!");
                System.out.println("");
                scan.nextLine(); // break pēc nextInt
                continue;
            }

            System.out.println("");
            scan.nextLine(); // breaks pēc nextInt

            // Trešais jautājums (html , java, c#)
            while (true) {
                System.out.println("3) Kuru no programmēšanas valodām tu vēlētos apgūt? (html,java,c#)");
                String progmValoda = scan.nextLine();

                if (progmValoda.equalsIgnoreCase("html")) {
                    System.out.println("Loti labi, " + progmValoda + " ir laba valoda iesācējam!");
                    break;
                } else if (progmValoda.equalsIgnoreCase("java")) {
                    System.out.println("Loti labi, " + progmValoda + " ir laba valoda, lai taisītu Android aplikācijas!");
                    break;
                } else if (progmValoda.equalsIgnoreCase("c#")) {
                    System.out.println("Loti labi, " + progmValoda + " ir viena no pieprasītākajām valodām!");
                    break;
                } else {
                    System.out.println("Mēs tādu valodu nepiedāvājam! Izvēlies citu valodu!");
                }
            }

            System.out.println("");

            // Ceturtais jautājums
            System.out.println("4) Vai tev ir kāda pieredze programmēšana? (y,n)");
            String pieredze = scan.nextLine();

            if (pieredze.equalsIgnoreCase("y")) {
                System.out.println("Tev ir pieredze? Cik ilgi apmēram mēnešos? (1-24+)");
                int pieredzeMenesi = scan.nextInt();
                if (pieredzeMenesi <= 12) {
                    System.out.println("Pamats jau ir, iemācīsim tev vairāk!");
                } else if (pieredzeMenesi >= 13 && pieredzeMenesi <= 24) {
                    System.out.println("Hmm, tu jau daudz ko zināsi, bet palīdzēsim ar advanced tehnikām!");
                } else {
                    System.out.println("Ko tu te dari? Ej strādāt!");
                }
            } else {
                System.out.println("Mums patīk mācit no nullītes, būs jautri!");
            }

            System.out.println("");

            // Piektais jautājums
            System.out.println("5) Lai tiktu mūsu skolā , tev jābūt izredzētajam. Uzmini skaitli no 1 - 10.");

            int rndSkaitlis = r.nextInt(0, 10) + 1;
            System.out.println("Palīdzība: " + rndSkaitlis);
            System.out.println("");

            System.out.println("Ievadi savu minējumu: ");
            int minejums = scan.nextInt();

            if (rndSkaitlis == minejums) {
                System.out.println("Tu esi ticis mūsu skolā! Drīz ar tevīm sazināsimies!");
            } else {
                System.out.println("Galīgi garām... Nu vairs neko! Paldies, ka centies!");
            }

            System.out.println("");
            scan.nextLine(); // breaks pēc nextInt

            // Atkartot testu
            System.out.println("Vai vēlaties atkārtoti iziet testu? (y,n)");
            String atkartotaIzvele = scan.nextLine();
            if(atkartotaIzvele.equalsIgnoreCase("n")) {
                System.out.println("Paldies, tests ir pieņemts!");
                exit = true;
            }
            else {
                System.out.println("Atkārtojam testu no sākuma!");
                System.out.println("");
            }
        }









    }
}
