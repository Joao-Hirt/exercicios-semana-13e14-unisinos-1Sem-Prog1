public class Produto {
    private double preco;

    public Produto (double preco){
        this.preco = preco;
    }

    public double getPreco(){
        return this.preco;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }

    @Override
    public String toString(){
        return "Preço do Produto: "+preco;
    }

    public Produto produtoMaisBarato(Produto[] arrayDeProdutos){
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        for(Produto produto : arrayDeProdutos){
            if(produto != null){
                if(produto.getPreco() < menorPreco){
                    menorPreco = produto.getPreco();
                    produtoMaisBarato = produto;
                }
            }
        } return produtoMaisBarato;
    }
}


