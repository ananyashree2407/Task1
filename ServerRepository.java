package org.example.serverapi;

import org.example.serverapi.Server;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ServerRepository  extends MongoRepository<Server, String>{
}
