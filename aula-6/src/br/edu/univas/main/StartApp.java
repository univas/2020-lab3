package br.edu.univas.main;

import br.edu.univas.vo.Cliente;
import br.edu.univas.vo.ContaCorrente;
import br.edu.univas.vo.ContaPoupanca;
import br.edu.univas.vo.Gerente;

public class StartApp {

	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		
		Cliente cliente1 = new Cliente();
		cliente1.setId(123);
		cliente1.setNome("Vinicius");
		
		ContaPoupanca conta1 = new ContaPoupanca(97532, cliente1, 1);
		gerente.addConta(conta1);
		conta1.depositar(1000);
		conta1.depositar(2000);
		conta1.sacar(400);
		System.out.println(conta1.getSaldo());
		
		Cliente cliente2 = new Cliente();
		cliente2.setId(8765);
		cliente2.setNome("Rodrigo");
		
		ContaCorrente conta2 = new ContaCorrente(4542, cliente2, 35, 125);
		boolean deuCerto = conta2.sacar(75);
		if (deuCerto == false) {
			System.out.println("Saldo insuficiente!");
		}
		
		conta2.depositar(700);
		conta2.transferenciaEletronica(conta1, 75);
		
		System.out.println("Saldo Vinicius: " + conta1.getSaldo());
		System.out.println("Saldo Rodrigo: " + conta2.getSaldo());
	}
	
}
