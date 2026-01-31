import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contas;

    public Banco(String nome) {
        this.nome = nome;
        contas = new ArrayList<Conta>();
    }

    public String getNome() {
        return nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void addConta(Conta conta) {
        contas.add(conta);
    }

    public void imprimeInfoBanco() {
        System.out.println(String.format("Nome Banco: %s", this.nome));
        System.out.println();
        System.out.println("Contas");
        System.out.println();
        for (Conta conta : contas) {
            conta.imprimirExtrato();
        }
    }
}
