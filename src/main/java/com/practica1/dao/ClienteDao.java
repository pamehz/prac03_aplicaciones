
package com.practica1.dao;

import com.practica1.domain.Pais;
import org.springframework.data.repository.CrudRepository;

public interface ClienteDao extends CrudRepository<Pais, Long>{
   
}
