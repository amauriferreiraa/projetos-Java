package adoPoo1;
/*
 * Atividade #3 
 * POO - Programação Orientadea a objetos
 * 
 */
//
/*
 * Academia do Java
 * 
 * Tarefas: 
 * 1) Faca com que a classe ContaPoupanca estenda a classe Conta 
 * 2) Adicione o atributo data de aniversario (dataAniversario) a classe ContaPoupanca,
 *  declarando-o como String e encapsule o atributo 
 * 3) Crie um construtor para a classe ContaPoupanca obrigando a passagem da data de 
 *  aniversario e todos os parametros necessarios para abertura de Conta 
 * 4) Faca override do metodo imprimeDados fazendo com que ele imprima
 *  tambem a data de aniversario e o tipo da conta (CONTA POUPANCA) em seu cabecalho
 */
public class ContaPoupanca extends Conta{
	private String dataAniversario;
	double limite;
	

	public ContaPoupanca(double saldoInicial, String num, Cliente tit, Agencia ag, String dataAniversario) {
		super(saldoInicial, num, tit, ag);
		this.dataAniversario = dataAniversario;
		limite = saldo;
	}

	public String getDataAniversario() {
		return dataAniversario;
	}

	public void setDataAniversario(String dataAniversario) {
		this.dataAniversario = dataAniversario;
	}
	
	public void imprimePoupanca() {
		System.out.println("======================================");
        agencia.imprimeDados();
        System.out.println("Numero da conta: " + numero);
        titular.imprimeDados();
        System.out.println("Data de aniversario: " + dataAniversario);
        System.out.println("Saldo  : R$" + saldo);
        System.out.println("CPMF devido: R$" + acumuladorCPMF);
        System.out.println("========================================");
	}
	public void saquePoupanca(double valor) {
		if(valor <= this.saldo && valor <= limite) {
			if(valor > 0)
			//saque(valor);
			System.out.println("Realizando saque de "+ valor +  " da conta poupanca");
			saldo = saldo - valor;
		}
		else {System.out.println("valor de "+ valor + " indisponivel para saque.");
			
		}
}
}

