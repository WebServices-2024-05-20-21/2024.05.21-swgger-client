package com.comarch.szkolenia.swagger.client.api;

import com.comarch.szkolenia.swagger.client.api.model.EntityModelUser;
import com.comarch.szkolenia.swagger.client.api.model.User;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.MediaType;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import io.swagger.jaxrs.PATCH;

/**
 * OpenAPI definition
 *
 * <p>No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 */
@Path("/user")
@Api(value = "/", description = "")
public interface UserControllerApi  {

    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "*/*" })
    @ApiOperation(value = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = User.class) })
    public User create(User user);

    @DELETE
    @Path("/{id}")
    @ApiOperation(value = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK") })
    public void delete(@PathParam("id") Integer id);

    @GET
    
    @Produces({ "*/*" })
    @ApiOperation(value = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class) })
    public String getAllOrByLogin(@QueryParam("login") String login);

    @GET
    @Path("/{id}")
    @Produces({ "*/*" })
    @ApiOperation(value = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = EntityModelUser.class) })
    public EntityModelUser getById(@PathParam("id") Integer id);

    @PUT
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "*/*" })
    @ApiOperation(value = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = User.class) })
    public User update(@PathParam("id") Integer id, User user);
}
