package apaw.pd.text;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class TextoTest {
    private Texto H, o, l, a, pf, txt;

    @Before
    public void ini() {
        H = FactoriaCaracter.getFactoria().getCaracter('H');
        o = FactoriaCaracter.getFactoria().getCaracter('o');
        l = FactoriaCaracter.getFactoria().getCaracter('l');
        a = FactoriaCaracter.getFactoria().getCaracter('a');
        pf = new Parrafo();
        pf.add(H);
        pf.add(o);
        pf.add(l);
        pf.add(a);
        txt = new TextoAnidado();
        txt.add(pf);
        txt.add(pf);
    }

    @Test
    public void testCaracterFlyweight() {
        assertSame(H, FactoriaCaracter.getFactoria().getCaracter('H'));
    }

    @Test
    public void testCaracterAddCaracter() {
        H.add(o);
    }

    @Test
    public void testDibujarCaracterNormal() {
        assertEquals("o", o.print(false));
    }

    @Test
    public void testDibujarCaracterMayusculas() {
        assertEquals("O", o.print(true));
    }

    // ----------------------------------------------

    @Test
    public void testParrafoNormal() {
        assertEquals("Hola\n", pf.print(false));
    }

    @Test
    public void testParrafoMayusculas() {
        assertEquals("HOLA\n", pf.print(true));
    }

    @Test
    public void testParrafoNoAddParrafo() {
        try {
            pf.add(pf);
            fail("");
        } catch (UnsupportedOperationException ignored) {
            ignored.toString();
        }
    }

    // ----------------------------------------------

    @Test
    public void testTextoNormal() {
        assertEquals("Hola\nHola\n---o---\n",txt.print(false));
    }
    
    @Test
    public void testTextoMayusculas() {
        assertEquals("HOLA\nHOLA\n---o---\n",txt.print(true));
    }
    
    @Test
    public void testTextoNoAddCaracter() {
        try {
            txt.add(H);
            fail();
        } catch (UnsupportedOperationException ignored) {
            ignored.toString();
        }
    }

}
