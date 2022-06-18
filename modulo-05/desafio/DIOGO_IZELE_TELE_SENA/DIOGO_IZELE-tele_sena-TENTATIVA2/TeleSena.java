public class TeleSena {
    public static final float PRECO = 10;
    
    private int[] conjunto1;
    private int[] conjunto2;
    private int acertosConjunto1;
    private int acertosConjunto2;
    
    public TeleSena() {
         conjunto1 = Gerador.geraInteiros(25);
         conjunto2 = Gerador.geraInteiros(25);
    }
    
    public boolean conjuntoPossuiNumero(int numero, int conjunto) {
        if (conjunto == 1) {
            for (int i = 0; i < conjunto1.length; i++) {
                if (conjunto1[i] == numero)
                    return true;
            }
            return false;
        }
        else {
            for (int i = 0; i < conjunto2.length; i++) {
                if (conjunto2[i] == numero)
                    return true;
            }
            return false;  
        }
    }
    
    public int[] getConjunto1() {
        return this.conjunto1;
    }
   
    public int[] getConjunto2() {
        return this.conjunto2;
    }    

    public int getAcertosConjunto1() {
        return this.acertosConjunto1;
    }
    
    public int getAcertosConjunto2() {
        return this.acertosConjunto2;
    }
    
    public void incrementaAcertoConjunto1() {
        this.acertosConjunto1++;
    }
    
    public void incrementaAcertoConjunto2() {
        this.acertosConjunto2++;
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
        resultado += "\nAcertos do conjunto 1: " + this.acertosConjunto1;
        resultado += "\n";
        resultado += toStringConjunto2();
        resultado += "\nAcertos do conjunto 2: " + this.acertosConjunto2;
        resultado +=  "\n---------------------------//------------------------------------------------------//---------------------------\n";
        return resultado;
    }
}
