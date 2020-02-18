package decorator;

import interfaces.ICuentaBancaria;
import model.Cuenta;

public class SeguroDecorator extends CuentaDecorator {

	public SeguroDecorator(ICuentaBancaria cuentaDecorada) {
		super(cuentaDecorada);
	}

	@Override
	public void abrirCuenta(Cuenta c) {
		cuentaDecorada.abrirCuenta(c);
		asegurarCuenta(c);
	}

	public void asegurarCuenta(Cuenta c) {		
		System.out.println("Se agregó seguro a la cuenta del cliente " + c.getCliente());
	}

}