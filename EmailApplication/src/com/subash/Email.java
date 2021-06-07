package com.subash;

import java.util.Locale;
import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private int defaultPasswordLength = 8;
    private String email;
    private String companySuffix="Company.com";
    private int mailboxCapacity = 500;
    private String department;
    private String alternateEmail;
    //Constructor to receive first name and last name
    public Email(String firstName,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
//        System.out.println("Email created:"+this.firstName+" "+this.lastName);

        // call a method asking for department = return the department
        this.department = setDepartment();
//        System.out.println("Department: "+this.department);

        // Call a method that returns random password
        this.password = randomPassword(defaultPasswordLength);
//        System.out.println("Your password is: "+this.password);

        // Combine elements to generate email
        email = firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+companySuffix;
//        System.out.println("your Email is: "+ email);
    }
    //Ask for the department
    private String setDepartment(){
        System.out.println("Department Code:\n 1 for sales\n 2 for Development\n 3 for Accounting\n 0 for none\nEnter Department Code:");
        Scanner scan = new Scanner(System.in);
        int departmentCode=scan.nextInt();
        if(departmentCode == 1){return "sales";}
        else if(departmentCode == 2){return "Developer";}
        else if(departmentCode == 3){return "Accounts";}
        else{return "none";}
    }

    //Generate a random password the email
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!#$&*%";
        char[] password = new char[length];
        for(int i = 0; i < length; i++){
            int random = (int)(Math.random()*passwordSet.length());
            password[i] = passwordSet.charAt(random);
        }
        return new String(password);
    }

    //set the mailbox capacity
    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity = capacity;
    }

    //set the alternate email for the candidate
    public void setAlternateEmail(String altEmail){
        this.alternateEmail = altEmail;
    }

    //change password
    public void setPassword(String password){
        this.password = password;
    }
    //get methods
    public int getMailboxCapacity(){return mailboxCapacity;}
    public String getAlternateEmail(){return alternateEmail;}
    public String getPassword(){return password;}

    //To Display the Information
    public String showInfo() {
        return "Display Name: " + firstName + " " + lastName +
                "\nCompany Email: " + email +
                "\nPassword is: " + password +
                "\nMailbox Capacity: " + mailboxCapacity +"mb";
    }

}
