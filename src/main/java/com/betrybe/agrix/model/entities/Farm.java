package com.betrybe.agrix.model.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Classe representando a tabela farms do banco de dados.
 */

@Entity
@Table(name = "farm")

public class Farm {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;
  private Double size;

  /**
   * Construtor da classe Farms.
   */

  public Farm(Long id, String name, Double size) {
    this.id = id;
    this.name = name;
    this.size = size;
  }

  /**
   * metodos da classe Farms.
   */
  

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Double getSize() {
    return size;
  }

  public void setSize(Double size) {
    this.size = size;
  }

}
