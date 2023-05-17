public class CruciPuzzle {
    
    public static boolean puzzle(char[][] matrice, String parola){

        String confronto = "";

        if(parola.length() <= matrice.length){
            for(int i = 0; i < matrice.length; i++){
                for(int j = 0; j < matrice.length; j++){
                    if(matrice[i][j] == parola.charAt(0)){
                        //Controlla se la parola è presente orizzontalmente
                        for(int h = j; h < matrice.length; h++){    //h = horizontally
                            confronto += matrice[i][h];
                        }
         
                        if(confronto.contains(parola)){
                            printMatrice(matrice);
                            System.out.println("La parola " + parola + " e' presente orizzontalmente");
                            return true;
                        } 
                        for(int v = i; v < matrice.length; v++){    //v = vertically
                            confronto += matrice[v][j];
                        }
                
                        if(confronto.contains(parola)){
                            printMatrice(matrice);
                            System.out.println("La parola " + parola + " e' presente verticalmente");
                            return true;
                        }
                        //Controlla se la parola è presente in diagonale
                        for(int x = i; x < matrice.length; x++){                           
                                confronto += matrice[x][x];                           
                        }
                        if(confronto.contains(parola)){
                            printMatrice(matrice);
                            System.out.println("La parola " + parola + " e' presente diagonalmente");
                            return true;
                        }
                        // Controlla se la parola è presente in diagonale al contrario
                        for (int x = matrice.length-1; x >= 0; x--) {
                            confronto += matrice[x][x];
                        }
                        if (confronto.contains(parola)) {
                            printMatrice(matrice);
                            System.out.println("La parola " + parola + " e' presente diagonalmente al contrario");
                            return true;
                        }
                    }
                    if(matrice[i][j] == parola.charAt(parola.length()-1)){ 
                        //Controlla se la parola è presente al contrario
                        for(int h = matrice.length-1; h >= 0; h--){    //h = horizontally
                            confronto += matrice[i][h];
                        }
               
                        if(confronto.contains(parola)){
                            printMatrice(matrice);
                            System.out.println("La parola " + parola + " e' presente orizzontalmente al contrario");
                            return true;
                        } 
                        for(int v = parola.length()-1; v >= 0; v--){    //v = vertically
                            confronto += matrice[v][j];
                        }
    
                        if(confronto.contains(parola)){
                            printMatrice(matrice);
                            System.out.println("La parola " + parola + " e' presente verticalmente al contrario");
                            return true;
                        }                 
                    }
                }
            }
        }
        else{
            System.out.println("La parola e'troppo lunga");
            return false;
        }
        printMatrice(matrice);
        System.out.println("La parola non è presente");
        return false;
    }


    public static void printMatrice(char[][] matrice){
        for(int i = 0; i < matrice.length; i++){
            for(int j = 0; j < matrice.length; j++){
                System.out.print(matrice[i][j]);
            }
            System.out.print("\n");
        }
    }

}
