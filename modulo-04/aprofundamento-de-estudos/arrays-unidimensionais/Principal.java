public class Principal {
    public static void main(String[] args) {
        // Exercício 1
        int[] arr1 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] arr2 = {0, 1, 4, 9, 16, 25, 36, 49, 64, 81, 100};
        int[] arr3 = {1, 2, 3, 4, 5, 10, 20, 30, 40, 50};
        int[] arr4 = {3, 4, 7, 12, 19, 28, 39, 52, 67, 84};
        int[] d = new int[10];
        
        // Exercício 2
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(new Double(arr1[i]));
        }
        
        // Exercício 3
        for (int i = 0; i < d.length; i++) {
            d[i] = Teclado.leInt("Digite um inteiro");
        }
    }
}