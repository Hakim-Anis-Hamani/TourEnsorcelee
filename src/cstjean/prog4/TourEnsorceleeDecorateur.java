package cstjean.prog4;

public class TourEnsorceleeDecorateur implements TourInterface{
    private final TourInterface tour;

    TourEnsorceleeDecorateur(TourInterface tour) {
        this.tour = tour;
    }

    @Override
    public void entrerAvecEquipement(Personnage personnage, String equipement) {
            int reductionDegat = 0;
            if (equipement.contains("Casque")){
                reductionDegat += 10;
            }
            else if (equipement.contains("gants")){
                reductionDegat += 5;
            }
            else if (equipement.contains("Cotte")){
                reductionDegat += 50;
            }
        }
    }
}
