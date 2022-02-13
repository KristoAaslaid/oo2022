import java.util.Scanner;

public class Koolitoo_funktsioon {
    public static String reverse(String s) { // Funktsioon
        String rev=""; // rev muutuja
        for(int j=s.length();j>0;j--) { // j on teksti pikkus, --j arvu väärtus väheneb
            rev=rev + (s.charAt(j-1)); // CharAT anna väärtus kindlast kohast
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner kasutaja = new Scanner(System.in); // Kasutaja sisestab teksti
        System.out.println("Kirjuta midagi ja saad teksti vastupidi:");
        String loe = kasutaja.nextLine();  // Loeb kasutaja sisestatud teksti
        System.out.println(reverse(loe));  // Prindib vastupidist teksti
    }
}

// Näide:
// Kirjuta midagi ja saad teksti vastupidi:
// Mandariin
// niiradnaM
