public class ContLetPedroLucas {

    public static void main(String[] args) {
        Leitura l = new Leitura();

        
        String frase = l.entDados("Digite uma frase: ");

        
        String letraInput = l.entDados("Digite uma letra: ");
        char letra = letraInput.charAt(0);

        
        letra = Character.toLowerCase(letra);

        
        int ocorrencias = 0;
        StringBuilder posicoes = new StringBuilder();
        for (int i = 0; i < frase.length(); i++) {
            char caractere = Character.toLowerCase(frase.charAt(i));
            if (caractere == letra) {
                ocorrencias++;
                posicoes.append(i + 1).append(" ");
            }
        }

        if (ocorrencias > 0) {
            System.out.println("A letra '" + letra + "' aparece " + ocorrencias + " vezes na frase, nas posições: " + posicoes);
        } else {
            System.out.println("A letra '" + letra + "' não existe na frase.");
        }
    }
}
