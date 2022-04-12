package uy.com.sofka.microservicio1.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import uy.com.sofka.microservicio1.model.Producto;

public interface IProductoRepository extends MongoRepository<Producto, String> {
}