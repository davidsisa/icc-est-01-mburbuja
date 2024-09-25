public class Metodo {
    public Metodo (){
        System.out.println("Metodo construido");
    }
    public int[] sortByBubbleAsc(int[] arreglo){
        int tamanio = arreglo.length;
        for (int i = 0; i < tamanio; i++) {
            for (int a = i + 1; a < tamanio; a++) {
                if (arreglo[i] > arreglo[a]) {
                    int aux = arreglo[i];
                    arreglo[i] = arreglo [a];
                    arreglo[a] = aux;
                }
            }
        }
        return arreglo;
    }
    public int[] sortByBubbleDesc(int[] arreglo){
        int tamanio = arreglo.length;
        for (int i = 0; i < tamanio; i++) {
            for (int a = i + 1; a < tamanio; a++) {
                if (arreglo[i] < arreglo[a]) {
                    int aux = arreglo[i];
                    arreglo[i] = arreglo [a];
                    arreglo[a] = aux;
                }
            }
        }
        return arreglo;
    }
    public void printArreglo(int[] arreglo){
        for (int elemento : arreglo) {
           System.out.print(" " + elemento); 
        }

    }
    public String[] sortByBubblePalabras(String[] palabras){
        int tamanio = palabras.length;
        for (int i = 0; i < tamanio; i++) {
            for (int a = i + 1; a < tamanio; a++) {
                if (palabras[i].compareToIgnoreCase(palabras[a])> 0) {
                    String aux = palabras[i];
                    palabras[i] = palabras[a];
                    palabras[a] = aux;
                }
            }
        }
        return palabras;
    }
    public void printArregloPalabras(String[] arreglo){
        for (String elemento : arreglo) {
           System.out.print(" " + elemento); 
        }
    }
    
}
