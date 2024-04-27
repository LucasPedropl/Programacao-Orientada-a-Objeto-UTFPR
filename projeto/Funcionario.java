//PEDRO LUCAS DA SILVA MOTA
//a2565943

public class Funcionario extends Pessoa{

	private int codFun;
	private String cargo;

	public int getCodFun() {
		return codFun;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public void setCodFun(int codFun) {
		this.codFun = codFun;
	}
}