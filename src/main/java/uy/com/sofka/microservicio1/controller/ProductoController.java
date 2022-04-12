package uy.com.sofka.microservicio1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import uy.com.sofka.microservicio1.model.Producto;
import uy.com.sofka.microservicio1.service.IProductoService;

@RestController
@RequestMapping("/productos")
@CrossOrigin(origins = "*")
public class ProductoController {
  
  @Autowired
  private IProductoService service;

  @GetMapping("")
  List<Producto> listar() {
    return service.listar();
  }
}
