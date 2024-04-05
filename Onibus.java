public class Esportivo extends Veiculo{

    private int tamanho = 0;
	private int numeroAssentos = "";


	//VEICULO ----------------------------------------------------------------
	public int getTamanho(){
		return tamanho;
	}

	public String getNumAssentos(){
		return numeroAssentos;
	}
	
	public void setVelocidadeMax(int velocidadeMax){
		this.velocidadeMax = velocidadeMax;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}

}

