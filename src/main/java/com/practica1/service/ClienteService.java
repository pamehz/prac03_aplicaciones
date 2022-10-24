
package com.practica1.service;

import com.practica1.domain.Pais;
import java.util.List;

public interface ClienteService {
   public List<Pais> getPaises(); //para retornar una lista de clientes
   public Pais getPais(Pais Pais); //para retornar un solo cliente
   public void save (Pais Pais); //para insertar un registro nuevo o modificar uno existente
   public void delete (Pais Pais);} //para eliminar un cliente.