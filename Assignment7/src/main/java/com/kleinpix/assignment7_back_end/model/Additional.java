/*
package com.kleinpix.assignment7_back_end.model;

/*
    NAME        :   Heinrich Klein
    STUDENT #   :   195032659
    DATE        :   24 April 2018
    DESCRIPTION :   Online Photography Service Order app
*/
/*
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class Additional implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //declare instance variables
    private String id;
    private String numberOfPrints;
    private String photobookSize;
    private String photoboothPackage;

    //create private constructor
    private Additional() {

    }

    //create getters
    public String getId() {
        return id;
    }

    public String getNumberOfPrints() {
        return numberOfPrints;
    }

    public String getPhotobookSize() {
        return photobookSize;
    }

    public String getPhotoboothPackage() {
        return photoboothPackage;
    }

    //create Builder Pattern class
    public static class Builder {
        //create instance variables
        private String id;
        private String numberOfPrints;
        private String photobookSize;
        private String photoboothPackage;

        //create the "getters" for the Builder Pattern class
        public Builder id(String values) {
            this.id = values;
            return this;
        }

        public Builder numberOfPrints(String values) {
            this.numberOfPrints = values;
            return this;
        }

        public Builder photobookSize(String values) {
            this.photobookSize = values;
            return this;
        }

        public Builder photoboothPackage(String values) {
            this.photoboothPackage = values;
            return this;
        }

        public Additional build() {
            return new Additional(this);
        }
    }

    public Additional(Builder builder) {
        this.id = builder.id;
        this.numberOfPrints = builder.numberOfPrints;
        this.photobookSize = builder.photobookSize;
        this.photoboothPackage = builder.photoboothPackage;
    }

}
*/
/*
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Additional that = (Additional) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
*/