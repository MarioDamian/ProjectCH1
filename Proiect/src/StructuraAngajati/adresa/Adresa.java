package StructuraAngajati.adresa;

public class Adresa {
    private String[] strada;
    private Integer nr;

    public Adresa() {
    }

    public Adresa(String[] strada, Integer nr) {
        this.strada = strada;
        this.nr = nr;
    }

    public String[] getStrada() {
        return strada;
    }

    public void setStrada(String[] strada) {
        this.strada = strada;
    }

    public Integer getNr() {
        return nr;
    }

    public void setNr(Integer nr) {
        this.nr = nr;
    }

}
