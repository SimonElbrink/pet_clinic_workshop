package se.lexicon.pet.servcie;

import se.lexicon.pet.dto.PetDTO;

import java.util.List;

/**
 * Created by Mehrdad Javan
 * Date: Nov, 2020
 */
public interface PetService {

    PetDTO create(PetDTO dto);

    PetDTO update(PetDTO dto);

    PetDTO findById(String petId);

    void deleteById(String petId);

    List<PetDTO> findAll();

    List<PetDTO> findByOwnerTelephone(String ownerTelephone);

}
