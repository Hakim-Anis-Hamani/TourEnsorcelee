package cstjean.prog4;

public class Main {

    public static void main(String[] args) {
        Tour tour = new TourNormale();
        System.out.println("#### TOUR NORMAL ###");
        Personnage magicien = new Magicien("Magicien 1");
        tour.entrer(magicien);
        Personnage magicien2 = new Magicien("Magicien 2");
        tour.entrer(magicien2);
        Personnage magicien3 = new Magicien("Magicien 3");
        tour.entrer(magicien3);
        Personnage magicien4 = new Magicien("Magicien 4");
        tour.entrer(magicien4);

        System.out.println("#### TOUR ENSORCELÉE ###");
        tour = new TourEnsorcelee();
        tour.entrer(magicien);
        tour.entrer(magicien2);
        tour.entrer(magicien3);
        tour.entrer(magicien4);

        System.out.println("#### TOUR ENSORCELÉE (CASQUE) ###");
        tour = new TourEnsorcelee();
        tour.entrer(magicien);
        tour.entrer(magicien2);
        tour.entrer(magicien3);
        tour.entrer(magicien4);

        System.out.println("#### TOUR ENSORCELÉE (CASQUE + GANTS + COTTE) ###");
        tour = new TourEnsorcelee();
        tour.entrer(magicien);
        tour.entrer(magicien2);
        tour.entrer(magicien3);
        tour.entrer(magicien4);
    }
}
