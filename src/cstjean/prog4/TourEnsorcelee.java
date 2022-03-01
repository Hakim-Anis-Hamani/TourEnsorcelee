package cstjean.prog4;

import java.util.LinkedList;
import java.util.List;

public class TourEnsorcelee extends Tour {
    private List<Personnage> magiciens = new LinkedList<>();

    @Override
    public void entrer(Personnage personnage) {
        if(magiciens.size() < 2){
            magiciens.add(personnage);
            System.out.println("Le personnage " + personnage.getNom() + " entre dans la tour.");
            personnage.recevoirDegat(10);
        }
        else{
            System.out.println("Le personnage " + personnage.getNom() + " est bloqué à l'entrée !.");
            personnage.recevoirDegat(60);
        }

    }

}
