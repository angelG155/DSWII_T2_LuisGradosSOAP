package com.cibertec.edu.services;

import java.util.List;

import com.cibertec.edu.models.Pago;

public interface PagoService {
	
	public List<Pago> findPagoByFecha(String fecha);

}
