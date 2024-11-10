// Main.java
public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();

        ContaBancaria conta1 = new ContaBancaria("001", "Maria");
        banco.adicionarConta(conta1);

        conta1.depositar(500);
        conta1.sacar(200);
        conta1.exibirSaldo();
    }
}
