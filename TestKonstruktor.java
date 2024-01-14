package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.fail;

public class TestKonstruktor {

    @Test
    public void jsouCisla (){
        try{
            RacionalniCislo c = new RacionalniCislo("-1","5");
        }catch (Exception e){
            fail();
        }
        return;
    }

    @Test
    public void nejsouCisla (){
        try{
            RacionalniCislo c = new RacionalniCislo("-1","a");
        }catch (Exception e){
            return;
        }
        fail();
    }

    @Test
    public void nenulovyJmenovatel(){
        try{
            RacionalniCislo c = new RacionalniCislo("1","5");
        }catch (Exception e){
            fail();
        }
        return;
    }

    @Test
    public void nulovyJmenovatel(){
        try{
            RacionalniCislo c = new RacionalniCislo("1","0");
        }catch (Exception e){
            return;
        }
        fail();
    }
}
