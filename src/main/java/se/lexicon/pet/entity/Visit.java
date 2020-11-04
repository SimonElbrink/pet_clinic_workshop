package se.lexicon.pet.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;
import java.util.Objects;
import java.util.StringJoiner;

/**
 * Created by Mehrdad Javan
 * Date: Nov, 2020
 */
@Entity
public class Visit {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private String visitId;
    @ManyToOne
    private Pet pet;

    private LocalDateTime visitDateTime;
    private String description;

    public Visit() {
    }

    public Visit(Pet pet, LocalDateTime visitDateTime, String description) {
        this.pet = pet;
        this.visitDateTime = visitDateTime;
        this.description = description;
    }

    public Visit(String visitId, Pet pet, LocalDateTime visitDateTime, String description) {
        this.visitId = visitId;
        this.pet = pet;
        this.visitDateTime = visitDateTime;
        this.description = description;
    }

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Visit visit = (Visit) o;
        return Objects.equals(visitId, visit.visitId) &&
                Objects.equals(pet, visit.pet) &&
                Objects.equals(visitDateTime, visit.visitDateTime) &&
                Objects.equals(description, visit.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(visitId, pet, visitDateTime, description);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Visit.class.getSimpleName() + "[", "]")
                .add("visitId='" + visitId + "'")
                .add("pet=" + pet)
                .add("visitDateTime=" + visitDateTime)
                .add("description='" + description + "'")
                .toString();
    }
}
