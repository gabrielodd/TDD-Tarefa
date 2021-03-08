package processadorBoletos;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import boleto.Boleto;
import fatura.Fatura;

class ProcessadorBoletosTest {

	private Fatura fatura;
	private ArrayList<Boleto> boletos = new ArrayList();
	
	@BeforeEach
	public void inicializaFatura() {
		fatura = new Fatura(new Date(), 1500, "Cliente 1");
		Boleto boleto1 = new Boleto(123, 250, new Date()); 
		
		boletos.add(boleto1);
	}
	
	@Test
	public void testFaturaNaoPaga() {
		ProcessadorBoletos.adicionaBoletos(boletos, fatura);
		
		assertFalse(fatura.getPago());
		
		assertEquals(fatura.getValorTotalPagamentos(), 250);
	}

	@Test
	public void testFaturaPaga() {
		Boleto boleto2 = new Boleto(123, 500, new Date());
		Boleto boleto3 = new Boleto(123, 1000, new Date());
		
		boletos.add(boleto2);
		boletos.add(boleto3);
		
		ProcessadorBoletos.adicionaBoletos(boletos, fatura);
		
		assertTrue(fatura.getPago());
		
		assertEquals(fatura.getValorTotalPagamentos(), 1750);
	}
}
