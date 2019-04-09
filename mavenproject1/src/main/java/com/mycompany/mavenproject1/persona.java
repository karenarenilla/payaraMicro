/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import static javax.ws.rs.core.MediaType.TEXT_PLAIN;

/**
 *
 * @author karen
 */
@Path("/persona")
public class persona {
    
    @GET
    @Produces(TEXT_PLAIN)
    public String saludo(@QueryParam("nomnre") String nombre) {
        return "Hola " + nombre;
    }
}
