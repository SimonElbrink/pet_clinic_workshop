package se.lexicon.pet.repository;

import org.springframework.data.repository.CrudRepository;
import se.lexicon.pet.entity.Visit;

/**
 * Created by Mehrdad Javan
 * Date: Nov, 2020
 */
public interface VisitRepository extends CrudRepository<Visit,String> {
}
