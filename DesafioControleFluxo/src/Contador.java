import java.util.Scanner;

class ParametrosInvalidosException extends Exception {
}

public class Contador {
    public static void main(String[] args)  {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro: ");
        int parametroum = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro: ");
        int parametrodois = terminal.nextInt(); 

        try {
            contar(parametrodois, parametroum);
            }
        catch(ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

public static void contar(int parametrodois, int parametroum) throws ParametrosInvalidosException{

    if (parametrodois <= parametroum) {
        throw new ParametrosInvalidosException("aaaaaa");
    }
    int diferenca = parametrodois - parametroum;

    for (int  contagem = 0 ; contagem < diferenca ; contagem++){
        System.out.println("Imprimindo o numero 1: " + parametroum + "Imprimindo o numero 2: " + parametrodois);
    }; 

}


}