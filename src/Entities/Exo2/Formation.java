package Entities.Exo2;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Formation extends Participant
{
    private int idFormation;
    private String nomFormation;
    private int prixFormation;

    private ArrayList<Participant> lesParticipants;

    public Formation(int idFormation, String nomFormation, int prixFormation) {
        super();
        this.idFormation = idFormation;
        this.nomFormation = nomFormation;
        this.prixFormation = prixFormation;
        this.lesParticipants = new ArrayList<>();
    }

    public void AjouterParticipant(Participant unParticipant)
    {
        lesParticipants.add(unParticipant);
    }
    int fraisRemb = 0;
    int present = 0;
    int
    // Cette méthode permet de compter le nombre de participants
    // réellement présents à la formation.
    public int GetNombreDePresents() {
        // A compléter ici
        int present = 0;
        {
            if (isEstPresent() == true)
            {
                present = present + 1;
            }
            else
            {
                return present;
            }
        }


    // Cette méthode permet de calculer le montant total
    // des frais kilométriques versés pour une formation
    // en ne prenant en compte que les participants présents.
    // On rembourse 1.89 du KM
    public double CalculerFraisRemboursementKilometriques()
    {
        int fraisRemb = 0;
        if(isEstPresent() == true)
        {
            fraisRemb = (int) (getNbKm()* 1.89);
        }
        return fraisRemb;
    }
        // A compléter ici
        return fraisRemb;

    }

    // Cette méthode permet de calculer le taux de présence
    // par rapport au nombre d'inscrits
    public double TauxDePresence()
    {
        // A compléter ici
        return 0;
    }

    // Cette méthode permet de calculer le bénéfice de la formation.
    // Ce dernier se détermine en multipliant le nombre de présents par le prix de la formation moins
    // les frais kilométriques versés
    public double BeneficeFormation()
    {
        int benef = 0;
        if(isEstPresent() == true)
        {
            benef = present * prixFormation - fraisRemb;
        }
        // A compléter ici
        return  benef;
    }
}
