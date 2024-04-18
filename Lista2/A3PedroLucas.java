// Nome: Pedro Lucas Mota
// RA: a2565943

public class A3PedroLucas{

    private String name = "Pedro";
    private String nome = "";
    private int cpf = 1205222563;
    private int RA = 1455;
    public static void main(String arg[]){
        System.out.println("Facim Facim!!!");

        //Questão 1
        System.out.println("\nFacim Facim parte 2!!!");

        //Questão 2
        A3PedroLucas ex = new A3PedroLucas();
        System.out.println("\nNome:" + ex.name);
        System.out.println("CPF: " + ex.cpf);
        System.out.println("RA: " + ex.RA);

        //Questão 3
        Leitura l = new Leitura();
        ex.nome = l.entDados("\nDigite o nome da pessoa: ");
        System.out.println("Meu nome é: " + ex.nome);
    }
}