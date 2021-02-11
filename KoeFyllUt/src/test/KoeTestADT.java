package test;

//1232131312

import no.hvl.dat102.adt.KoeADT;
import no.hvl.dat102.exception.EmptyCollectionException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public abstract class KoeTestADT {

    int SIZE = 10;

    private KoeADT<Integer>koe;

    private int t0 = 1;
    private int t1 = 2;
    private int t2 = 3;
    private int t3 = 4;

    @BeforeEach
    public void EtEllerAnnet() {

        koe = setup(SIZE);

    }


    public abstract KoeADT setup(int SIZE);


    @Test
    public void newStackIsEmpty() {
        assertTrue(koe.erTom());
    }

    @Test
    public void innKoe() {

        koe.innKoe(t0);
        koe.innKoe(t1);
        koe.innKoe(t2);
        koe.innKoe(t3);

        try {
            assertFalse(koe.erTom());
            assertEquals(t3, koe.antall());
            assertEquals(t2, koe.antall());
            assertEquals(t1, koe.antall());
            assertEquals(t0, koe.antall());
        } catch (EmptyCollectionException e) {
            fail("innKoe failed unexpectedly " + e.getMessage());
        }

    }

    @Test
    public void utKoe() {

    }

    @Test
    public void foerste() {

    }

    @Test
    public void erTom() {

    }

    @Test
    public void antall() {

    }
}
