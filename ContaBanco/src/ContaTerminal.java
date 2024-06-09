
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Agência: ");
        int numeroDaAgencia = scanner.nextInt();

        System.out.println("Por favor, informe sua Agência:");
        String agencia = scanner.next();

        System.out.println("Por favor, informe o seu nome: ");
        String nome = scanner.next();

        System.out.println("Por favor, digite o saldo da conta: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +", conta " + numeroDaAgencia + " e seu saldo " + saldo + " R$ já está disponível para saque.");
        
    }
} 
