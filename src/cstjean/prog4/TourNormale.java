package cstjean.prog4;

/**
 * Une tour normale ...
 *
 * @author Gabriel T. St-Hilaire
 */
public class TourNormale extends Tour {
    /**
     * {@inheritdoc}
     */
    @Override
    public void entrer(Personnage personnage) {
        System.out.println("Le personnage " + personnage.getNom() + " entre dans la tour.");
        personnage.recevoirDegat(10);
    }
}
