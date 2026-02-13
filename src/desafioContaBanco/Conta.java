package desafioContaBanco;

public class Conta {
	 String numeroConta;
	 String dono;
	 double saldo;
	 double limite;

	Conta(String dono, String numeroConta, double saldo, double limite) {
		this.dono = dono;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
		this.limite = limite;
	}
	
	
	
	
public boolean sacar(double valor) {
	if(valor > (this.saldo + this.limite)){
		System.out.println("Saldo insifuciente para saque de: " + valor);
		return false;
	} this.saldo -=saldo;
	return true;
}
	boolean depositar(double valorDeposito) {
		if(valorDeposito<0) {
			System.out.println("Informe um valor válido para depósito");
			return false;
		}   this.saldo+=valorDeposito;
		return true;
	}

	String getDadosFormatado() {
		return String.format("""
				==========
				
				Dono: %s
				Conta: %s
				Saldo: R$ %.2f
				Limite: R$ %.2f
				
				==========""", dono,numeroConta,saldo,limite);
	}
}
