package uy.com.sofka.microservicio1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import uy.com.sofka.microservicio1.model.Producto;

@RestController
@CrossOrigin(origins = "*")
public class ProductoController {
  

  // @RequestMapping("/productos")
  // public List<Producto> listar() {
  // }
}
