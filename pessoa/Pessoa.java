public class Pessoa{

	private int cpf;
	private String nome;
	private Endereco ender;

//================================================
	
	public Pessoa(){
		System.out.println("\n Const. Default");
		cpf = 0;
		nome = "";
		ender = new Endereco();
	}

public Pessoa(int cpf, String nome, Endereco ender){
		System.out.println("\n Const. Sobrec-1");
		this.cpf = cpf;
		this.nome = nome;
		this.ender = ender;
}

public Pessoa(Endereco ender, int cpf, String nome){
		System.out.println("\n Const. Sobrec-2");
		this.cpf = cpf;
		this.nome = nome;
		this.ender = ender;
}

//================================================
	public void impDados(){
		System.out.println("\n impDados Default");	
	}
	public int impDados(int y){
		System.out.println("\n impDados Sobrec-1");	
		return 0;
	}
//================================================

	public Endereco getEnder(){
		return ender;
	}

	public void setEnder(Endereco ender){
		this.ender = ender;
	}

	public int getCpf(){
		return cpf;
	}

	public String getNome(){
		return nome;
	}

	
	public void setCpf(int cpf){
		this.cpf = cpf;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}

	private boolean validaCpf(int cpf){
		System.out.println("\nVALIDACPF()");
		if(cpf>=0)return true;
		else return false;
	}
}

