package com.altimetrik.ccigit.api.service;

import com.altimetrik.ccigit.model.Employeeccindex;


import com.altimetrik.ccigit.exception.NotFoundException;
import java.util.List;

public interface EmployeeccindexApiService {
  
      List<Employeeccindex> findAllEmployeeccindex()
      throws NotFoundException;
  
      Employeeccindex updateEmployeeccindex(Employeeccindex employeeccindex)
      throws NotFoundException;
  
      Employeeccindex addEmployeeccindex(Employeeccindex employeeccindex)
      throws NotFoundException;
  
      Employeeccindex findByIdEmployeeccindex(String id)
      throws NotFoundException;
  
      void deleteEmployeeccindex(String id)
      throws NotFoundException;
  
}

