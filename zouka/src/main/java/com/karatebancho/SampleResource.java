package com.karatebancho;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

@Path("/sample")
public interface SampleResource {

    @GET
    @Path("/hello/{message}")
    String sayHello(@PathParam("message") String message);

    @POST
    @Path("/hello/{id}/{name}")
    @Consumes(MediaType.TEXT_PLAIN)
    String insert(@PathParam("id") int id, @PathParam("name") String name);

    @PUT
    @Path("/hello/{id}/{name}")
    @Consumes(MediaType.TEXT_PLAIN)
    String update(@PathParam("id") int id, @PathParam("name") String name);

    @DELETE
    @Path("/hello/{id}")
    String delete(@PathParam("id") int id);
}