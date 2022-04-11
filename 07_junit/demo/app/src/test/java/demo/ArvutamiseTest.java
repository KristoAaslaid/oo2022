package demo;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArvutamiseTest {
    Arvutamine arvutus;
    @Test void testUksKord() {
        arvutus = new Arvutamine();
        assertEquals(0, arvutus.KordadeArv() );
    }
    @Test void testKordadeArv(){
        arvutus = new Arvutamine();
        arvutus.Suurem();
        arvutus.Vaiksem();
        int mitukorda = 2;
        assertEquals(mitukorda, arvutus.KordadeArv());
    }
    @Test void testJuhuslikArvinrange(){
        arvutus = new Arvutamine();
        int suvaline = arvutus.JuhuslikArv();
        assertTrue(0 <= suvaline && suvaline <= 100);
    }
}
