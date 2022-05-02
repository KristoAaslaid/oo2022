package tund12;


public class Pendel_eksemplar {
    public static void main(String[] args) throws InterruptedException {
        Hammasratas klassratas = new Hammasratas(35, 25, "esimene");
        Pendel klass1 = new Pendel(25, klassratas);
        int ooteaeg = (int)(klass1.vonkeperiood * 25);
        System.out.println(klassratas.hammaste_arv1);
        System.out.println(klass1.vonkeperiood);
        while (true) {
            Thread.sleep(ooteaeg);
            klass1.Tiksu();
        }
    }
}
