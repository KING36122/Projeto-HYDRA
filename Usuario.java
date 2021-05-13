package hydra;

public class Usuario {
    private int idUsuario;
    private String nome;
    private String cpf;
    private String email;
    private String senha;
    private int tipo;
    private Endereco endereco;
    private Telefone telefone;
    
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
    public void atualizarUsuario(){
        //código para ser feito com o auxlio do DB
    }
    
    public void desativarUsuario(){
        //código para ser feito com o auxlio do DB
    }
    
    public void consultarUsuario(){
        //código para ser feito com o auxlio do DB
    }
    
    public void listarUsuario(){
        //código para ser feito com o auxlio do DB
    }
}
