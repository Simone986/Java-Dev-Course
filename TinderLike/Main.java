import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {
        
        Interesse videogiochi = new Interesse(0, "Evviva Pac-Man");
        Interesse cinema = new Interesse(1, "Mi piacciono le serie tv");
        Interesse stampare = new Interesse(2, "Mi piace stampare tutto il giorno");

        Utente Marco = new Utente(0, "Marco");
        Utente Giulio = new Utente(1, "Giulio");

        Marco.addInteresse(videogiochi);
        Marco.addInteresse(cinema);
        Giulio.addInteresse(stampare);
        Giulio.addInteresse(cinema);

        ArrayList<Interesse> interessiMarco = Marco.getInteressi();
        ArrayList<Interesse> interessiGiulio = Giulio.getInteressi();

        TinderLike tinderLike = new TinderLike();

        tinderLike.addUser(Marco, interessiMarco);
        tinderLike.addUser(Giulio, interessiGiulio);
        tinderLike.stampaUtenti();

        tinderLike.removeUser(Marco);

        tinderLike.stampaUtenti();

    }

}
