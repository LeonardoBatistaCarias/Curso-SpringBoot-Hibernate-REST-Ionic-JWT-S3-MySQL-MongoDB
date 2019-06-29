package com.leonardobatista.cursomc.services;

import java.util.Calendar;
import java.util.Date;

import org.springframework.stereotype.Service;

import com.leonardobatista.cursomc.domain.PagamentoComBoleto;

@Service
public class BoletoService {
	public void preencherPagamentoComBoleto(PagamentoComBoleto pagto, Date instanteDoPedido) {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DAY_OF_MONTH, 7);
		pagto.setDataPagamento(cal.getTime());
		
	}
}
