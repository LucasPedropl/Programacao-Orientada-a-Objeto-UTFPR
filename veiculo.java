public class Veiculo{

	private int valor = 0;
	private String placa = "";
    private String marca = "";

	private Motor motor = new Motor();

	//VEICULO ----------------------------------------------------------------
	public int getValor(){
		return valor;
	}

	public String getPlaca(){
		return placa;
	}

    public String getMarca(){
		return marca;
	}
	
	public void setValor(int valor){
		this.valor = valor;
	}
	
	public void setPlaca(String placa){
		this.placa = placa;
	}

    public void setMarca(String marca){
		this.marca = marca;
	}

	//MOTOR ----------------------------------------------------------------

	public Motor getMotor(){
		return motor;
	}

	public void setMotor(Motor motor){
		this.motor = motor;
	}


}

