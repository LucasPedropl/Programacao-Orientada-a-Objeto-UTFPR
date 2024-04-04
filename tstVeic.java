public class TstVeic{

	public static void main(String [] arg){ //classLoader

        Veiculo v1 = new Veiculo();
        Leitura l = new Leitura();

        v1.setValor(Integer.parseInt(l.entDados("\nVALOR.: ")));
        v1.setPlaca(l.entDados("\nPLACA..: "));
        v1.setMarca(l.entDados("\nMARCA..: "));

        v1.getMotor().setMaterial(l.entDados("MATERIAL: "));
        v1.getMotor().setPotencia(Integer.parseInt(l.entDados(/"POTENCIA: ")));

        System.out.println("\nVALOR.: "+v1.getValor());
        System.out.println("\nPLACA: "+v1.getPlaca());
        System.out.println("\nMARCA: "+v1.getMarca());

        System.out.println("\nMATERIAL.: "+v1.getMotor().getMaterial());
        System.out.println("\nPOTENCIA: "+v1.getMotor().getPotencia());

	}

}


