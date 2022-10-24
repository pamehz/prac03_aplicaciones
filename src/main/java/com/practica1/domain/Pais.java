
package com.practica1.domain;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name="estado")
public class Pais {
    
  private static final long serialVersionUID =1L;
 
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long  idPais; 
  String NombreEstado;  
  String capital;  
  int población;  
  int costas;  

    public Pais() {
    }

    public Pais(String NombreEstado, String capital, int población, int costas) {
        this.NombreEstado = NombreEstado;
        this.capital = capital;
        this.población = población;
        this.costas = costas;
    }
  
  
}
