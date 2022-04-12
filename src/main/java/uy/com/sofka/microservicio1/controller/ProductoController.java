package uy.com.sofka.microservicio1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import uy.com.sofka.microservicio1.model.Producto;
import uy.com.sofka.microservicio1.service.IProductoService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ProductoController {
  
  @Autowired
  private IProductoService service;

  @GetMapping("/")
  public List<Producto> listar() {
    return service.listar();
  }
}
