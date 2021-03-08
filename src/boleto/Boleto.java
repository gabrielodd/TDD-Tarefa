package boleto;

import java.util.Date;

public class Boleto {
	private int codigo;
	Date data;
	private float valorPago;
	
	public Boleto(int codigo, float valorPago, Date data) {
		this.valorPago = valorPago;
		this.codigo = codigo;
		this.data = data;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public float getValorPago() {
		return valorPago;
	}

	public void setValorPago(float valorPago) {
		this.valorPago = valorPago;
	}
		
}
