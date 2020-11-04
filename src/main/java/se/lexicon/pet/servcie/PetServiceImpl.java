package se.lexicon.pet.servcie;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.lexicon.pet.dto.PetDTO;
import se.lexicon.pet.entity.Pet;
import se.lexicon.pet.repository.PetRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Created by Mehrdad Javan
 * Date: Nov, 2020
 */
@Service
public class PetServiceImpl implements PetService {

    private PetRepository petRepository;
    private ModelMapper modelMapper;

    @Autowired
    public PetServiceImpl(PetRepository petRepository, ModelMapper modelMapper) {
        this.petRepository = petRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public PetDTO create(PetDTO dto) {
        Pet p = modelMapper.map(dto, Pet.class);
        Pet savedPet = petRepository.save(p);
        return modelMapper.map(savedPet, PetDTO.class);
    }

    @Override
    public PetDTO update(PetDTO dto) {
        Pet p = modelMapper.map(dto, Pet.class);
        Pet savedPet = petRepository.save(p);
        return modelMapper.map(savedPet, PetDTO.class);
    }

    @Override
    public PetDTO findById(String petId) {
        Optional<Pet> pet = petRepository.findById(petId);
        if (pet.isPresent()) {
            return modelMapper.map(pet, PetDTO.class);
        }
        return null;
    }

    @Override
    public void deleteById(String petId) {
        petRepository.deleteById(petId);
    }

    @Override
    public List<PetDTO> findAll() {
        List<Pet> petList = (List<Pet>) petRepository.findAll();
        return petList.stream()
                .map(pet -> modelMapper.map(pet, PetDTO.class)).collect(Collectors.toList());
    }

    @Override
    public List<PetDTO> findByOwnerTelephone(String ownerTelephone) {
        List<Pet> petList = petRepository.findByOwnerTelephone(ownerTelephone);
        return petList.stream()
                .map(pet -> modelMapper.map(pet, PetDTO.class)).collect(Collectors.toList());
    }
}
