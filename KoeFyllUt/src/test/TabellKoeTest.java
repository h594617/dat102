package test;

import no.dat102.tabell.TabellKoe;
import no.hvl.dat102.adt.KoeADT;

public class TabellKoeTest extends KoeTestADT {
    @Override
    public KoeADT setup(int i) {
        KoeADT <Integer> koe = new TabellKoe(i);

        return koe;

    }
}