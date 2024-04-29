//PEDRO LUCAS DA SILVA MOTA
//a2565943

public class Endereco {

	private int num;
	private String rua;

	public Endereco() {
		this.num = 0;
		this.rua = "Rua não informada";
	}

	public int getNum() {
		return num;
	}

	public String getRua() {
		return rua;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}
}
