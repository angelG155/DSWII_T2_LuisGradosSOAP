//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.2 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.10.11 a las 09:48:45 PM PET 
//


package com.cibertec.edu.pagos;

import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.cibertec.edu.pagos package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.cibertec.edu.pagos
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsultaPagosRequest }
     * 
     */
    public ConsultaPagosRequest createConsultaPagosRequest() {
        return new ConsultaPagosRequest();
    }

    /**
     * Create an instance of {@link ListadoPagos }
     * 
     */
    public ListadoPagos createListadoPagos() {
        return new ListadoPagos();
    }

    /**
     * Create an instance of {@link DetallePago }
     * 
     */
    public DetallePago createDetallePago() {
        return new DetallePago();
    }

}
