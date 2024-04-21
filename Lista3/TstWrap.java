
import java.lang.Integer;

//PEDRO LUCAS DA SILVA MOTA
//A2565943

public class TstWrap {
    public static void main(String[] args) {
        Leitura l = new Leitura();

        int opc = 0;

        do {
            System.out.println("Menu de opções: ");
            System.out.println("1 - Testar Integer ");
            System.out.println("2 - Testar Boolean ");
            System.out.println("3 - Testar Character  ");
            System.out.println("4 - Testar Double  ");
            System.out.println("5 - Testar Byte ");
            System.out.println("6 - Testar Short ");
            System.out.println("7 - Testar Float ");
            System.out.println("8 - Testar Long ");
            System.out.println("0 - Encerrar programa ");
            System.out.println("Escolha uma opção: ");

            opc = (Integer.parseInt(l.entDados("")));

            switch (opc) {
                case 1:
                    TstInt inte = new TstInt();
                    int num1 = Integer.parseInt(l.entDados("Digite o valor do primeiro numero"));
                    int num2 = Integer.parseInt(l.entDados("Digite o valor do segundo numero"));

                    int valor = inte.compararNum(num1, num2);

                    System.out.println("Existem" + inte.contarBit(num1) + " bits/bit 1 no numero" + num1);
                    System.out.println("Existem" + inte.contarBit(num2) + " bits/bit 1 no numero" + num2);

                    if(valor == 0){
                        System.out.println(num1 + " é igual a " + num2);
                    }else if(valor < 0){
                        System.out.println(num1 + " é menor que " + num2);
                    }else{
                        System.out.println(num1 + " é maior que " + num2);
                    }

                    
                    break;
                case 2:
                    TstBool b = new TstBool();

                    Boolean bool = true;
                    String Str = l.entDados("Digite algo para ser convertido em booleano(qualquer coisa digitada qu não for true, sera convertido para false)");

                    String boolString = b.convert_String(bool);
                    boolean StringBool = b.convert_Boolean(Str);

                    System.out.println("A variavel boleana " + bool + " foi convertida para uma string " + boolString);
                    System.out.println("A String digitada " + Str + " foi convertida para um valor booleano " + StringBool);

                    break;
                case 3:
                    TstChar c = new TstChar();
                    
                    char let_min = l.entDados("Digite uma letra minuscula: ").charAt(0);
                    char let_mai = l.entDados("Digite uma letra maiuscula diferente da anterior: ").charAt(0);
                    
                    System.out.println(let_min + " foi convertida para " + c.converterMaiusculo(let_min));
                    System.out.println(let_mai + " foi convertida para " + c.converterMinusculo(let_mai));
                    break;
                case 4:
                    TstDoub d = new TstDoub();

                    Double num = 10.0000000;

                    double finito = 10 / 2;

                    System.out.println("O valor double" + num + "foi convertido para o valor primitivo de double " + d.transformarDouble(num));

                    System.out.println("O resultado da divisão de 10/2 resulta em um numero finito ou infinito ? (true ou false)");
                    System.out.println(d.finitoInfinito(finito));

                    break;
                case 5:

                TstByte by = new TstByte();

                String str1 = "10";   
                String str2 = "0x10";  
                String str3 = "010";
                
                Byte bit = 10;

                System.out.println("A string " + str1 + "foi convertida para bytes: " + by.converStr(str1));
                System.out.println("A string " + str2 + "foi convertida para bytes: " + by.converStr(str2));
                System.out.println("A string " + str3 + "foi convertida para bytes: " + by.converStr(str3));

                System.out.println("A Byte " + bit + "foi convertida para o valor primitivo byte: " + by.Byteparabyte(bit));

                    break;
                case 6:
                    TstShort sh = new TstShort();

                    Short sho = 10;
                    String str = "20";

                    System.out.println("A variavel sho " + sho + "foi convertida para o tipo primitivo sho " + sh.Shortparashort(sho));

                    System.out.println("A String str " + str + "foi convertida para o tipo short " + sh.Strparashort(str));

                    break;
                case 7:
                    TstFloat fl = new TstFloat();

                    Float numF = 3.14f;

                    System.out.println("Convertendo a variavel float" + numF + " para bite: " + fl.floatParaBite(numF));
                    System.out.println("Convertendo o resultado anterior" + fl.floatParaBite(numF) + " para float: " + fl.biteParaFloat(fl.floatParaBite(numF)));

                    break;
                case 8:
                    TstLong Lon = new TstLong();

                    Long dividendo = 10l;
                    Long divisor = 2l;

                    System.out.println("A divisão de " + dividendo + " / " + divisor + " é: " + Lon.divisao(dividendo, divisor));

                    System.out.println("A variavel Long dividendo " + dividendo + "foi convertida para o tipo primitivo long" + Lon.Longparalong(dividendo));
                    System.out.println("A variavel Long divisor " + divisor + "foi convertida para o tipo primitivo long" + Lon.Longparalong(divisor));

                    break;
                default:
                    break;
            }
        } while (opc != 0);
        System.out.println("Programa encerrado");
    }
}
