package uy.com.sofka.microservicio1.consumer;

import java.util.List;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import uy.com.sofka.microservicio1.config.RabbitConfig;

@Component
public class Producto {

  @RabbitListener(queues = RabbitConfig.QUEUE)
  public void consumeMessageFromQueue(List<Producto> productos) {
      System.out.println("Productos : " + productos);
  }
}
