package se.lexicon.pet.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDate;
import java.util.Objects;
import java.util.StringJoiner;

/**
 * Created by Mehrdad Javan
 * Date: Nov, 2020
 */
@Entity
public class Pet {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID",strategy = "org.hibernate.id.UUIDGenerator")
    private String petId;
    private String name;
    private LocalDate birthDate;

    @ManyToOne
    private PetType petType;
    @ManyToOne
    private Owner owner;

    public Pet() {
    }

    public Pet(String name, LocalDate birthDate, PetType petType, Owner owner) {
        this.name = name;
        this.birthDate = birthDate;
        this.petType = petType;
        this.owner = owner;
    }

    public Pet(String petId, String name, LocalDate birthDate, PetType petType, Owner owner) {
        this.petId = petId;
        this.name = name;
        this.birthDate = birthDate;
        this.petType = petType;
        this.owner = owner;
    }

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return Objects.equals(petId, pet.petId) &&
                Objects.equals(name, pet.name) &&
                Objects.equals(birthDate, pet.birthDate) &&
                Objects.equals(petType, pet.petType) &&
                Objects.equals(owner, pet.owner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(petId, name, birthDate, petType, owner);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Pet.class.getSimpleName() + "[", "]")
                .add("petId='" + petId + "'")
                .add("name='" + name + "'")
                .add("birthDate=" + birthDate)
                .add("petType=" + petType)
                .add("owner=" + owner)
                .toString();
    }
}
