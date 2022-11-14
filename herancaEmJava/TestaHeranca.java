
package adoPoo1;
 /* Atividade #3 
 * POO - Programação Orientadea a objetos
 * 
 */
 //
 /*
 * 
 * Esta classe e responsavel pelo teste das Herancas desenvolvidas nas classes 
 *  Conta e ContaEspecial
 * 
 * Altere o metodo main fazendo com que sejam criadas 02 contas especiais e 01 conta poupanca. 
 * Realize 1 saque na 1a. conta especial cujo valor exceda o saldo mas nao ultrapasse o limite.
 * Realize 1 saque na 2a. conta especial cujo valor ultrapasse o saldo e o limite.
 * Realize 1 saque na conta poupanca que exceda o saldo.
 * Imprima os dados das contas para conferir se estao corretas.
 * 
 * Dica: Para obter a data do sistema e transformar em String: 
 *  String strData = new java.util.Date().toString();
 * 
 */
public class TestaHeranca {

    public static void main(String args[]) {
        Banco banco = new Banco("POO Bank", 1000);
        Agencia ag1 = new Agencia("001", banco);
        
        Cliente cliente1 = new Cliente("Cliente 1", "1232323");
        Cliente cliente2 = new Cliente("Cliente 2", "987789");
        Cliente cliente3 = new Cliente("Cliente 2", "987789");

        Conta conta = new Conta(600, "741852", cliente1, ag1); // conta comum
        //conta.saque(560);
        //conta.imprimeDados();
        System.out.println();
        
        ContaEspecial contaEsp1 = new ContaEspecial(1655, "666", cliente2, ag1, 15071988); // 1a. conta especial
        
        ContaEspecial contaEsp2 = new ContaEspecial(4546, "555", cliente3, ag1, 16022022); // 2a. conta especial
        
        ContaPoupanca contaPoup = new ContaPoupanca(600, "", cliente2, ag1, "16021669"); // conta poupanca
        //contaPoup.saque(566);
        //contaEsp1.imprimeContaEsp();
        contaEsp1.saqueEspecial(500);
       // contaEsp1.saqueEspecial(2000);
        //contaPoup.saquePoupanca(500);
        //contaPoup.imprimePoupanca();
        contaEsp1.imprimeContaEsp();
        contaEsp2.imprimeContaEsp();


    }
}
