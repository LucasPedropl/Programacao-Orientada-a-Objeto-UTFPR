//PEDRO LUCAS DA SILVA MOTA
//a2565943

public class LiderProjeto extends Pessoa{

	private String codFun;
	private String senioridade ;
	private Dependentes dependente;

	public LiderProjeto(){
		this.codFun = "";
		this.senioridade  = "";
		this.dependente = new Dependentes();
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
}