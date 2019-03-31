package StructuraAngajati.companie;

import StructuraAngajati.adresa.Adresa;
import StructuraAngajati.angajati.Angajat;
import StructuraAngajati.proiect.Proiect;

public class Companie {
    private Angajat[] angajati;
    private Adresa adresa;

    public Companie() {
    }

    public Companie(Angajat[] angajati) {
        this.angajati = angajati;
    }

    public Angajat[] getAngajati() {
        return angajati;
    }

    public void setAngajati(Angajat[] angajati) {
        this.angajati = angajati;
    }
}
