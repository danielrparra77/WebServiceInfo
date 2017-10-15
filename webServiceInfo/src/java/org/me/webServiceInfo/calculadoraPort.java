/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.me.webServiceInfo;

import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import org.me.webServiceInfo_client.Calculadora;

/**
 * REST Web Service
 *
 * @author Estudiantes
 */
@Path("calculadoraport")
public class calculadoraPort {

    private Calculadora port;

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of calculadoraPort
     */
    public calculadoraPort() {
        port = getPort();
    }

    /**
     * Invokes the SOAP method suma
     * @param numero1 resource URI parameter
     * @param numero2 resource URI parameter
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("text/plain")
    @Consumes("text/plain")
    @Path("suma/")
    public String getSuma(@QueryParam("numero1")
            @DefaultValue("0") int numero1, @QueryParam("numero2")
            @DefaultValue("0") int numero2) {
        try {
            // Call Web Service Operation
            if (port != null) {
                int result = port.suma(numero1, numero2);
                return new java.lang.Integer(result).toString();
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }

    /**
     *
     */
    private Calculadora getPort() {
        try {
            // Call Web Service Operation
            org.me.webServiceInfo_client.Calculadora_Service service = new org.me.webServiceInfo_client.Calculadora_Service();
            org.me.webServiceInfo_client.Calculadora p = service.getCalculadoraPort();
            return p;
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }
}
