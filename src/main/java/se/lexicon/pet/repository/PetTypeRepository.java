package se.lexicon.pet.repository;

import org.springframework.data.repository.CrudRepository;
import se.lexicon.pet.entity.PetType;

/**
 * Created by Mehrdad Javan
 * Date: Nov, 2020
 */
public interface PetTypeRepository extends CrudRepository<PetType,Integer> {
}
