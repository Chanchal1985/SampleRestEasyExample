package com.resteasy.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/movies")
public class MovieCrudController {

    @GET
    @Path("/status")
    public Response status() {
        Response helloWorld = Response.status(Response.Status.OK).entity("HelloWorld").build();
        return helloWorld;
    }

}
