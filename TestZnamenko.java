package org.example;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.fail;

public class TestZnamenko {

    @Test
    public void celeKladne(){
        try {
            CeleCislo c = new CeleCislo("1");
            Assert.assertTrue(c.jeKladne());
        }catch (Exception e){
            fail();
        }
    }

    @Test
    public void celeNula(){
        try {
            CeleCislo c = new CeleCislo("0");
            Assert.assertFalse(c.jeKladne());
        }catch (Exception e){
            fail();
        }
    }

    @Test
    public void celeZaporne(){
        try {
            CeleCislo c = new CeleCislo("-1");
            Assert.assertFalse(c.jeKladne());
        }catch (Exception e){
            fail();
        }
    }

    @Test
    public void racionalniKladne(){
        try {
            RacionalniCislo c = new RacionalniCislo("-1", "-5");
            Assert.assertTrue(c.jeKladne());
        }catch (Exception e){
            fail();
        }
    }

    @Test
    public void racionalniNula(){
        try {
            RacionalniCislo c = new RacionalniCislo("0", "-5");
            Assert.assertFalse(c.jeKladne());
        }catch (Exception e){
            fail();
        }
    }

    @Test
    public void racionalniZaporne(){
        try {
            RacionalniCislo c = new RacionalniCislo("-1", "5");
            Assert.assertFalse(c.jeKladne());
        }catch (Exception e){
            fail();
        }
    }
}
