import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

      Scanner sc = new Scanner(System.in);

      System.out.println("Por favor digite o número da agencia: ");
      int numero = sc.nextInt();
      sc.nextLine();
      System.out.println("Informe a agencia: ");
      String agencia = sc.nextLine();
      System.out.println("Informe o nome do cliente: ");
      String nomeCliente = sc.nextLine();
      System.out.println("Informe o saldo: ");
      double saldo = sc.nextDouble();

      System.out.println("Olá " + nomeCliente + ", obirgado por criar uma conta em nosso banco, sua agência é " + agencia
      + " conta " + numero + " e seu saldo " + saldo + " já está disponivel para saque");

      sc.close();
    }
}
