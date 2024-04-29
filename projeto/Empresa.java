//PEDRO LUCAS DA SILVA MOTA
//a2565943

public class Empresa {
    private String cnpj;
    private String nome;
    private Pessoa pessoa;

    public Empresa(){
        this.cnpj = "";
        this.nome = "";
        this.pessoa = new Pessoa();
    }

    public String getCnpj(){
        return cnpj;
    }

    public String getNome(){
        return nome;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
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
