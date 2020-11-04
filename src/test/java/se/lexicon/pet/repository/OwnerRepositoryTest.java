package se.lexicon.pet.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import se.lexicon.pet.entity.Owner;

import java.util.List;

/**
 * Created by Mehrdad Javan
 * Date: Nov, 2020
 */

@DataJpaTest
public class OwnerRepositoryTest {

    @Autowired
    OwnerRepository ownerRepository;

    @Test
    public void test_select_all(){
       List<Owner> ownerList = (List<Owner>) ownerRepository.findAll();
        Assertions.assertEquals(ownerList.size(),2);
    }
    // other unit tests

}
