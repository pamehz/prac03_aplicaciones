
package com.practica1.service;

import com.practica1.dao.ClienteDao;
import com.practica1.domain.Pais;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class ClienteServiceImpl implements ClienteService{

        @Autowired
    private ClienteDao clienteDao;
    
    @Override
    @Transactional (readOnly = true)
    public List<Pais> getPaises() {
        return (List<Pais>)clienteDao.findAll();
        
    }
    @Override
    @Transactional (readOnly = true)
    public Pais getPais(Pais pais) {
        return clienteDao.findById(pais.getIdPais()).orElse(null);
    }


    @Override
    @Transactional
    public void save(Pais pais) {
        clienteDao.save(pais);
    }

    @Override
    @Transactional
    public void delete(Pais pais) {
        clienteDao.delete(pais);
    }


    
}
