public class Mercado {
    private Prateleira prateleiras[] = new Prateleira[2];
    
    public Mercado(Prateleira p1, Prateleira p2) {
        this.prateleiras[0] = p1;
        this.prateleiras[1] = p2;
    }
    
    public Prateleira getPrateleira(int index) {
        return this.prateleiras[index];
    }
    
    public double mediaValorProdutos() {
        double soma = 0;
        double quantTotalProdutos = 0;
        
        for (int i = 0; i < prateleiras.length; i++) {
            for (int j = 0; j < prateleiras[i].getQuantidadeProdutos(); j++) {
                // System.out.println(prateleiras[i].getProduto(j));
                soma += prateleiras[i].getProduto(j).getPreco();
            }
            quantTotalProdutos += prateleiras[i].getQuantidadeProdutos();
        }
        
        return soma / quantTotalProdutos;
    }
}