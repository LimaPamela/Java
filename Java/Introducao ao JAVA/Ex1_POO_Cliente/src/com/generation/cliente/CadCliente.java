package com.generation.cliente;

import com.generation.cliente.model.Cliente;

public class CadCliente {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente(1, "141254124" , "Cássio", null, null, 984587463);
		c1.visualizar();
		c1.setNome("Pamela");
		System.out.println("\n Alteração do nome do cliente de Cássio, para: " + c1.getNome());
		c1.visualizar();
	}

}
