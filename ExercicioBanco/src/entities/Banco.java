package entities;

public class Banco {
	
	private int numeroconta;
	private String titular;
	private double saldo;
	
	public Banco(int numeroconta, String titular) {
		this.numeroconta = numeroconta;
		this.titular = titular;
	}

	public Banco(int numeroconta, String titular, double primeiroDeposito) {
		this.numeroconta = numeroconta;
		this.titular = titular;
		depositar(primeiroDeposito);
	}

	public int getNumeroconta() {
		return numeroconta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void depositar(double quantia) {
		saldo += quantia;
	}
	public void retirar(double quantia) {
		saldo -= quantia + 5.0;
	}
	
	public String toString() {
		return "Conta "
				+ numeroconta
				+", Titular "
				+ titular
				+ ", Saldo $ "
				+ String.format("%.2f", saldo);
	}


	

}
