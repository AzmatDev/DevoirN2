package Entities.Exo1;

public class Captage implements Comparable<Captage>
{
    public int idCaptage;
    public String nomCaptage;
    public int hautCaptage;
    public int debitCaptage;

    public Captage(int idCaptage, String nomCaptage, int hautCaptage, int debitCaptage) {
        this.idCaptage = idCaptage;
        this.nomCaptage = nomCaptage;
        this.hautCaptage = hautCaptage;
        this.debitCaptage = debitCaptage;
    }


    public int getIdCaptage() {
        return idCaptage;
    }

    public String getNomCaptage() {
        return nomCaptage;
    }

    public int getHautCaptage() {
        return hautCaptage;
    }

    public int getDebitCaptage() {
        return debitCaptage;
    }

    @Override
    public int compareTo(Captage o) {
        return Integer.compare( o.debitCaptage,this.debitCaptage);
    }
}
