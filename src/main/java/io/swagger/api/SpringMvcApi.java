package io.swagger.api;

import io.swagger.model.*;

import io.swagger.model.SpringMvc;
import io.swagger.model.Error;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.Authorization;
import io.swagger.annotations.AuthorizationScope;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

import static org.springframework.http.MediaType.*;

@Controller
@RequestMapping(value = "/spring-mvc", produces = {APPLICATION_JSON_VALUE})
@Api(value = "/spring-mvc", description = "the spring-mvc API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringMVCServerCodegen", date = "2016-03-07T13:33:03.650Z")
public class SpringMvcApi {
  

  @ApiOperation(value = "spring-mvc Type", notes = "This endponits for get the specified spring-mvc resource", response = SpringMvc.class, responseContainer = "List")
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "An array of spring-mvc"),
    @ApiResponse(code = 200, message = "Unexpected error") })
  @RequestMapping(value = "", 
    produces = { "application/json" }, 
    
    method = RequestMethod.GET)
  public ResponseEntity<List<SpringMvc>> springMvcGet()
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<List<SpringMvc>>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "spring-mvc Type", notes = "This endponits for create a new spring-mvc resource", response = SpringMvc.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "description about created resource of spring-mvc"),
    @ApiResponse(code = 200, message = "Unexpected error") })
  @RequestMapping(value = "", 
    produces = { "application/json" }, 
    
    method = RequestMethod.POST)
  public ResponseEntity<SpringMvc> springMvcPost()
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<SpringMvc>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "spring-mvc Type", notes = "This endponits for get the specified spring-mvc resource", response = SpringMvc.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "description about created resource of spring-mvc"),
    @ApiResponse(code = 200, message = "Unexpected error") })
  @RequestMapping(value = "/{spring-mvc_id}", 
    produces = { "application/json" }, 
    
    method = RequestMethod.GET)
  public ResponseEntity<SpringMvc> springMvcSpringMvcIdGet(
@ApiParam(value = "Fetch resource id of the spring-mvc",required=true ) @PathVariable("springMvcId") String springMvcId

)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<SpringMvc>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "spring-mvc Type", notes = "This endponits for update the specified spring-mvc resource", response = SpringMvc.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "description about updated resource of spring-mvc"),
    @ApiResponse(code = 200, message = "Unexpected error") })
  @RequestMapping(value = "/{spring-mvc_id}", 
    produces = { "application/json" }, 
    
    method = RequestMethod.PUT)
  public ResponseEntity<SpringMvc> springMvcSpringMvcIdPut(
@ApiParam(value = "Update resource id of the spring-mvc",required=true ) @PathVariable("springMvcId") String springMvcId

)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<SpringMvc>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "spring-mvc Type", notes = "This endponits for delete the specified spring-mvc resource", response = Void.class)
  @ApiResponses(value = { 
    @ApiResponse(code = 204, message = "Resource deleted"),
    @ApiResponse(code = 200, message = "Unexpected error") })
  @RequestMapping(value = "/{spring-mvc_id}", 
    produces = { "application/json" }, 
    
    method = RequestMethod.DELETE)
  public ResponseEntity<Void> springMvcSpringMvcIdDelete(
@ApiParam(value = "Delete resource id of the spring-mvc",required=true ) @PathVariable("springMvcId") String springMvcId

)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<Void>(HttpStatus.OK);
  }

  
}
