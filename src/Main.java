import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContaTerminal contaTerminal = new ContaTerminal();
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("qual o número da sua conta?");
        contaTerminal.setNumeroConta(scanner.nextInt());

        System.out.println("qual é a sua agência?");
        contaTerminal.setAgencia(scanner.next());

        System.out.println("seu nome:");
        contaTerminal.setNomeCliente(scanner.next());

        System.out.println("seu saldo atual:");
        contaTerminal.setSaldo(scanner.nextDouble());

        int numeroConta = contaTerminal.getNumeroConta();
        String agencia = contaTerminal.getAgencia();
        String nomeCliente = contaTerminal.getNomeCliente();
        double saldo = contaTerminal.getSaldo();

        System.out.println
                (
                "Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco,"
                        + " sua agência é" + agencia + ","
                        + " conta:" + numeroConta
                        + " e seu saldo:"+ saldo +
                        " ja esta disponível para saque"
                );
    }
}