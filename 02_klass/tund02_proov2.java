package Kodutööd;

import java.util.Scanner;

public class tund02_proov2 {
    public static void main(String[] args) {
        Scanner kasutaja = new Scanner(System.in);
        System.out.println("Sisesta String ja programm väljastab character väärtused:");
        String loe = kasutaja.nextLine();
        System.out.println(tund02_kodutoo.StringtoChar(loe));
    }
}
