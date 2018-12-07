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

    @PostMapping("/add/current")
    @CrossOrigin(origins = "http://localhost:4200")
    public int add(@RequestParam int num){
        return this.service.add(num);
    }

    @PostMapping("/accumulate/current")
    @CrossOrigin(origins = "http://localhost:4200")
    public int accumulate(@RequestParam int num){
        return this.service.accumulate(num);
    }
}
