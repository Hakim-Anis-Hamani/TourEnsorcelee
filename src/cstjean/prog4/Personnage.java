package cstjean.prog4;

/**
 * Personnage ...
 *
 * @author Gabriel T. St-Hilaire
 */
public abstract class Personnage {
    /** Le nom du personnage. */
    private final String nom;

    /**
     * Constructeur. Nom vide.
     */
    public Personnage() {
        this.nom = "???";
    }

    /**
     * Constructeur.
     *
     * @param nom Le nom du personnage.
     */
    public Personnage(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    /**
     * Applique des dégâts au personnage selon un nombre de points de dégât.
     *
     * @param pointsDeDegat Le nombre de points de dégât reçu par notre personnage.
     */
    public void recevoirDegat(int pointsDeDegat) {
        if (pointsDeDegat < 0) {
            pointsDeDegat = 0;
        }

        System.out.println("Le personnage " + getNom() + " reçoit " + pointsDeDegat + " point(s) de dégât.");
    }
}
