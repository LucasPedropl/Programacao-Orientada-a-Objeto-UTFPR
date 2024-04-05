public class TstVeic{

	public static void main(String [] arg){ //classLoader

        Veiculo v1 = new Veiculo();
        Leitura l = new Leitura();
        Esportivo e1 = new Esportivo();

        e1.setNome(l.entDados("\nNome: "));
        e1.setValor(Integer.parseInt(l.entDados("\nValor")));
        e1.setMarca(l.entDados("\nMarca: "));
        e1.setVelocidadeMax(Integer.parseInt(l.entDados("\nVelocidade max: ")));
        
        System.out.println("\nNOME.: "+e1.getNome());
        System.out.println("\nVALOR.: "+e1.getValor());
        System.out.println("\nMARCA.: "+e1.getMarca());
        System.out.println("\nVelocidade max.: "+e1.getVelocidadeMax());
	}

}


