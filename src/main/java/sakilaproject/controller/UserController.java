package sakilaproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sakilaproject.dto.Actor;
import sakilaproject.exception.ResourceNotFoundException;
import sakilaproject.repository.ActorRepository;
import sakilaproject.vo.ResponseVO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("get/")
public class UserController {

    @Autowired
    ActorRepository actorRepository;


    @GetMapping("actor")
    public List<Actor> getActor(){
       return actorRepository.findAll();
    }

    @PostMapping("/findActor")
    public Optional<Actor> getActorById(@RequestBody Actor id){
          return actorRepository.findById(id.getActor_id());
    }


    //norbs
    @GetMapping("/norbs")
    public String helloWorld(){
        return "Hello world";
    }

    @PostMapping("/hello2")
    public String hello2(@RequestParam String name){
        return "Hello my name is " + name;
    }


    @GetMapping("/list")
    public List<Actor> findActors(){
        return  actorRepository.findAll();
    }

    @PostMapping("/add")
    public Actor createActor(@RequestBody Actor actor) {
        return actorRepository.save(actor);
    }

    @PostMapping("/delete/{id}")
    public ResponseVO deleteActor(@PathVariable Integer id){
        Actor actor = actorRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Actor " + id));
        actorRepository.findById(id);
        if (actor != null) {
            return new ResponseVO(200,"Success!", actor);
        }
        else {
            return new ResponseVO( 500,"Error, no data!", new ArrayList());
        }


    }


    @PostMapping("/postbody")
    public String postBody(@RequestBody String name) {
        return  "Hello " + name;
    }


    @PostMapping("/actor/{id}")
    public ResponseVO<Actor> updateActor(@PathVariable Integer id, @RequestBody Actor actor){

            Actor updateActor = actorRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Record not found " + id));
            updateActor.setFirst_name(actor.getFirst_name());
            updateActor.setLast_name(actor.getLast_name());
            updateActor.setLast_update(actor.getLast_update());
            actorRepository.save(updateActor);
        if (actor != null) {
            return new ResponseVO(200, "Success", actor);
        } else {
            return new ResponseVO(500, "Error no data", Collections.emptyList());
        }

    }

}
