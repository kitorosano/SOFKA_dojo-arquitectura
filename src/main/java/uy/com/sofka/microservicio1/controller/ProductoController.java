package uy.com.sofka.microservicio1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import uy.com.sofka.microservicio1.model.Producto;
import uy.com.sofka.microservicio1.service.IProductoService;

@RestController
@CrossOrigin(origins = "*")
public class ProductoController {
  
  @Autowired
  private IProductoService service;

  @RequestMapping("/productos")
  public ResponseEntity<?> listar() {
    try {
      List<Producto> productos = service.listar();
      if (productos.isEmpty()) 
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
      return new ResponseEntity<List<Producto>>(productos, HttpStatus.OK);
    } catch (Exception e) {
      return new ResponseEntity<String>("Error al listar productos", HttpStatus.INTERNAL_SERVER_ERROR);
    }
  }
}
