package hydra;

public class HYDRA{

    public static void main(String[] args) {
        Admin adm = new Admin();
        Usuario  user = new Usuario();
        Endereco end = new Endereco();
        Telefone tel = new Telefone();
        Quadro qua = new Quadro();
        Compra comp = new Compra();
        Relatorio rel = new Relatorio();
        RelatorioCompraUsuario rcu = new RelatorioCompraUsuario();
        RelatorioAdmin ra = new RelatorioAdmin();
        Carrinho car = new Carrinho();
        
        //Exemplo de cadastro de Admin
        adm.setLogin("1234");
        adm.setSenha("4321");
        
        System.out.println("-------------Login ADM-------------");
        System.out.println("Login: " + adm.getLogin());
        System.out.println("Senha: " + adm.getSenha());
        //Fim do Exemplo de cadastro de Admin
        
        //Exemplo de cadastro de Usuario
        user.setNome("Javier");
        user.setCpf("123.456.789-10");
        user.setEmail("jav123@gmail.com");
        user.setSenha("abcd1234");
        end.setLogradouro("Rua");
        end.setBairro("bairro");
        end.setNumero(1);
        end.setCep("cep");
        end.setComplemento("casa");
        tel.setCelular("(22) 2222-2222");
        tel.setFixo("4002-8922");
        
        System.out.println("-------------Login USER-------------");
        System.out.println("Nome: " + user.getNome());
        System.out.println("CPF: " + user.getCpf());
        System.out.println("E-mail: " + user.getEmail());
        System.out.println("Senha: " + user.getSenha());
        System.out.println("Logradouro: " + end.getLogradouro());
        System.out.println("Bairro: " + end.getBairro());
        System.out.println("Número: " + end.getNumero());
        System.out.println("CEP: " + end.getCep());
        System.out.println("Complemento: " + end.getComplemento());
        System.out.println("Celular: " + tel.getCelular());
        System.out.println("Fixo: " + tel.getFixo());
        //Fim do Exemplo de cadastro de Usuario
        
        //Exemplo de cadastro de Quadro
        qua.setTamanho(1);
        qua.setQuantidade(3);
        qua.setValor_produto(9);
        qua.setMiniatura("ali");
        qua.setDescricao("bonito");
        
        System.out.println("-------------QUADRO-------------");
        System.out.println("Tamanho: " + qua.getTamanho());
        System.out.println("Quantidade: " + qua.getQuantidade());
        System.out.println("Valor R$: " + qua.getValor_produto());
        System.out.println("Miniatura: " + qua.getMiniatura());
        System.out.println("Descrição: " + qua.getDescricao());
        //Fim do Exemplo de cadastro de Quadro
        
        //Exemplo de cadastro de Relatorio
        rel.setTipo(1);
        rel.setDia(22);
        rel.setMes(7);
        rel.setAno(2019);
        
        System.out.println("-------------RELATÓRIO-------------");
        System.out.println("Tipo: " + rel.getTipo());
        System.out.println("Dia: " + rel.getDia());
        System.out.println("Mês: " + rel.getMes());
        System.out.println("Ano: " + rel.getAno());
        //Fim do Exemplo de cadastro de Relatorio
    }
    
}
