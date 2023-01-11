package org.snva.helloworld.beans;

import java.util.List;

public class User {
//     private String userId;
//     private String userName;
//     private String firstName;
//     private String lastName;
//
//    @Override
//    public String toString() {
//        return "User{" +
//                "userId='" + userId + '\'' +
//                ", userName='" + userName + '\'' +
//                ", firstName='" + firstName + '\'' +
//                ", lastName='" + lastName + '\'' +
//                ", contact='" + contact + '\'' +
//                ", email='" + email + '\'' +
//                ", password='" + password + '\'' +
//                ", role=" + role +
//                '}';
//    }
//
//    private String contact;
//     private String email;
//
//    public String getUserId() {
//        return userId;
//    }
//
//    public void setUserId(String userId) {
//        this.userId = userId;
//    }
//
//    public String getUserName() {
//        return userName;
//    }
//
//    public void setUserName(String userName) {
//        this.userName = userName;
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public String getContact() {
//        return contact;
//    }
//
//    public void setContact(String contact) {
//        this.contact = contact;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public List<Role> getRole() {
//        return role;
//    }
//
//    public void setRole(List<Role> role) {
//        this.role = role;
//    }
//
//    private String password;
//     private List <Role>role;

    private String learner;
    private String instructor;
    private String message;

    public String getLearner() {
        return learner;
    }

    public void setLearner(String learner) {
        this.learner = learner;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "User{" +
                "learner='" + learner + '\'' +
                ", instructor='" + instructor + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}