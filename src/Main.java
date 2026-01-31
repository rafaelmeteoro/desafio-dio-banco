//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Banco novoBanco = new Banco("Novo Banco");

        Cliente cliente = new Cliente("Rafael");

        Conta cc = new ContaCorrente(cliente);
        cc.depositar(100);

        Conta poupanca = new ContaPoupanca(cliente);
        cc.transferir(75, poupanca);

        novoBanco.addConta(cc);
        novoBanco.addConta(poupanca);

        novoBanco.imprimeInfoBanco();
    }
}