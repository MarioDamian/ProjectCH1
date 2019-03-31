package StructuraAngajati.angajati;

import StructuraAngajati.adresa.Adresa;
import StructuraAngajati.proiect.Proiect;
import StructuraAngajati.salariu.Salariu;

public class Angajat
{
    private Adresa adresa;
    private Salariu salariu;
    private String[] nume;
    private Integer varsta;
    private Proiect proiect;

    public Angajat() {
    }

    public Angajat(Adresa adresa, Salariu salariu, String[] nume, Integer varsta, Proiect proiect) {
        this.adresa = adresa;
        this.salariu = salariu;
        this.nume = nume;
        this.varsta = varsta;
        this.proiect = proiect;
    }

    public Adresa getAdresa() {
        return adresa;
    }

    public void setAdresa(Adresa adresa) {
        this.adresa = adresa;
    }

    public Salariu getSalariu() {
        return salariu;
    }

    public void setSalariu(Salariu salariu) {
        this.salariu = salariu;
    }

    public String[] getNume() {
        return nume;
    }

    public void setNume(String[] nume) {
        this.nume = nume;
    }

    public Integer getVarsta() {
        return varsta;
    }

    public void setVarsta(Integer varsta) {
        this.varsta = varsta;
    }

    public Proiect getProiect() {
        return proiect;
    }

    public void setProiect(Proiect proiect) {
        this.proiect = proiect;
    }

    
}
