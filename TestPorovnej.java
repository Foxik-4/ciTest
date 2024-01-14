package org.example;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class TestPorovnej {

    @Test
    public void vetsi(){
        PrirozeneCislo p = new PrirozeneCislo("5");
        RacionalniCislo r = new RacionalniCislo("1", "5");
        Assert.assertTrue(Math.signum(p.compareTo(r)) == 1);
    }

    @Test
    public void mensi(){
        PrirozeneCislo p = new PrirozeneCislo("5");
        RacionalniCislo r = new RacionalniCislo("-1", "5");
        Assert.assertTrue(Math.signum(r.compareTo(p)) == -1);
    }

    @Test
    public void rovno(){
        PrirozeneCislo p = new PrirozeneCislo("5");
        RacionalniCislo r = new RacionalniCislo("5", "1");
        Assert.assertTrue(Math.signum(r.compareTo(p)) == 0);
    }
}
