package se.lexicon.pet.repository;

import org.springframework.data.repository.CrudRepository;
import se.lexicon.pet.entity.Owner;

import java.util.List;

/**
 * Created by Mehrdad Javan
 * Date: Nov, 2020
 */
public interface OwnerRepository extends CrudRepository<Owner, String> {
    List<Owner> findByFirstNameIgnoreCase(String firstName);

    List<Owner> findByTelephone(String telephone);
}
