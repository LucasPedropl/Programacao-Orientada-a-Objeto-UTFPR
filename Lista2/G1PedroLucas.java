// Nome: Pedro Lucas Mota
// RA: a2565943

public class G1PedroLucas {

    public static void main(String[] args) {

        Leitura l = new Leitura();

        int a = 0;
        int b = 0;
        int res = 0;
        int opc = 0;

        do {
            a = (Integer.parseInt(l.entDados("Digite o primeiro valor: ")));
            b = (Integer.parseInt(l.entDados("Digite o segundo valor: ")));

            System.out.println("Menu de opções: ");
            System.out.println("1 - Somar (a+b) ");
            System.out.println("2 - multiplicar (a*b) ");
            System.out.println("3 - subtrair (a-b) ");
            System.out.println("4 - dividir (a/b) ");
            System.out.println("0 - Encerrar ");
            System.out.println("Escolha uma opção: ");

            opc = (Integer.parseInt(l.entDados("")));

            switch (opc) {
                case 1:
                    res = a + b;
                    System.out.println("A soma de " + a + " + " + b + " é: " + res);
                    break;
                case 2:
                    res = a * b;
                    System.out.println("A multiplicação de " + a + " + " + b + " é: " + res);
                    break;
                case 3:
                    res = a - b;
                    System.out.println("A subtração de " + a + " + " + b + " é: " + res);
                    break;
                case 4:
                    res = a / b;
                    System.out.println("A divisão de " + a + " + " + b + " é: " + res);
                    break;

                default:
                    break;
            }
        } while (opc != 0);

    }
}
