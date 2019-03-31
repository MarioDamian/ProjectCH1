package StructuraAngajati.angajati;

import StructuraAngajati.adresa.Adresa;
import StructuraAngajati.proiect.Proiect;
import StructuraAngajati.salariu.Salariu;

public class Angajat_FT extends Angajat {
    static Integer nrOreFt = 10;

    public Angajat_FT() {
    }

    public Angajat_FT(Adresa adresa, Salariu salariu, String[] nume, Integer varsta, Proiect proiect) {
        super(adresa, salariu, nume, varsta, proiect);
    }
}
