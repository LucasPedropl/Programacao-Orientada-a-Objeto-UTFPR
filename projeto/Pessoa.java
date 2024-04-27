//PEDRO LUCAS DA SILVA MOTA
//a2565943

public class Pessoa{

	private int cpf;
	private String nome;

	public int getCpf(){
		return cpf;
	}

	public String getNome(){
		return nome;
	}

	public void setCpf(int cpf) throws ExeptionInvalidCpf{
		if(Integer.toString(cpf).length() == 11){
			this.cpf = cpf;
		}else{
			throw new ExeptionInvalidCpf();
		}
	}

	public void setNome(String nome) throws ExeptionNomeGrande{
		if(nome.length() <= 0 || nome.length() > 20){
			this.nome = nome;
		}else{
			throw new ExeptionNomeGrande();
		}
		
	}

}

