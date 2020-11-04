package se.lexicon.pet.repository;

import org.springframework.data.repository.CrudRepository;
import se.lexicon.pet.entity.Pet;

import java.util.List;

/**
 * Created by Mehrdad Javan
 * Date: Nov, 2020
 */
public interface PetRepository extends CrudRepository<Pet, String> {
    List<Pet> findByOwnerTelephone(String ownerTelephone);
}
