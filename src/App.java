public class App {
    public static void main(String[] args) throws Exception {
       Metodo bubble = new Metodo();
       int[] arreglo = {5,7,30,12,9};
       int[] arregloOrdenado = bubble.sortByBubble(arreglo);
       bubble.printArreglo(arregloOrdenado);

    }
} 
                                                                                                                        