/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ppows;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author gon
 */
@Path("generic")
public class EquatorWS {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of EquatorWS
     */
    public EquatorWS() {
    }

    /**
     * Retrieves representation of an instance of com.mycompany.ppows.EquatorWS
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("aplication/text")
    public String getJson() {
       return "Servidor WS Rest";
    }

    /**
     * PUT method for updating or creating an instance of EquatorWS
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}
