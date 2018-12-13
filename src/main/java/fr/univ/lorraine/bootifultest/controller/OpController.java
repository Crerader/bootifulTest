package fr.univ.lorraine.bootifultest.controller;

import org.springframework.web.bind.annotation.*;
import fr.univ.lorraine.bootifultest.service.AdderService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class OpController {

    private AdderService service;

    public OpController(AdderService service){
        this.service = service;
    }

    @GetMapping("/current")
    @CrossOrigin(origins = "http://localhost:4200")
    public int current(){
        return this.service.currentBase();
    }

    @PostMapping("/add/current/{number}")
    @CrossOrigin(origins = "http://localhost:4200")
    public int add(@PathVariable int number){
        return this.service.add(number);
    }

    @PostMapping("/accumulate/current/{number}")
    @CrossOrigin(origins = "http://localhost:4200")
    public int accumulate(@PathVariable int number){
        return this.service.accumulate(number);
    }
}
