package com.cibertec.edu.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cibertec.edu.models.Pago;

@Repository
public interface PagoRepository extends CrudRepository<Pago, Long> {

	@Query("SELECT p FROM Pago p")
	List<Pago> findAllPagos();
	
    @Query("SELECT p FROM Pago p WHERE p.fechaPago = :fechaPago")
    List<Pago> findByFechaPago(@Param("fechaPago") String fechaPago);
}
