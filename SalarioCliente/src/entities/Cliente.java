package entities;

public class Cliente {
	
	public String nome;
	public double salarioBruto;
	public double imposto;
	
	public double salarioLiquido() {
		return salarioBruto - imposto;
	}
	public void acressimoSalario(double acressimo) {
		this.salarioBruto += salarioBruto * (acressimo/100);
	
	}
	
	public String toString() {
		return "Cliente: " 
				+ nome 
				+ ", $ "
				+ salarioLiquido();
	}

}
