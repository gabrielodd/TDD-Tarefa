package fatura;

import java.util.Date;
import java.util.Iterator;
import java.util.ArrayList;

import pagamento.Pagamento;

public class Fatura {
	private Boolean pago;
	Date data;
	private float valorTotal;
	private String nomeCliente;
	private ArrayList pagamentos;
	
	public Fatura(Date data, float valorTotal, String nomeCliente) {
		this.data = data;
		this.valorTotal = valorTotal;
		this.nomeCliente = nomeCliente;
		this.pago = false;
		pagamentos = new ArrayList();
	}
	
	public void addPagamento(Pagamento pagamento) {
		pagamentos.add(pagamento);
	}
	
	public double getValorTotalPagamentos() {
		double valorTotal = 0.0;
		
		for (Iterator i = pagamentos.iterator(); i.hasNext();) {
			Pagamento pagamento = (Pagamento) i.next();
			valorTotal += pagamento.getValorPago();
		}
		
		return valorTotal;
	}
	
	public Boolean getPago() {
		return pago;
	}
	public void setPago(Boolean pago) {
		this.pago = pago;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public float getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(float valorTotal) {
		this.valorTotal = valorTotal;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
		
}
