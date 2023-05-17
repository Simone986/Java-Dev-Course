package Libreria;

import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {
        
        ArrayList<Libro> books = new ArrayList<Libro>();
        books.add(new Libro(123, "Luciana Litizzetto", "I dolori del giovane Programmatore"));
        books.add(new Libro(4, "Super Mario", "Errori da non ripetere"));
        books.add(new Libro(98, "Luigi Pirandino", "Uno, nessuno e diecimila bug"));
        books.add(new Libro(33, "Roberto Roberti", "Come programmare in Java da zero"));
        books.add(new Libro(76, "Piero Java", "Mille splendidi errori"));
        books.add(new Libro(2, "Lavinia Pitoni", "Non si esce vivi dalle biblioteche"));
        books.add(new Libro(235, "Luciana Litizzetto Jr.", "I dolori del vecchio Programmatore")); 
        
        Biblioteca library = new Biblioteca(books);
        System.out.println(library.esisteLibro(76));

        books = library.getLibriOrdinati();
        for(Libro libri : books){
            System.out.println(libri.getIndice() + " " + libri.getAutore() + " " + libri.getTitolo());
        }
    }
}
