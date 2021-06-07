package hydra;

public class Telefone {
    private String celular;
    private String fixo;
    
    public Telefone(){
        System.out.println("Classe Telefone foi instanciada!");
    }

    public Telefone(String celular, String fixo) {
        this.celular = celular;
        this.fixo = fixo;
    }
    
    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getFixo() {
        return fixo;
    }

    public void setFixo(String fixo) {
        this.fixo = fixo;
    }
    
    public void atualizarTel(){
        //código para ser feito com o auxlio do DB
    }
    
    public void desativarTel(){
        //código para ser feito com o auxlio do DB
    }
}
