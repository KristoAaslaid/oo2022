package tund05_kontrolltöö;

public class Akvaarium {
    double pikkus, laius, korgus, veehulk, ajutine;

    public Akvaarium(double xpikkus, double xlaius, double xkorgus, double xveehulk) {
        pikkus = xpikkus;
        laius = xlaius;
        korgus = xkorgus;
        veehulk = xveehulk;
    }

    @Override
    public String toString() {
        return "Akvaariumi pikkus " + pikkus + ", laius " + laius + ", kõrgus " + korgus + " ja vett on " + veehulk + " liitrit";
    }

    public double ruumala() {
        return pikkus * laius * korgus;
    }

    public double lisavett(double lisavesi) {
        if (lisavesi < ruumala()) {
            veehulk = veehulk + lisavesi;
            return veehulk;
        } else {
            System.out.println("Ei saanud lisada nii palju vett");
            return veehulk;
        }
    }

    public double kuipaljuvett() {
        return veehulk;
    }

    public double veevalamine() {
        veehulk = veehulk - ajutine;
        if(veehulk <= 0){
            System.out.println("Ei saanud nii palju vett võtta");
            return veehulk;
        }
        if(ajutine > veehulk){
            System.out.println("Ei saanud nii palju vett võtta");
            return ajutine;
        }
        else {
            return veehulk;
        }
    }

    public double votavett(double lisavesi) {
        if (lisavesi < ruumala()) {
            veehulk = veehulk + lisavesi;
            ajutine = lisavesi;
            return veehulk;
        }
        if ((lisavesi + veehulk) > ruumala()){
            System.out.println("Ei saanud lisada nii palju vett");
            return veehulk;
        }
        else {
            System.out.println("Ei saanud lisada nii palju vett");
            return veehulk;
        }
    }

    public String hoiatus() {
        if (veehulk >= ruumala() - 2) {
            String hoiatus;
            return hoiatus = ", akvaariumi servani on vähem kui 2 sentimeetrit!";
        }
        else{
            String tühi;
            return tühi = "";
        }
    }
}