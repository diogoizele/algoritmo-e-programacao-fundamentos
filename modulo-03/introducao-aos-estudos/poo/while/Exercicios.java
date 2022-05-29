public class Exercicios {
    public void contador(int x) {
        while (x <= 300) {
            System.out.println(x);
            x++;
        }
    } 
    
    public void imprimePares(int x) {
        if (x < 0) 
            System.out.println("Erro, valor de x negativo");
        else {
            int i = 0;
            while (i <= x) {
                if (i % 2 == 0)
                    System.out.println(i);
                i++;
            }
        }
    }
    
    public boolean verificaPrimo(int x) {
        int i = 2;
        int divisores = 2;
        
        while (i < x) {
            if (x % i == 0)
                divisores++;
            i++;
        }
        
        if (divisores > 2)
            return false;
        else
            return true;
    }
}