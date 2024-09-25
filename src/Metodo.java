public class Metodo {
    public Metodo (){
        System.out.println("Metodo construido");
    }
    public int[] sortByBubble(int[] arreglo){
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
    public void printArreglo(int[] arreglo){
        for (int elemento : arreglo) {
           System.out.print(" " + elemento); 
        }

    }
}
