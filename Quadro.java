package hydra;

public class Quadro {
    private int codigo;
    private int tamanho;
    private int quantidade;
    private float valor_produto;
    private String miniatura;
    private String descricao;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getValor_produto() {
        return valor_produto;
    }

    public void setValor_produto(float valor_produto) {
        this.valor_produto = valor_produto;
    }

    public String getMiniatura() {
        return miniatura;
    }

    public void setMiniatura(String miniatura) {
        this.miniatura = miniatura;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public void atualizarQuadro(){
        //código para ser feito com o auxlio do DB
    }
    
    public void desativarQuadro(){
        //código para ser feito com o auxlio do DB
    }
    
    public void consultarQuadro(){
        //código para ser feito com o auxlio do DB
    }
    
    public void gerarAlerta(){
        //código para ser feito com o auxlio do DB
    }
}
