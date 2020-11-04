package se.lexicon.pet.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;
import java.util.StringJoiner;

/**
 * Created by Mehrdad Javan
 * Date: Nov, 2020
 */
@Entity
public class PetType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer typeId;
    private String name;

    public PetType() {
    }

    public PetType(String name) {
        this.name = name;
    }

    public PetType(Integer typeId, String name) {
        this.typeId = typeId;
        this.name = name;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PetType petType = (PetType) o;
        return Objects.equals(typeId, petType.typeId) &&
                Objects.equals(name, petType.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeId, name);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", PetType.class.getSimpleName() + "[", "]")
                .add("typeId=" + typeId)
                .add("name='" + name + "'")
                .toString();
    }
}
