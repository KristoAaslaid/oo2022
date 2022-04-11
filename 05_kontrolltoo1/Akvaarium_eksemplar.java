package tund05_kontrolltöö;

public class Akvaarium_eksemplar {
    public static void main(String[] args) {
        Akvaarium klass1 = new Akvaarium(2, 6, 8, 0);
        Akvaarium klass2 = new Akvaarium(5, 8, 14, 0);
        klass1.lisavett(45);
        klass2.lisavett(123);
        klass1.votavett(50);
        klass2.ajutine = klass1.ajutine;
        klass2.veevalamine();
        System.out.println("Esimese akvaariumi ruumala " + klass1.ruumala());
        System.out.println("Teise akvaariumi ruumala " + klass2.ruumala());
        System.out.println("Esimeses akvaariumis on " + klass1.kuipaljuvett() + " liitrit" + klass1.hoiatus());
        System.out.println("Teises akvaariumis on " + klass2.kuipaljuvett() + " liitrit" + klass2.hoiatus());


    }
}
