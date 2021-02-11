package test;

import no.hvl.dat102.adt.KoeADT;
import no.hvl.dat102.sirkulaer.SirkulaerKoe;

public class SirkulaeKoeTest extends KoeTestADT {
    @Override
    public KoeADT setup(int i) {
        KoeADT <Integer> koe = new SirkulaerKoe(i);

        return koe;

    }
}
