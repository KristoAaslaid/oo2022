package tund12;

public class Hammasratas {
    double hammaste_arv1;
    double hammaste_arv2;
    int hetkehammas1;
    int hetkehammas2;
    int teine_ratas;
    int esimene_ratas = 1;
    String nimetus;
    public Hammasratas(double antud_hammaste_arv1, double antud_hammaste_arv2, String nimetus) {
        hammaste_arv1 = antud_hammaste_arv1;
        hammaste_arv2 = antud_hammaste_arv2;
        hetkehammas1 = 1;
        hetkehammas2 = 1;
    }

    public void Liigu() {
        hetkehammas1 += 1;

        if (hetkehammas1 > hammaste_arv1) {
            hetkehammas1 = 1;
        }
        if (hetkehammas1 % 10 == 0) {
            esimene_ratas += 1;
            System.out.println("Esimene ratas: " + esimene_ratas);
            if (esimene_ratas % 2 == 0) {
                teine_ratas += 1;
                System.out.println("Teine ratas: " + teine_ratas);
            }
        }

            //System.out.println("Esimene ratas: " + hetkehammas1);
    }

    public void lykka(){

    }
}