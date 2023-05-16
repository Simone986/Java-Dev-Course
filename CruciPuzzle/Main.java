public class Main{

    public static void main(String[] args) {
    
        char[][] matrice = {
                             {'a', 'b', 'c', 'd'},
                             {'e', 'f', 'g', 'h'},
                             {'i', 'j', 'k', 'l'},
                             {'m', 'n', 'o', 'p'}
                            };   
        
        String parola = "okgc";

        CruciPuzzle.puzzle(matrice, parola);

    }
}