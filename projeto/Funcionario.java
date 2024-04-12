public class Funcionario extends Pessoa{ 

	private int id;
	private String departamento;


//================================================

	public void impDados(){

System.out.println("\n impDados da CLASSE-FILHA Funcionario");
	
	}

	public void call_Met_Mae(){
		super.impDados();
	}

//================================================


	public void impCpfFilha(){
		System.out.println("\nimpressão do CPF NA CLASSE FILHA: "+ cpf);
	}

	public int getID(){
		return id;
	}

	public String getDepartamento(){
		return departamento;
	}

	
	public void setID(int id){
		this.id = id;
	}
	
	public void setDepartamento(String departamento){
		this.departamento = departamento;
	}
}

