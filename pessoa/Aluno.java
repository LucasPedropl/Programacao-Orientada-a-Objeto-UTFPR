public class Aluno extends Pessoa{ 

	private int ra;
	private String curso;


//================================================

	public void impDados(){

System.out.println("\n impDados da CLASSE-FILHA ALUNO");
	
	}

	public void call_Met_Mae(){
		super.impDados();
	}

//================================================


	public void impCpfFilha(){
		System.out.println("\nimpressão do CPF NA CLASSE FILHA: "+ cpf);
	}

	public int getRa(){
		return ra;
	}

	public String getCurso(){
		return curso;
	}

	
	public void setRa(int ra){
		this.ra = ra;
	}
	
	public void setCurso(String curso){
		this.curso = curso;
	}
}
