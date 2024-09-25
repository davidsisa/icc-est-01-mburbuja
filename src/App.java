public class App {
    public static void main(String[] args) throws Exception {
       Metodo bubble = new Metodo();
       int[] arreglo = {5,7,30,12,9};
       int[] arregloOrdenadoAsc = bubble.sortByBubbleAsc(arreglo);
       System.out.print(" Ascendente: ");
       bubble.printArreglo(arregloOrdenadoAsc);
       int[] arregloOrdenadoDesc = bubble.sortByBubbleDesc(arreglo);
       System.out.print("\n Descendente: ");
       bubble.printArreglo(arregloOrdenadoDesc);
    }
} 
                                                                                                                        