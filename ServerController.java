package org.example.serverapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/servers")
public class ServerController {
    @Autowired
    private ServerRepository serverRepository;

    // Implement the GET, PUT, and DELETE endpoints as described in your question

    // GET servers (all or by ID)
    @GetMapping
    public List<Server> getServers() {
        return serverRepository.findAll();
    }

    @GetMapping("/{id}")
    public Server getServerById(@PathVariable String id) {
        return serverRepository.findById(id).orElse(null);
    }

    // PUT a server
    @PutMapping
    public Server createServer(@RequestBody Server server) {
        return serverRepository.save(server);
    }

    // DELETE a server
    @DeleteMapping("/{id}")
    public void deleteServer(@PathVariable String id) {
        serverRepository.deleteById(id);
    }

    // GET servers by name
    //@GetMapping("/search")
    //public List<Server> findServersByName(@RequestParam String name) {
      //  return serverRepository.findByNameContaining(name);
    }


