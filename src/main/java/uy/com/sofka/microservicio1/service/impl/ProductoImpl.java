package uy.com.sofka.microservicio1.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uy.com.sofka.microservicio1.model.Producto;
import uy.com.sofka.microservicio1.repository.IProductoRepository;
import uy.com.sofka.microservicio1.service.IProductoService;

@Service
public class ProductoImpl implements IProductoService {

  @Autowired
  private IProductoRepository repository;

  @Override
  public List<Producto> listar() {
    return repository.findAll();
  }
  
}
