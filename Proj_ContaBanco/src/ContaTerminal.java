import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) {
    /*int numero = Integer.valueOf(args[0]);
    int agencia = Integer.valueOf(args[1]);
    String nome = args[2];
    String sobrenome = args[3];
    double saldo = Double.valueOf(args[4]);
    */ //para uso no terminal

    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Digite o número da conta: ");
    int numero = scanner.nextInt();
    System.out.println("Digite a agência da conta: ");
    int agencia = scanner.nextInt();
    System.out.println("Digite o nome do cliente: ");
    String nome = scanner.next();
    System.out.println("Digite o sobrenome do cliente: ");
    String sobrenome = scanner.next();
    System.out.println("Digite o saldo da conta: ");
    double saldo = scanner.nextDouble();


    System.out.println("O número da conta é: " + numero);
    System.out.println("A agência da conta é: " + agencia);
    System.out.println("O nome do cliente é: " + nome + " " + sobrenome);
    System.out.println("O saldo da conta é: " + saldo);
    }
}
