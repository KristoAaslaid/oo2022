package tund03_kodutoo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.io.*;

public class tund03_kirjutamine {
    public static void main(String[] args) throws Exception {
        Scanner kasutaja = new Scanner(System.in); // Kasutaja sisestab teksti
        System.out.println("Kirjuta '1' kui tahad 'String reverser' programmi või '2' kui tahad 'StringtoChar' programmi:");
        int loe = kasutaja.nextInt();
        if(loe==1) {
            Scanner kasutaja1 = new Scanner(System.in);
            System.out.println("Kirjuta midagi ja saad teksti vastupidi:");
            String loe1 = kasutaja1.nextLine();
            String vastupidi = tund03_kodutoo.reverse(loe1);
            System.out.println(tund03_kodutoo.reverse(loe1));
            System.out.println("Kahendsüsteemis: " + kahendsüsteem.StringtoBinary(vastupidi));
            PrintWriter pw1=new PrintWriter(new FileWriter("valjund.txt", true));
            pw1.println("Kasutaja: " + loe1);
            pw1.println("Programm: " + tund03_kodutoo.reverse(loe1));
            pw1.close();

        }
        if(loe==2) {
            Scanner kasutaja2 = new Scanner(System.in);
            System.out.println("Sisesta String ja programm väljastab character väärtused:");
            String loe2 = kasutaja2.nextLine();
            System.out.println(tund03_kodutoo.StringtoChar(loe2));
            //PrintWriter pw2=new PrintWriter(new FileWriter("valjund.txt", true));
            //pw2.println("Kasutaja: " + loe2);
            //List<String> read=new ArrayList<>(loe2);
            //pw2.println("Programm: " + read);
            //pw2.close();
        }
    }
}
