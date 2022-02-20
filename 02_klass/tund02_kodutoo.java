package Kodutööd;

public class tund02_kodutoo {
    public static String reverse(String s) { // Funktsioon, annab vastupidise teksti
        String rev = ""; // rev muutuja
        for (int j = s.length(); j > 0; j--) { // j on teksti pikkus, --j arvu väärtus väheneb
            rev = rev + (s.charAt(j - 1)); // CharAT anna väärtus kindlast kohast
        }
        return rev;
    }

    public static String StringtoChar(String k) {
        String str = "";
        for (int i = 0; i < k.length(); i++) {
            char ch = k.charAt(i);
            System.out.println("Character kohal " + i + " Positsioon: " + ch);
        }
        return str;
    }
}