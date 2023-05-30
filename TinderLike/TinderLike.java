import java.util.ArrayList;
import java.util.HashMap;

public class TinderLike {
    
    private HashMap<Utente,ArrayList<Interesse>> utenti; 

    public TinderLike(){
        utenti = new HashMap<>();
    }

    public void addUser(Utente utente, ArrayList<Interesse> interessi){
        utenti.put(utente, interessi);

    }

    public void removeUser(Utente utente){
        utenti.remove(utente);
    }

    public void stampaUtenti(){

        for(Utente utente : utenti.keySet()){
            
            System.out.println(utente.getNome() + " " + utenti.get(utente).toString());
        }

    }

    

}
