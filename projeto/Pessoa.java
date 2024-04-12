public class Pessoa{

	protected int cpf;

	private int segSoc;
	private String nome;

	private Endereco ender;

//================================================

	public void impDados(){

System.out.println("\n impDados da classe-mae PESSOA");
	
	}

//================================================
	
	public Pessoa(){
		System.out.println("\n Const. Default");
		cpf = 0;
		nome = "";
		segSoc = 0;
		ender = new Endereco();
	}

public Pessoa(int cpf, String nome, Endereco ender, int segSoc){
		System.out.println("\n Const. Sobrec-1");
		this.cpf = cpf;
		this.segSoc = segSoc;
		this.nome = nome;
		this.ender = ender;
}


	public Endereco getEnder(){
		return ender;
	}

	public void setEnder(Endereco ender){
		this.ender = ender;
	}

	public int getCpf(){
		return cpf;
	}

	public int getSegSoc(){
		return segSoc;
	}

	public String getNome(){
		return nome;
	}

	
	public void setCpf(int cpf){
		this.cpf = cpf;
	}

	public void setSegSoc(int segSoc){
		this.segSoc = segSoc;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}

}

