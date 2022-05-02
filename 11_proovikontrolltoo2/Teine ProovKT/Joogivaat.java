package tund13;

public class Joogivaat {
    double ruumala ,liitrid, ajutine;
    Joogipudel j;
    public Joogivaat(double ruum, double liiter, Joogipudel i){
        ruumala = ruum;
        liitrid = liiter;
        j = i;
    }
    public double taitmine(){
        if (j.j.erikaal < j.maht){
            double vajalikvesi = j.maht - j.j.erikaal;
            liitrid = liitrid - vajalikvesi;
        }
        return liitrid;
    }


}
