package se.lexicon.pet.dto;

import java.util.StringJoiner;

/**
 * Created by Mehrdad Javan
 * Date: Nov, 2020
 */
public class OwnerDTO {

    private String ownerId;
    private String firstName;
    private String lastName;
    private String address;
    private String telephone;

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", OwnerDTO.class.getSimpleName() + "[", "]")
                .add("ownerId='" + ownerId + "'")
                .add("firstName='" + firstName + "'")
                .add("lastName='" + lastName + "'")
                .add("address='" + address + "'")
                .add("telephone='" + telephone + "'")
                .toString();
    }
}
