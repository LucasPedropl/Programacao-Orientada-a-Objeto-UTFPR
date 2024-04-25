public class Pessoa{

	private int cpf;
	private String nome;

	public int getCpf(){
		return cpf;
	}

	public String getNome(){
		return nome;
	}

	public void setCpf(int cpf) throws CpfPeqException{
		if(cpf > 0){
			this.cpf = cpf;
		}else{
			throw new CpfPeqException();
		}
	}

	public void setNome(String nome) throws NomeGrandeException{
		if(nome.length() <= 10){
			this.nome = nome;
		}else{
			throw new NomeGrandeException();
		}
		
	}

}

