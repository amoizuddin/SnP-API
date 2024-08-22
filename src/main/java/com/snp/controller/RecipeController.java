package com.snp.controller;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

@Path("/recipe")
public class RecipeController {

    @GET
    @Path("/")
    public Response initial() {
        return Response.ok("hello").build();
    }
}
