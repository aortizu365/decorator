import decorator.SeguroDecorator;
import implementacion.CuentaAhorro;
import interfaces.ICuentaBancaria;
import model.Cuenta;

public class App {

	public static void main(String[] args) {
		Cuenta c = new Cuenta(1, "Juan Perez");	
		
		ICuentaBancaria cuenta = new CuentaAhorro();
		ICuentaBancaria cuentaAsegurada = new SeguroDecorator(cuenta);
		
		cuenta.abrirCuenta(c);
		cuentaAsegurada.abrirCuenta(c);
	}

}
