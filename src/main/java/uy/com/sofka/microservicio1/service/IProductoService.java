package uy.com.sofka.microservicio1.service;

import java.util.List;

import uy.com.sofka.microservicio1.model.Producto;

public interface IProductoService {
  List<Producto> listar();
}
