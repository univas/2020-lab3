package br.edu.univas.factory;

import br.edu.univas.vo.Cliente;
import br.edu.univas.vo.ClientePF;
import br.edu.univas.vo.ClientePJ;

public class ClienteFactory {

	public static Cliente getCliente(int opcao) {
		if (opcao == 1) {
			return new ClientePF();
		} else if (opcao == 2) {
			return new ClientePJ();
		}
		return null;
	}
	
}
