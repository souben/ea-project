package com.example.eaproject1.controller;

import com.example.eaproject1.DTO.RequestRegistrationEventDto;
import com.example.eaproject1.domian.RegistrationEvent;
import com.example.eaproject1.service.RegistrationEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/registrationEvent")
public class RegistrationEventController {
    @Autowired
    private RegistrationEventService registrationEventService;

    @GetMapping
    public List<RegistrationEvent> getRegistrationEvent(){
        return registrationEventService.getRegistrationEvent();
    }
    @GetMapping("/latest")
    public RegistrationEvent getLatestRegistrationEvent(){
        return registrationEventService.getLatestRegistrationEvent();
    }
    @GetMapping("/{id}")
    public RegistrationEvent findRegistrationEventById(@PathVariable long id){
        return registrationEventService.findRegistrationEventById(id);
    }

    @PostMapping
    public ResponseEntity<?> createRegistrationEvent(@RequestBody RequestRegistrationEventDto requestRegistrationEventDto){
        registrationEventService.createRegistrationEvent(requestRegistrationEventDto);
        return new ResponseEntity<>("success", HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateRegistrationEvent(@PathVariable long id, @RequestBody RegistrationEvent registrationEvent){
        registrationEventService.updateRegistrationEvent(id, registrationEvent);
        return new ResponseEntity<>("updated", HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteRegistrationEvent(@PathVariable long id){
        registrationEventService.deleteRegistrationEvent(id);
        return new ResponseEntity<>("deleted" , HttpStatus.OK);
    }


}
