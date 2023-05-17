package Libreria;

public class Libro {
    
    private int indice;
    private String titolo;
    private String autore;

    public Libro(int indice, String autore ,String titolo){
        this.indice = indice;
        this.autore = autore;
        this.titolo = titolo;
    }

    public int getIndice() {
        return indice;
    }

    public String getTitolo() {
        return titolo;
    }

    public String getAutore() {
        return autore;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }


}
