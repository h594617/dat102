package test;

import no.hvl.dat102.adt.KoeADT;
import no.hvl.dat102.kjedet.KjedetKoe;

public class KjedetKoeTest extends KoeTestADT {
    @Override
    public KoeADT setup(int i) {
        KoeADT <Integer> koe = new KjedetKoe();

        return koe;

    }
}