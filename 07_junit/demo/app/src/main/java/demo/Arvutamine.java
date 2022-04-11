package demo;

import java.io.IOException;
import java.util.Scanner;

class Arvutamine implements ArvutamiseMang {
    final int lopp=100;
    int arv = -1;
    public int JuhuslikArv(){
        return (int)(lopp*Math.random());
    }
    public void Vaiksem(){
        System.out.println("Otsitav arv on väiksem!");
        KordadeArv();
    }
    public void Suurem(){
        System.out.println("Otsitav arv on suurem!");
        KordadeArv();
    }
    public void Oige(){
        System.out.println("Leidsid arvu!");
        KordadeArv();
    }
    public int KordadeArv(){
        arv++;
        return arv;
    }

    public static void main(String[] args) throws IOException {
        Arvutamine ar = new Arvutamine();
        int juhuslik = ar.JuhuslikArv();
        Scanner kasutaja = new Scanner(System.in);
        System.out.println("Programm valib suvalise arvu ja sa pead selle üles leidma.");
        while(true) {
            System.out.println("Paku arv: ");
            int loe = kasutaja.nextInt();
            if (loe == juhuslik) {
                ar.Oige();
                int mitukorda = ar.KordadeArv();
                System.out.println("Vastuse leidmiseni läks " + mitukorda + " proovi!");
                break;
            }
            if (loe < juhuslik) {
                ar.Suurem();
            }
            if (loe > juhuslik) {
                ar.Vaiksem();
            }
        }
    }
}