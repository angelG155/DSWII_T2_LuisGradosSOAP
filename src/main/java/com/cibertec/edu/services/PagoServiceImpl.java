package com.cibertec.edu.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.edu.models.Pago;
import com.cibertec.edu.repository.PagoRepository;

@Service
public class PagoServiceImpl implements PagoService {
	
	@Autowired
	private PagoRepository pagorepository;
	
	@Override
	public List<Pago> findPagoByFecha(String fecha) {
	    if (fecha == null || fecha.isEmpty()) {
	        return this.pagorepository.findAllPagos();
	    } else {
	        return this.pagorepository.findByFechaPago(fecha);
	    }
	}


}
