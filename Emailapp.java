package emailadministrationsystem;

public class Emailapp {
    public static void main(String[] args) {
        Email em1 = new Email("Nihar","Deshpande");

    // to get an alternate email
        em1.setAlternateEmail("abcd@gmail.com");
    //    System.out.println("your alternate email is : "+ em1.getAlternateEmail());

        System.out.println(em1.showInfo());

    }
}
