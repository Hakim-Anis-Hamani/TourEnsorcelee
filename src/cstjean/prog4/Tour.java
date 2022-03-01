package cstjean.prog4;

/**
 * Une tour où l'on peut entrer.
 *
 * @author Gabriel T. St-Hilaire
 */
public abstract class Tour {
    /**
     * Action d'un personnage qui entre dans la tour.
     *
     * @param personnage Le personnage qui entre dans la tour.
     */
    public abstract void entrer(Personnage personnage);
}
