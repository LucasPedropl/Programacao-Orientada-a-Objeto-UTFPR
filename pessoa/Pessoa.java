public class Pessoa{

	private int cpf;
	private String nome;
	
	public Pessoa(){
		cpf = 0;
		nome = "";
	}

	public Pessoa(int cpf, String nome){
		this.cpf = cpf;
		this.nome = nome;
	}

	public int getCpf(){
		return cpf;
	}

	public String getNome(){
		return nome;
	}

/* ========================================
THROWS(com "s"):"AVISO"->"POSSO" lançar 1 objeto tipo tal..
THROW(sem "s"): "ORDEM" -> "LANCE" o bojto tipo tal...
*/
	
	
	public void setCpf(int cpf) throws CpfPeqException{
		if(cpf > 0){
			this.cpf = cpf;
		}
		else{
			throw new CpfPeqException();
		}
	}


	public void setNome(String nome){
		this.nome = nome;
	}

}

