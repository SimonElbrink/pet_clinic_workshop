package se.lexicon.pet.dto;

import java.util.StringJoiner;

/**
 * Created by Mehrdad Javan
 * Date: Nov, 2020
 */
public class PetTypeDTO {
    private Integer typeId;
    private String name;

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
    public String toString() {
        return new StringJoiner(", ", PetTypeDTO.class.getSimpleName() + "[", "]")
                .add("typeId=" + typeId)
                .add("name='" + name + "'")
                .toString();
    }
}
