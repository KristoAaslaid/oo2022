package tund09;

public class Proov7 {
    public static void main(String[] args){
        Arvutaja<String, String> a=new Puhverdaja(new EsitaheLeidja());
        System.out.println(a.f("Tere"));
        System.out.println(a.f("Tere"));
        System.out.println(a.f("kere"));
        System.out.println(((Puhverdaja)a).puhver);
    }
}