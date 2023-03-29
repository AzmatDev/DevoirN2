package Entities.Exo1;

public class Forage extends Captage implements IVolume {
    private int diametreForage;

    public Forage(int idCaptage, String nomCaptage, int hautCaptage, int debitCaptage, int unDiametre) {
        super(idCaptage, nomCaptage, hautCaptage, debitCaptage);
        diametreForage = unDiametre;
    }

    @Override
    public int GetVolume() {
        return (int) (Math.PI * diametreForage * debitCaptage);
    }

    public String GetDescription() {
        return nomCaptage + hautCaptage + debitCaptage +  debitCaptage + diametreForage;
    }
}
