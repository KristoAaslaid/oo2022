package tund12;



public class Pendel{
    double pikkus;
    public double vonkeperiood;
    Hammasratas pendlihammas;

    public Pendel(int alg_pikkus, Hammasratas hammas) {
        vonkeperiood = (2 * Math.PI * Math.sqrt(alg_pikkus/9.8));
        pikkus = alg_pikkus;
        pendlihammas = hammas;
    }

    public void Tiksu() {
        System.out.println("Pendel tiksub");
        pendlihammas.Liigu();
    }
}
