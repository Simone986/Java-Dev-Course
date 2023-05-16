public class CruciPuzzle {
    
    public static boolean puzzle(char[][] matrice, String parola){

        String confronto = " ";

        for(int i = 0; i < matrice.length; i++){
            for(int j = 0; j < matrice.length; j++){
                if(matrice[i][j] == parola.charAt(0)){
                    //Controlla se la parola è presente orizzontalmente
                    for(int h = j; h < matrice.length; h++){    //h = horizontally
                        confronto += matrice[i][h];
                    }
                    confronto.trim();
                    if(confronto.contains(parola)){
                        printMatrice(matrice);
                        System.out.println("La parola " + parola + " e' presente orizzontalmente");
                        return true;
                    } 
                    for(int v = i; v < matrice.length; v++){    //v = vertically
                        confronto += matrice[v][j];
                    }
                    confronto.trim();
                    if(confronto.contains(parola)){
                        printMatrice(matrice);
                        System.out.println("La parola " + parola + " e' presente verticalmente");
                        return true;
                    }                 
                }
                if(matrice[i][j] == parola.charAt(parola.length()-1)){ 
                    //Controlla se la parola è presente al contrario
                    for(int h = parola.length(); h > 0; h--){    //h = horizontally
                        confronto += matrice[i][h];
                    }
           
                    if(confronto.contains(parola)){
                        printMatrice(matrice);
                        System.out.println("La parola " + parola + " e' presente orizzontalmente al contrario");
                        return true;
                    } 
                    for(int v = parola.length(); v > 0; v--){    //v = vertically
                        confronto += matrice[v][j];
                    }
                    confronto.trim();
                    if(confronto.contains(parola)){
                        printMatrice(matrice);
                        System.out.println("La parola " + parola + " e' presente verticalmente al contrario");
                        return true;
                    }                 
                }
            }
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
