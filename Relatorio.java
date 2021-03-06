package hydra;

public class Relatorio {
    private int idRelatorio;
    private int tipo;
    private int dia;
    private int mes;
    private int ano;
    
    public Relatorio(){
        System.out.println("Classe Relatorio foi instanciada!");
    }
    
    public Relatorio(int idRelatorio, int tipo, int dia, int mes, int ano) {
        this.idRelatorio = idRelatorio;
        this.tipo = tipo;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    public int getIdRelatorio() {
        return idRelatorio;
    }

    public void setIdRelatorio(int idRelatorio) {
        this.idRelatorio = idRelatorio;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }   
    
    
}
