//PEDRO LUCAS DA SILVA MOTA
//a2565943

public class Empresa {
    private String cnpj;
    private String nome;
    private Cliente cliente;
    private LiderProjeto lider;
    private Projeto projeto;

    public Empresa(){
        this.cnpj = "";
        this.nome = "";
        this.cliente = new Cliente();
        this.lider = new LiderProjeto();
        this.projeto = new Projeto();
    }

    public String getCnpj(){
        return cnpj;
    }

    public String getNome(){
        return nome;
    }

    public Pessoa getCliente() {
        return cliente;
    }

    public LiderProjeto getLider() {
        return lider;
    }

    public Projeto getProjeto() {
        return projeto;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setLider(LiderProjeto lider) {
        this.lider = lider;
    }

    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
    }

    public void setCnpj(String cnpj) throws ExceptionInvalidCnpj{
        if(cnpj.length() == 14){
            this.cnpj = cnpj;
        }else{
            throw new ExceptionInvalidCnpj();
        }
    }

    public void setNome(String nome) throws ExceptionInvalidNome{
		if(nome.length() > 0 && nome.length() < 20){
			this.nome = nome;
		}else{
			throw new ExceptionInvalidNome();
		}
	}
}
