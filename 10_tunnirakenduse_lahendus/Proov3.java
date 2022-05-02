package tund09;

public class Proov3 {
    public static void main(String[] arg){
        SamaTyypiPaar<Integer> asukoht=new SamaTyypiPaar<>();
        asukoht.esimene=7;
        asukoht.teine=4;
        System.out.println(asukoht.esimene);
        System.out.println(asukoht.toString());
        //Looge objekt inimese ees- ja perekonnanime tarbeks. Käivitage ja katsetage
        SamaTyypiPaar<String> based=new SamaTyypiPaar<>();
        based.esimene="Karl";
        based.teine="Ubina";
        System.out.println(based.esimene);
        System.out.println(based.toString());
    }
}
