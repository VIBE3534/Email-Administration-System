package emailadministrationsystem;

import java.util.Locale;
import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private int defaultPasswordLength=8;
    private String password;
    private String department;
    private String email;
    private String companySuffix = "company.com";
    private int mailboxCapacity = 500;
    private String alternateEmail;

    // Constructor to receive fist and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
      //  System.out.println("Email created: " + this.firstName + this.lastName);

        //call a department asking for the department - return department
        this.department = setDepartment();
      //  System.out.println("Department: "+ this.department);

        // call a method that returns a random password
        this.password = randomPassword(defaultPasswordLength);
      //  System.out.println(" Your password is: "+ this.password);

        // Combine elements to generate email
        email= firstName.toLowerCase(Locale.ROOT) +"."+ lastName.toLowerCase()+"@"+ department.toLowerCase() +"."+ companySuffix;
      //  System.out.println("Your email:  "+ email);
    }
    // ask for department
    private String setDepartment() {
        System.out.print("New worker: "+ firstName +"\n Department codes: \n 1.Sales \n 2.Development \n 3.Accounting \n 0.None \n enter department code: ");
        Scanner in = new Scanner(System.in);
        int departmentChoice = in.nextInt();
        if (departmentChoice == 1){
            return "Sales";
        } else if (departmentChoice == 2) {
            return "Development";
        } else if (departmentChoice == 3) {
            return "Accounting";
        } else {
            return "";
        }
    }

    // generate random password
    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789*@#$&";
        char[] password = new char[length];
         for(int i = 0; i < length ; i++) {
             int rand= (int)(Math.random() * passwordSet.length());
             password[i] = passwordSet.charAt(rand);
         }
         return new String(password);
    }

    // set email capacity
    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity = capacity;
    }
    // set alternate email
    public void setAlternateEmail(String altEmail) {
        this.alternateEmail = altEmail;
    }

    // change the password
    public void changePassword(String password) {
        this.password = password;
    }
    public int getMailboxCapacity(){
        return mailboxCapacity;
    }
    public String getAlternateEmail(){
        return alternateEmail;
    }
    public String getPassword(){
        return password;
    }
    public String showInfo() {
        return "Display Name: "+ firstName +" "+ lastName +
                "\n Company Email: "+ email +
                "\n Alternate Email: "+ alternateEmail +
                "\n Password: " + password +
                "\n Mailbox capacity: "+ mailboxCapacity+"mb";
    }
}
