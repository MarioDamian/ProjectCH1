package StructuraAngajati.angajati;

import StructuraAngajati.adresa.Adresa;
import StructuraAngajati.proiect.Proiect;
import StructuraAngajati.salariu.Salariu;

public class Manager extends Angajat {
    private Integer managerID;
    private Integer oreSuplimentare;
    private Integer salariuTotal;

    public Manager() {
    }

    public Manager(Adresa adresa, Salariu salariu, String[] nume, Integer varsta, Proiect proiect, Integer managerID, Integer oreSuplimentare, Integer salariuTotal) {
        super(adresa, salariu, nume, varsta, proiect);
        this.managerID = managerID;
        this.oreSuplimentare = oreSuplimentare;
        this.salariuTotal = salariuTotal;
    }

    public Integer getManagerID() {
        return managerID;
    }

    public void setManagerID(Integer managerID) {
        this.managerID = managerID;
    }

    public Integer getOreSuplimentare() {
        return oreSuplimentare;
    }

    public void setOreSuplimentare(Integer oreSuplimentare) {
        this.oreSuplimentare = oreSuplimentare;
    }

    public Integer getSalariuTotal() {
        return salariuTotal;
    }

    public void setSalariuTotal(Integer salariuTotal) {
        this.salariuTotal = salariuTotal;
    }
}
