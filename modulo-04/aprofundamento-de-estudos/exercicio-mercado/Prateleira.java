public class Prateleira {
    private Produto produtos[] = new Produto[3];
    
    public Prateleira() {}
    
    public Prateleira(Produto prod1, Produto prod2, Produto prod3) {
        this.produtos[0] = prod1;
        this.produtos[1] = prod2;
        this.produtos[2] = prod3;
    }
    
    public Produto getProduto(int index) {
        return produtos[index];
    }
    
    public int getQuantidadeProdutos() {
        int quantidade = 0;
        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i] != null)
                quantidade++;
        }
        
        return quantidade;
    }
    
    public void setProduto(Produto produto, int index) {
        this.produtos[index] = produto;
    }
    
    public Produto produtoMaisCaro() {
        Produto produtoMaisCaro = produtos[0];
                
        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i] != null) {
                produtoMaisCaro = produtos[i];
                break;
            }
        }
        
        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i] != null && produtoMaisCaro != null) {
                if (produtos[i].getPreco() > produtoMaisCaro.getPreco())
                    produtoMaisCaro = produtos[i];
            }
        }
        
        return produtoMaisCaro;
    }
    
    public String toString() {
        if (produtos.length == 0) {
            return "Sem produtos na prateleira";
        }
        
        return "Produtos:\n1) " + produtos[0] + "\n2) " + produtos[1] + "\n3) " + produtos[2];
    }
}