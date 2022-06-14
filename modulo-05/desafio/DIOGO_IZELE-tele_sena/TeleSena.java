public class TeleSena {
    public static final double VALOR = 10.0;
    private int[] conjunto1 = new int[25];
    private int[] conjunto2 = new int[25];
    
    public TeleSena() {
        int i = 0;
        /*
         * Neste caso usei um while pois como o aleatório não
         * pode ser um número já existente, caso repita o número,
         * o número de repetições já seria maior que 25, pra 
         * compensar esse número o while só avança quando o array
         * estiver completamente preenchido e só itera caso não
         * exista um valor repetido.
         */
        while (i < conjunto1.length) {
            int aleatorio = (int) ((Math.random( ) * 60) + 1);
            boolean valorRepetido = false;
 
            for (int j = 0; j < conjunto1.length; j++) {
                valorRepetido = conjunto1[j] == aleatorio;
                if (valorRepetido)
                    break;
            }
            
            if (!valorRepetido) {
                conjunto1[i] = aleatorio;
                i++;
            }
        }
        
        i = 0;
        while (i < conjunto2.length) {
            int aleatorio = (int) ((Math.random( ) * 60) + 1);
            boolean valorRepetido = false;
 
            for (int j = 0; j < conjunto2.length; j++) {
                valorRepetido = conjunto2[j] == aleatorio;
                if (valorRepetido)
                    break;
            }
            
            if (!valorRepetido) {
                conjunto2[i] = aleatorio;
                i++;
            }
        }
       
    }
    
    public int[] getConjunto1() {
        return this.conjunto1;
    }
    
    public void imprimeConjunto1() {
        String resultado = "";
        for (int i = 0; i < conjunto1.length; i++)
            resultado += conjunto1[i] + " - ";
        
        System.out.println(resultado);
    }
    
    public int[] getConjunto2() {
        return this.conjunto2;
    }
    
    public void imprimeConjunto2() {
        String resultado = "";
        for (int i = 0; i < conjunto2.length; i++)
            resultado += conjunto2[i] + " - ";
        
        System.out.println(resultado);
    }
}