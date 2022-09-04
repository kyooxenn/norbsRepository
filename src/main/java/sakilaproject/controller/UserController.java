package sakilaproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sakilaproject.dto.Actor;
import sakilaproject.services.ActorRepository;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("get/")
public class UserController {

    @Autowired
    ActorRepository actorRepository;


    @GetMapping("/actor")
    public List<Actor> getActor(){

       return actorRepository.findAll();
    }

    @PostMapping("/findActor")
    public Optional<Actor> getActorById(@RequestBody Actor id){

          return actorRepository.findById(id.getActor_id());

    }


}
