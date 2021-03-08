package pagamento;

import java.util.Date;

import fatura.Fatura;

public class Pagamento {
	float valorPago;
	Date data;
	String tipoPagamento;
	
	public Pagamento(float valorPago, Date data, String tipoPagamento) {
		this.valorPago = valorPago;
		this.data = data;
		this.tipoPagamento = tipoPagamento;
		
	}
	
	public float getValorPago() {
		return valorPago;
	}

	public void setValorPago(float valorPago) {
		this.valorPago = valorPago;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getTipoPagamento() {
		return tipoPagamento;
	}

	public void setTipoPagamento(String tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
	}
}
