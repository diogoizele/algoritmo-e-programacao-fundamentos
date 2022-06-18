import java.util.Arrays;

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
        Arrays.sort(conjunto1);
        
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
        Arrays.sort(conjunto2);
       
    }
    
    public int[] getConjunto1() {
        return this.conjunto1;
    }
    
    public void imprimeConjunto1() {
        System.out.println(toStringConjunto1());
    }
    
    public int[] getConjunto2() {
        return this.conjunto2;
    }
    
    public void imprimeConjunto2() {
        System.out.println(toStringConjunto2());
    }
    
    public String toStringConjunto1() {
        String resultado = "Conjunto 1: ";
        for (int i = 0; i < conjunto1.length; i++) {
            resultado += conjunto1[i];
            if (i != conjunto1.length - 1)
                resultado += " - ";
        }
        return resultado;
    }
    
    public String toStringConjunto2() {
        String resultado = "Conjunto 2: ";
        for (int i = 0; i < conjunto2.length; i++) {
            resultado += conjunto2[i];
            if (i != conjunto2.length - 1)
                resultado += " - ";
        }
        return resultado;
    }
    
    
    public String toString() {
        String resultado = "\n---------------------------//------------------------------------------------------//---------------------------\n";
        resultado += toStringConjunto1();
        resultado += "\n";
        resultado += toStringConjunto2();
        resultado +=  "\n---------------------------//------------------------------------------------------//---------------------------\n";
        return resultado;
    }
}