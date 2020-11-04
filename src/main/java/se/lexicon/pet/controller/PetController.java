package se.lexicon.pet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import se.lexicon.pet.dto.PetDTO;
import se.lexicon.pet.servcie.PetService;

import java.util.List;

/**
 * Created by Mehrdad Javan
 * Date: Nov, 2020
 */
@RestController
@RequestMapping("/api/pet")
public class PetController {

    @Autowired
    private PetService petService;

    @GetMapping("/")
    public ResponseEntity<List<PetDTO>> findAll(){
        List<PetDTO> dtoList = petService.findAll();
        return ResponseEntity.ok(dtoList);
    }

    @PostMapping("/")
    public ResponseEntity<PetDTO> create(@RequestBody PetDTO dto){
        System.out.println("dto.toString() = " + dto.toString());
        PetDTO response = petService.create(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable("id") String petId){
        petService.deleteById(petId);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/")
    public ResponseEntity<PetDTO> update(@RequestBody PetDTO dto){
       PetDTO response = petService.update(dto);
       return ResponseEntity.ok(response);
    }
}
