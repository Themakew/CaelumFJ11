
public class Conta {

  private double saldo;
	
		public void atualiza(double taxa){
			synchronized (this) {
				double saldoAtualiza = this.saldo * (1 + taxa);
				this.saldo = saldoAtualiza;	
			}
		}
		
		public void deposita(double valor){
			synchronized (this) {
				double novoSaldo = this.saldo + valor;
				this.saldo = novoSaldo;	
			}
		}
}
