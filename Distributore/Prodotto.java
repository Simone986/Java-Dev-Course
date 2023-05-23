public class Prodotto {
    
    private String id;
    private double prezzo;

    public Prodotto(String id, double prezzo){
        this.id = id;
        this.prezzo = prezzo;
    }

    public String getId() {
        return id;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    

}
