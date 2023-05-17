package Libreria;

import java.util.ArrayList;
import java.util.Comparator;

public class Biblioteca {
    
    private ArrayList<Libro> libri;

    public Biblioteca(ArrayList<Libro> libri){
        this.libri = libri;
    }

    public boolean esisteLibro(int indice){

        for(Libro libro : libri){
            if(libro.getIndice() == indice){
                return true;
            }
        }
        return false;
    }

    public ArrayList<Libro> getLibriOrdinati(){

        libri.sort(Comparator.comparing(Libro::getIndice));
        return libri;
    }


}
