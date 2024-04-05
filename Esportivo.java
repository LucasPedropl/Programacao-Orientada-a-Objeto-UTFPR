public class Esportivo extends Veiculo{

    private int velocidadeMax = 0;
	private String nome = "";


	//VEICULO ----------------------------------------------------------------
	public int getVelocidadeMax(){
		return velocidadeMax;
	}

	public String getNome(){
		return nome;
	}
	
	public void setVelocidadeMax(int velocidadeMax){
		this.velocidadeMax = velocidadeMax;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}

}

