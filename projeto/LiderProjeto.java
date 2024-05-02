//PEDRO LUCAS DA SILVA MOTA
//a2565943

public class LiderProjeto extends Pessoa implements InterfaceContato{

	private String codFun;
	private String senioridade ;
	private Dependentes dependente;
	private String email;
    private String telefone;
    private String celular;

	public LiderProjeto(){
		this.codFun = "";
		this.senioridade  = "";
		this.dependente = new Dependentes();
		email = "";
        telefone = "";
        celular = "";
	}

	public String getCodFun() {
		return codFun;
	}

	public String getSenioridade () {
		return senioridade;
	}

	public Dependentes getDependente() {
		return dependente;
	}

	public void setDependente(Dependentes dependente) {
		this.dependente = dependente;
	}

	public void setSenioridade (String senioridade ) {
		this.senioridade  = senioridade ;
	}

	public void setCodFun(String codFun) throws ExceptionInvalidCodFun{
		this.codFun = codFun;
		if(codFun.length() > 0){
            this.codFun = codFun;
        }else{
            throw new ExceptionInvalidCodFun();
        }
	}

	public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setEmail(String email) {
        this.email = email;
        
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
        
    }

    public void setCelular(String celular) {
        this.celular = celular;
        
    }
}