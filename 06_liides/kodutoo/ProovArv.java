package tund06.kodutoo;

import java.io.IOException;
import java.util.Scanner;

public class ProovArv {
    public static void main(String[] args) throws IOException {
        Arvutamine ar = new Arvutamine();
        ar.JuhuslikArv();
        Scanner kasutaja = new Scanner(System.in);
        System.out.println("Programm valib suvalise arvu ja sa pead selle üles leidma.");
        while(true) {
            System.out.println("Paku arv: ");
            int loe = kasutaja.nextInt();
            if (loe == ar.arv) {
                ar.Oige();
                break;
            }
            if (loe < ar.arv) {
                ar.Suurem();
            }
            if (loe > ar.arv) {
                ar.Vaiksem();
            }
        }
    }
}
