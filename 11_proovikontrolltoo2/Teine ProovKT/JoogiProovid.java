package tund13;

public class JoogiProovid {
    public static void main(String[] args) throws InterruptedException {
        Jook proovJook = new Jook("Sprite", 2.50, 2);
        Jook proovJook2 = new Jook("Coca-Cola", 1.50, 1.5);
        Joogipudel proovPudel = new Joogipudel("5-liitrine", 5, 0.5, 0.5, proovJook);
        Joogipudel proovPudel2 = new Joogipudel("8-liitrine", 8, 0.5, 0.5, proovJook2);
        Joogivaat proovVaat = new Joogivaat( 16, 10, proovPudel);
        System.out.println("Pudelimass: " + proovPudel.Pudelimass());
        System.out.println("Omahind: " + proovPudel.Omahind());
        System.out.println("Vaadis on alles: " + proovVaat.taitmine() + " liitrit");
    }
}
