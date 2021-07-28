package model;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;


    public class People implements Serializable{
        private int Id;
        private String FirstName;
        private String LastName;
        private String Email;
        private String Gender;
        private String Country;

        public People(int id, String first_Name, String last_Name, String email, String gender, String country) {
            Id = id;
            FirstName = first_Name;
            LastName = last_Name;
            Email = email;
            Gender = gender;
            Country = country;

        }
        public People() {
        }

        public int getId() {
            return Id;
        }

        public void setId(int id) {
            Id = id;
        }

        public String getFirstName() {
            return FirstName;
        }

        public void setFirstName(String firstName) {
            FirstName = firstName;
        }

        public String getLastName() {
            return LastName;
        }

        public void setLastName(String lastName) {
            LastName = lastName;
        }

        public String getEmail() {
            return Email;
        }

        public void setEmail(String email) {
            Email = email;
        }

        public String getGender() {
            return Gender;
        }

        public void setGender(String gender) {
            Gender = gender;
        }

        public String getCountry() {
            return Country;
        }

        public void setCountry(String country) {
            Country = country;
        }

        @Override
        public String toString() {
            return getId() + " " + getFirstName() + " " + getLastName() + " " + getEmail() + " " + getGender() + " " + getCountry();
        }
}

