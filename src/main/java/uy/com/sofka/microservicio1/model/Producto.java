package uy.com.sofka.microservicio1.model;

import java.util.Objects;

public class Producto {
  
  private String id;
  private String nombre;
  private String descripcion;
  private Double precio;
  private Integer stock;

  public Producto(String id, String nombre, String descripcion, Double precio, Integer stock) {
    this.id = id;
    this.nombre = nombre;
    this.descripcion = descripcion;
    this.precio = precio;
    this.stock = stock;
  }

  public String getId() {
    return id;
  }

  public String getNombre() {
    return nombre;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public Double getPrecio() {
    return precio;
  }

  public Integer getStock() {
    return stock;
  }

  public void setId(String id) {
    this.id = id;
  }
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }
  public void setPrecio(Double precio) {
    this.precio = precio;
  }
  public void setStock(Integer stock) {
    this.stock = stock;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this)
        return true;
    if (!(o instanceof Producto)) {
        return false;
    }
    Producto producto = (Producto) o;
    return Objects.equals(id, producto.id) && Objects.equals(nombre, producto.nombre) && Objects.equals(descripcion, producto.descripcion) && Objects.equals(precio, producto.precio) && Objects.equals(stock, producto.stock);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nombre, descripcion, precio, stock);
  }


  @Override
  public String toString() {
    return "{" +
      " id='" + getId() + "'" +
      ", nombre='" + getNombre() + "'" +
      ", descripcion='" + getDescripcion() + "'" +
      ", precio='" + getPrecio() + "'" +
      ", stock='" + getStock() + "'" +
      "}";
  }

  
}
