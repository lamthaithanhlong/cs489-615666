package org.example;

import model.Contact;
import model.EmailAddress;
import model.PhoneNumber;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Contact contact1 = new Contact();
        contact1.setFirstName("David");
        contact1.setLastName("Sanger");
        contact1.setCompany("Argos LLC");
        contact1.setJobTitle("Sales Manager");

        PhoneNumber phone1 = new PhoneNumber();
        phone1.setType("Home");
        phone1.setNumber("240-133-0011");
        contact1.addPhoneNumber(new PhoneNumber(phone1.getType(), phone1.getNumber()));

        EmailAddress email1 = new EmailAddress();
        email1.setType("Home");
        email1.setEmailAddress("dave.sang@gmail.com");
        contact1.addEmailAddress(new EmailAddress(email1.getType(), email1.getEmailAddress()));

        PhoneNumber phone2 = new PhoneNumber();
        phone2.setType("Mobile");
        phone2.setNumber("240-112-0123");
        contact1.addPhoneNumber(new PhoneNumber(phone2.getType(), phone2.getNumber()));

        EmailAddress email2 = new EmailAddress();
        email2.setType("Work");
        email2.setEmailAddress("dsanger@argos.com");
        contact1.addEmailAddress(new EmailAddress(email2.getType(), phone2.getNumber()));

        System.out.println("Contact 1:");
        System.out.println("First Name: " + contact1.getFirstName());
        System.out.println("Last Name: " + contact1.getLastName());
        System.out.println("Company: " + contact1.getCompany());
        System.out.println("Job Title: " + contact1.getJobTitle());
        System.out.println("Phone Numbers: " + contact1.getPhoneNumbers());
        System.out.println("Email Addresses: " + contact1.getEmailAddresses());

        Contact contact2 = new Contact();
        contact2.setFirstName("Carlos");
        contact2.setLastName("Jimenez");
        contact2.setCompany("Zappos");
        contact2.setJobTitle("Director");

        Contact contact3 = new Contact();
        contact3.setFirstName("Ali");
        contact2.setLastName("Gafar");
        contact3.setCompany("BMI Services");
        contact3.setJobTitle("HR Manager");

        PhoneNumber phone3 = new PhoneNumber();
        phone3.setType("Work");
        phone3.setNumber("412-116-9988");
        contact3.addPhoneNumber(new PhoneNumber(phone3.getType(),phone3.getNumber()));

        EmailAddress email3 = new EmailAddress();
        email3.setType("Work");
        email3.setEmailAddress("ali@bmi.com");
        contact3.addEmailAddress(new EmailAddress(email3.getType(), email3.getEmailAddress()));

        System.out.println("Contact 2:");
        System.out.println("First Name: " + contact2.getFirstName());
        System.out.println("Last Name: " + contact2.getLastName());
        System.out.println("Company: " + contact2.getCompany());
        System.out.println("Job Title: " + contact2.getJobTitle());
        System.out.println("Phone Numbers: " + contact2.getPhoneNumbers());
        System.out.println("Email Addresses: " + contact2.getEmailAddresses());

        System.out.println("Contact 3:");
        System.out.println("First Name: " + contact3.getFirstName());
        System.out.println("Last Name: " + contact3.getLastName());
        System.out.println("Company: " + contact3.getCompany());
        System.out.println("Job Title: " + contact3.getJobTitle());
        System.out.println("Phone Numbers: " + contact3.getPhoneNumbers());
        System.out.println("Email Addresses: " + contact3.getEmailAddresses());

//        Arrays.sort(Contact, Comparator.comparing(Contact::getLastName));
    }
}