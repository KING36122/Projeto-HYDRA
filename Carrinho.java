package hydra;

public class Carrinho {
    private int idCarrinho;
    
    public Carrinho(){
        System.out.println("Classe Carrinho foi instanciada!");
    }
        
    public Carrinho(int idCarrinho) {
        this.idCarrinho = idCarrinho;
    }
    
    public int getIdCarrinho() {
        return idCarrinho;
    }

    public void setIdCarrinho(int idCarrinho) {
        this.idCarrinho = idCarrinho;
    }
    
    public void addProduto(){
        //código para ser feito com o auxlio do DB
    }
    
    public void removerProduto(){
        //código para ser feito com o auxlio do DB
    }
}
