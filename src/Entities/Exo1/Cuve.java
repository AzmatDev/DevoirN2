package Entities.Exo1;

public class Cuve extends Captage implements IVolume {
    private int largeurCuve;
    private int longueurCuve;

    public Cuve(int idCaptage, String nomCaptage,int hautCaptage, int debitCaptage, int uneLargeur, int uneLongueur) {
        super(idCaptage, nomCaptage, hautCaptage, debitCaptage);
        largeurCuve = uneLargeur;
        longueurCuve = uneLongueur;

    }

    @Override
    public int GetVolume() {
        return longueurCuve * largeurCuve;
    }

    public String GetDescription() {
        return nomCaptage + hautCaptage + debitCaptage + largeurCuve + longueurCuve;
    }
}
