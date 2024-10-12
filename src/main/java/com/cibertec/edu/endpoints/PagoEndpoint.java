package com.cibertec.edu.endpoints;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.cibertec.edu.models.Pago;
import com.cibertec.edu.pagos.ConsultaPagosRequest;
import com.cibertec.edu.pagos.DetallePago;
import com.cibertec.edu.pagos.ListadoPagos;
import com.cibertec.edu.services.PagoServiceImpl;


@Endpoint
public class PagoEndpoint {
	
	@Autowired
	private PagoServiceImpl pagoImpl;
	
	private static final String NAMESPACE_URI = "http://www.edu.cibertec.com/pagos";

   

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "ConsultaPagosRequest")
    @ResponsePayload
    public ListadoPagos getPagos(@RequestPayload ConsultaPagosRequest request) {
    	ListadoPagos newreg = new ListadoPagos();
		List<Pago> lista = this.pagoImpl.findPagoByFecha(request.getFechaConsulta());
		List<DetallePago> listaResponse = new ArrayList<DetallePago>();
		
		if(!lista.isEmpty()) {
			lista.stream().forEach((obj -> {
				DetallePago objTemp = new DetallePago();
				objTemp.setIdPago(obj.getIdPago());
				objTemp.setFechaPago(obj.getFechaPago());
				objTemp.setMontoTotalPago(obj.getMontoTotalPago());
				objTemp.setMoneda(obj.getMoneda());
				listaResponse.add(objTemp);
			}));
		}
		newreg.setListaPago(listaResponse);
		return newreg;
    }
    
    

}
