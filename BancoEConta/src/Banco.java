// Banco.java
import java.util.ArrayList;

public class Banco {
    private ArrayList<ContaBancaria> contas = new ArrayList<>();

    public void adicionarConta(ContaBancaria conta) {
        contas.add(conta);
        System.out.println("Conta adicionada com sucesso!");
    }

    public ContaBancaria buscarConta(String numeroConta) {
        for (ContaBancaria conta : contas) {
            if (conta.getNumeroConta().equals(numeroConta)) {
                return conta;
            }
        }
        return null;
    }
}


