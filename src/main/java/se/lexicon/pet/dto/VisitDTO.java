package se.lexicon.pet.dto;

import se.lexicon.pet.entity.Pet;

import java.time.LocalDateTime;
import java.util.StringJoiner;

/**
 * Created by Mehrdad Javan
 * Date: Nov, 2020
 */
public class VisitDTO {

    private String visitId;
    private Pet pet;
    private LocalDateTime visitDateTime;
    private String description;

    public String getVisitId() {
        return visitId;
    }

    public void setVisitId(String visitId) {
        this.visitId = visitId;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public LocalDateTime getVisitDateTime() {
        return visitDateTime;
    }

    public void setVisitDateTime(LocalDateTime visitDateTime) {
        this.visitDateTime = visitDateTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    @Override
    public String toString() {
        return new StringJoiner(", ", VisitDTO.class.getSimpleName() + "[", "]")
                .add("visitId='" + visitId + "'")
                .add("pet=" + pet)
                .add("visitDateTime=" + visitDateTime)
                .add("description='" + description + "'")
                .toString();
    }
}
