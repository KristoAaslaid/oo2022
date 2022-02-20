package Kodutööd;

import java.util.Scanner;

public class tund02_proov1 {
    public static void main(String[] args) {
        Scanner kasutaja = new Scanner(System.in);
        System.out.println("Kirjuta midagi ja saad teksti vastupidi:");
        String loe = kasutaja.nextLine();
        System.out.println(tund02_kodutoo.reverse(loe));
    }
}
