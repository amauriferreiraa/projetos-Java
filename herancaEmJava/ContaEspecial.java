package adoPoo1;
/*
 * Atividade #3 
 * POO - Programação Orientadea a objetos
 * 
 */
//
/*

 * Tarefas: 
 * 1) Faca com que a classe ContaEspecial estenda a classe Conta 
 * 2) Adicione o atributo limite do tipo double e o encapsule 
 * 3) Crie construtores da classe obrigando a passagem do valor do limite na criacao de objetos 
 *  e todos os parametros necessarios anteriormente. 
 * 4) Faca override do metodo imprimeDados fazendo com que ele imprima tambem o
 *  valor do limite alem do tipo da conta (CONTA ESPECIAL) 
 * 5) Faca override do metodo saque para que ele considere o limite na hora de 
 *    verificar se existe ou nao saldo disponivel.
 *    Faca tambem com que este metodo acumule o CPMF devido.
 */
public class ContaEspecial extends Conta{
	private double limite;

	public ContaEspecial(double saldoInicial, String num, Cliente tit, Agencia ag, double limite) {
		super(saldoInicial, num, tit, ag);
		this.limite = saldo;
	}
	
	public ContaEspecial(double limite, String num, Cliente tit, Agencia ag) {
        super(num, tit, ag);
        setLimite(limite);
    }
	
	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	public void imprimeContaEsp() {
		super.imprimeDados();
		System.out.println("limite: "+limite);
	}
	
	public void saqueEspecial(double valor) {
		if(valor <= this.saldo && valor <= limite) {
			if(valor > 0)
			saque(valor);
			acumularCPMF(valor);
			System.out.println("Realizando saque de "+ valor +  " da conta especial");
			saldo = saldo - valor;

		}
		else {System.out.println("valor de "+ valor + " indisponivel para saque.");
			
		}

		
	}
}
