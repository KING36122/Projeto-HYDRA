package hydra;

public class Compra {
    private int idCompra; 
    
    public Compra(){
        System.out.println("Classe Compra foi instanciada!");
    }

    public Compra(int idCompra) {
        this.idCompra = idCompra;
    }
    
    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }
  
  public void realizarCompra(){
        //código para ser feito com o auxlio do DB
    }
    
    public void consultarCompra(){
        //código para ser feito com o auxlio do DB
    }
}
