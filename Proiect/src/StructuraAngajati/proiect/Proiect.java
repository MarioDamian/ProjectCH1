package StructuraAngajati.proiect;

import StructuraAngajati.angajati.Angajat;
import StructuraAngajati.angajati.Manager;

public class Proiect {
    private Angajat[] angajatiProiect;
    private Manager man;
    private Integer proiectID;
    private String[] denumire;

    public Proiect() {
    }

    public Proiect(Angajat[] angajatiProiect, Manager man, Integer proiectID, String[] denumire) {
        this.angajatiProiect = angajatiProiect;
        this.man = man;
        this.proiectID = proiectID;
        this.denumire = denumire;
    }

    public Angajat[] getAngajatiProiect() {
        return angajatiProiect;
    }

    public void setAngajatiProiect(Angajat[] angajatiProiect) {
        this.angajatiProiect = angajatiProiect;
    }

    public Manager getMan() {
        return man;
    }

    public void setMan(Manager man) {
        this.man = man;
    }

    public Integer getProiectID() {
        return proiectID;
    }

    public void setProiectID(Integer proiectID) {
        this.proiectID = proiectID;
    }

    public String[] getDenumire() {
        return denumire;
    }

    public void setDenumire(String[] denumire) {
        this.denumire = denumire;
    }
}
