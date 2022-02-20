package Kodutööd;

import java.util.Scanner;

public class tund02_proov3 {
    public static void main(String[] args) {
        Scanner kasutaja = new Scanner(System.in); // Kasutaja sisestab teksti
        System.out.println("Kirjuta '1' kui tahad 'String reverser' programmi või '2' kui tahad 'StringtoChar' programmi:");
        double loe = kasutaja.nextDouble();
        if(loe==1) {
            Scanner kasutaja1 = new Scanner(System.in);
            System.out.println("Kirjuta midagi ja saad teksti vastupidi:");
            String loe1 = kasutaja1.nextLine();
            System.out.println(tund02_kodutoo.reverse(loe1));
        }
        if(loe==2) {
            Scanner kasutaja2 = new Scanner(System.in);
            System.out.println("Sisesta String ja programm väljastab character väärtused:");
            String loe2 = kasutaja2.nextLine();
            System.out.println(tund02_kodutoo.StringtoChar(loe2));
        }
    }
}
