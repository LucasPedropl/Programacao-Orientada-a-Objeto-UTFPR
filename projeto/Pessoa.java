//PEDRO LUCAS DA SILVA MOTA
//a2565943

public class Pessoa{

	private String cpf;
	private String nome;
	private Endereco ender;

	public Pessoa(){
		this.cpf = "";
		this.nome = "";
		this.ender = new Endereco();
	}

	public String getCpf(){
		return cpf;
	}

	public String getNome(){
		return nome;
	}

	public Endereco getEnder(){
		return ender;
	}

	public void setEnder(Endereco ender){
		this.ender = ender;
	}

	public void setCpf(String cpf) throws ExceptionInvalidCpf{
		if(cpf.length() == 11){
			this.cpf = cpf;
		}else{
			throw new ExceptionInvalidCpf();
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

