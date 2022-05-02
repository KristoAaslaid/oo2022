package tund13;



public class Joogipudel{
    double maht, mass, taara_maksumus;
    String pudelituup;
    public Jook j;

    public Joogipudel(String tuup, double mahtx, double massx, double maksumus, Jook i){
        pudelituup = tuup;
        maht = mahtx;
        mass = massx;
        taara_maksumus = maksumus;
        j = i;
    }


    public double Pudelimass(){
        double pudelimass = mass + j.erikaal;
        return pudelimass;
    }
    public double Omahind(){
        double omahind = j.liitrihind - taara_maksumus;
        return omahind;
    }

}
