package processadorBoletos;

import fatura.Fatura;
import pagamento.Pagamento;
import boleto.Boleto;

import java.util.ArrayList;
import java.util.Date;


public class ProcessadorBoletos {
	public static void adicionaBoletos(ArrayList<Boleto> boletos, Fatura fatura) {
		for(int i = 0; i < boletos.size(); i++) {
			float valor = boletos.get(i).getValorPago();
			Pagamento pagamento = new Pagamento(valor, new Date(), "BOLETO");
			fatura.addPagamento(pagamento);
		}
		
		if(fatura.getValorTotalPagamentos() >= fatura.getValorTotal()) {
			fatura.setPago(true);
		}
	}
}
