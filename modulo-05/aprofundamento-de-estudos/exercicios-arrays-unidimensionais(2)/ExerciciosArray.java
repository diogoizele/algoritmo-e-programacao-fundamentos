public class ExerciciosArray {
    
    public double calcularMediaDeNotas(double[] notas) {
        double soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }
        return soma / notas.length;
    }
    
    public String juntaNomes(String[] nomes) {
        String frase = "Dados informados: ";
        for (int i = 0; i < nomes.length; i++) {
            frase += nomes[i];
            if (i == (nomes.length - 2))
                frase += " e ";
            if (i == (nomes.length - 1))
                frase += ". ";
            if (i != (nomes.length - 1) && i != (nomes.length -2))
                frase += ", ";
        }
        return frase;
    }
    
    public int somarInteiros(int[] inteiros) {
        int soma = 0;
        for (int i = 0; i < inteiros.length; i++)
            soma += inteiros[i];
            
        return soma;
    }
    
    public int procuraNome(String[] nomes, String nome) {
        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equalsIgnoreCase(nome))
                return i;
        }
        return -1;
    }
    
    public int[] somaArrays(int[] arr1, int [] arr2) {
        int[] soma;
        if (arr1.length != arr2.length)
            return null;
        else {
            soma = new int[arr1.length];
            for (int i = 0; i < arr1.length; i++) 
                soma[i] = arr1[i] + arr2[i];
        }
        return soma;
    }
    
    public void informaArrayDeDouble(double[] arr) {
        double menor = arr[0];
        double maior = arr[0];
        double soma = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (menor > arr[i]) 
                menor = arr[i];
            if (maior < arr[i])
                maior = arr[i];
            soma += arr[i];
        }
        
        System.out.println("O maior número é " + maior);
        System.out.println("O menor número é " + menor);
        System.out.println("A média dos valores é " + soma / arr.length);
    }
    
    public void geraAleatórios() {
        int tamanho = (int) ((Math.random( )*100)+1);
        int[] aleatorios = new int[tamanho];
        String elementos = "";
        
        for (int i = 0; i < tamanho; i++) {
            aleatorios[i] = (int) ((Math.random( )*1000)+1);
            if (i == tamanho - 1) 
                elementos +=  aleatorios[i];
            else 
                elementos +=  aleatorios[i] + " - ";
        }        
            
        System.out.println("Tamanho do array: " + tamanho);
        System.out.println(elementos);
    }
}