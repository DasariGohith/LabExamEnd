package com.klef.jfsd.springboot.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "order_table")
public class Order
{
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "oid")
  private int id;
  @Column(name = "oname",nullable = false,length = 50)
  private String name;
  @Column(name = "oquantity",nullable = false, length=50)
  private double quantity;
public int getId() {
  return id;
}
public void setId(int id) {
  this.id = id;
}
public String getName() {
  return name;
}
public void setName(String name) {
  this.name = name;
}
public double getQuantity() {
  return quantity;
}
public void setQuantity(double quantity) {
  this.quantity = quantity;
}

}
