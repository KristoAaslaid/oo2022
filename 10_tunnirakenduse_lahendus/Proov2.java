package tund09;

import java.util.HashMap;
import java.util.*;

public class Proov2 {
    public static void main(String[] arg){
        Map<Integer, String> valvajad=new HashMap<>();
        valvajad.put(1, "Juku");
        valvajad.put(2, "Kati");
        valvajad.put(1, "Mati");
        System.out.println(valvajad);
        Map<String, Double> eesnimed=new HashMap<>();
        eesnimed.put("Karl", 2.5);
        eesnimed.put("Joosep", 4.5);
        System.out.println(eesnimed);

        for(String eesnimi: eesnimed.keySet()){
            System.out.println(eesnimi);
        }
        //Koostage Map, kus võtmeks on eesnimi ning väärtuseks matemaatika veerandihinne
        //Lisage paar väärtust
        //Trükkige tulemused
        //Saage muutujasse kätte vaid eesnimed, kuvage need
    }
}
