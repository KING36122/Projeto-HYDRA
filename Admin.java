package hydra;

public class Admin {
    private int idAdmin;
    private String login;
    private String senha;
    
    public Admin(){
        System.out.println("Classe Admin foi instanciada!");
    }
    
    public Admin(int idAdmin, String login, String senha) {
        this.idAdmin = idAdmin;
        this.login = login;
        this.senha = senha;
    }
    
    public Admin(String login, String senha){
        this(1,"a","a");
    }
    
    public int getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(int idAdmin) {
        this.idAdmin = idAdmin;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public void atualizarAdm(){
        //código para ser feito com o auxlio do DB
    }
    
    public void desativarAdm(){
        //código para ser feito com o auxlio do DB
    }
    
    public void consultarAdm(){
        //código para ser feito com o auxlio do DB
    }
}

    
    
