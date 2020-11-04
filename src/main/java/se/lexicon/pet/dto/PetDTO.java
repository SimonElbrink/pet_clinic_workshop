package se.lexicon.pet.dto;

import se.lexicon.pet.entity.Owner;
import se.lexicon.pet.entity.PetType;

import javax.persistence.ManyToOne;
import java.time.LocalDate;
import java.util.StringJoiner;

/**
 * Created by Mehrdad Javan
 * Date: Nov, 2020
 */
public class PetDTO {

    private String petId;
    private String name;
    private LocalDate birthDate;
    private PetType petType;
    private Owner owner;

    public String getPetId() {
        return petId;
    }

    public void setPetId(String petId) {
        this.petId = petId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", PetDTO.class.getSimpleName() + "[", "]")
                .add("petId='" + petId + "'")
                .add("name='" + name + "'")
                .add("birthDate=" + birthDate)
                .add("petType=" + petType)
                .add("owner=" + owner)
                .toString();
    }
}
