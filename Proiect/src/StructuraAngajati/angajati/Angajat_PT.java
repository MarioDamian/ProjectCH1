package StructuraAngajati.angajati;

import StructuraAngajati.adresa.Adresa;
import StructuraAngajati.proiect.Proiect;
import StructuraAngajati.salariu.Salariu;

public class Angajat_PT extends Angajat {
    static Integer nrOrePt = 6;

    public Angajat_PT() {
    }

    public Angajat_PT(Adresa adresa, Salariu salariu, String[] nume, Integer varsta, Proiect proiect) {
        super(adresa, salariu, nume, varsta, proiect);
    }
}
