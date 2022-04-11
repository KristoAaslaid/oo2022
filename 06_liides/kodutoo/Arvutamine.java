package tund06.kodutoo;

public class Arvutamine implements ArvutamiseMang {
    int arv;
    final int lopp=100;
    public void JuhuslikArv(){
        arv=(int)(lopp*Math.random());
    }
    public void Vaiksem(){
        System.out.println("Otsitav arv on väiksem!");
    }
    public void Suurem(){
        System.out.println("Otsitav arv on suurem!");
    }
    public void Oige(){
        System.out.println("Leidsid arvu!");
    }
}
