
package uy.com.sofka.microservicio1.config;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MongoConfig {

  /*
   * Use the standard Mongo driver API to create a com.mongodb.client.MongoClient instance.
   */
   public @Bean MongoClient mongoClient() {
       return MongoClients.create("mongodb+srv://Edwar016:edwar016@primary.hp0e6.mongodb.net/dojo-arquitectura?retryWrites=true&w=majority");
   }

}

