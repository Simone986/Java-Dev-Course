import java.util.ArrayList;

public class Utente{

    private int id;
    private String nome;
    private ArrayList<Interesse> interessi;
   
    public Utente(int id, String nome) {
        this.id = id;
        this.nome = nome;
        interessi = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Interesse> getInteressi() {
        return interessi;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void addInteresse(Interesse interesse){

        interessi.add(interesse);

    }

    public void removeInteresse(Interesse interesse){

        interessi.remove(interesse);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Utente other = (Utente) obj;
        if (id != other.id)
            return false;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (interessi == null) {
            if (other.interessi != null)
                return false;
        } else if (!interessi.equals(other.interessi))
            return false;
        return true;
    }

    
    
    


}