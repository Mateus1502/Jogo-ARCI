import java.util.Scanner;

public class cartas {
    public static void main(String[] args) {
        //Só colocando um "CSS"
        final String RED = "\u001B[31m";
        final String RESET = "\u001B[0m";
        final String BLUE = "\u001B[34m";
        System.out.println(BLUE+"Pronto para jogar? Aqui vão algumas regras básicas:");
        System.out.println("Os operadores lógicos são representados por:");
        System.out.println("&& : AND");
        System.out.println("|| : OR");
        System.out.println("^  : XOR");
        System.out.println("!  : NOT");
        System.out.println("As condições aqui serão representadas por 1 e 0, para facilitar a visualização :)");
        System.out.println("Informe o operador e duas condições e pronto, entendeu as regras? Então bora!!!!"+RESET);
        System.out.println("---------------------------------------------------------");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a primeira condição: ");
        int condicao1 = scanner.nextInt();
        System.out.println("Informe a segunda condição");
        int condicao2 = scanner.nextInt();
        //Esse scanner irá pegar a próxima linha em branco que iria fazer travar o operador(sofri aqui :( )
        scanner.nextLine();
        if(condicao1!=0 && condicao1!=1 ){
            System.out.println(RED+"Inválido"+RESET);
            return;
        }
        if(condicao2!=0 && condicao2!=1){
            System.out.println(RED+"Inválido"+RESET);
            return;
        }
        System.out.println("Agora informe o operador: ");
        String operador = scanner.nextLine();
        //Estou transformando as condições em booleanos para poder usar os operadores lógicos
        //Qualquer coisa diferente de 0 é true
        boolean condicaoB1=condicao1!=0;
        boolean condicaoB2=condicao2!=0;

        boolean saida;
        switch (operador) {
            case "&&":  // Operador AND lógico
                saida = condicaoB1 && condicaoB2;
                break;
            case "||":
                saida = condicaoB1 || condicaoB2;
                break;
            case "^":
                saida = condicaoB1 ^ condicaoB2;
                break;
            case "!":
                saida = !condicaoB1;
            default:
                System.out.println("Você inseriu um valor inválido, favor verificar");
                return;
        }
        if(saida==false){
            System.out.println("Uma ferrari com asa é mais rápida");
        }else{
            System.out.println("GOAT = Sir Lewis Hamilton");
        }
    }
}
