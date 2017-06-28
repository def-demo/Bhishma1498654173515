package com.altimetrik.ccigit.api;

import com.altimetrik.ccigit.model.*;

import com.altimetrik.ccigit.api.service.EmployeeccindexApiService;

import com.altimetrik.ccigit.exception.NotFoundException;

import com.altimetrik.ccigit.model.Employeeccindex;


import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping(value = "/api" )

public class EmployeeccindexApi {

   @Autowired
   private EmployeeccindexApiService service;
  

  @RequestMapping(value = "/employeeccindex", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< List<Employeeccindex>> findAllEmployeeccindex()
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<List<Employeeccindex>>(service.findAllEmployeeccindex(), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/employeeccindex", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.PUT)
  public ResponseEntity< Employeeccindex> updateEmployeeccindex(@RequestBody Employeeccindex employeeccindex
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<Employeeccindex>(service.updateEmployeeccindex(employeeccindex), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/employeeccindex", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.POST)
  public ResponseEntity< Employeeccindex> addEmployeeccindex(@RequestBody Employeeccindex employeeccindex
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<Employeeccindex>(service.addEmployeeccindex(employeeccindex), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/employeeccindex/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< Employeeccindex> findByIdEmployeeccindex(@PathVariable("id") String id
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<Employeeccindex>(service.findByIdEmployeeccindex(id), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/employeeccindex/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.DELETE)
  public ResponseEntity< Void> deleteEmployeeccindex(@PathVariable("id") String id
)
      throws NotFoundException {
        
       	  service.deleteEmployeeccindex(id);
  		  return new ResponseEntity<Void>(HttpStatus.OK);
  		
  	    
  }

  
}

