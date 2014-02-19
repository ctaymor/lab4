package edu.mills.cs180a.classlist;

/**
 * Information about a person (student or teacher) in CS 180A: Mobile Application Development.
 * 
 * @author ellen.spertus@gmail.com (Ellen Spertus)
 */
public class Person {
    final static Person[] everyone = {
        new Person("AJ", "Parmidge", "aparmidge@mills.edu"),
        new Person("Caroline", "Taymor", "ctaymor@gmail.com"),
        new Person("Ching", "Yu", "cyu@mills.edu"),
        new Person("Christie", "Yeh", "cyeh@mills.edu"),
        new Person("Colin", "Lockard", "clockard@mills.edu"),
        new Person("Ellen", "Spertus", "ellen.spertus@gmail.com"),
        new Person("Fiona", "Robinson", "frobinson@mills.edu"),
        new Person("Michele", "Collender", "mcollender@mills.edu"),
        new Person("Renee", "Johnston", "renee.johnston1149@gmail.com"),
        new Person("Robert", "Andrews", "roandrews@mills.edu"),
        new Person("Taurin", "Barrera", "taurin.barrera@mills.edu"),
        new Person("Trevor", "Adams", "trevorbadams@gmail.com")
    };
    private String mFirstName;
    private String mLastName;
    private String mEmail;
    
    /**
     * Constructs a new {@code Person}.
     * 
     * @param first the first name
     * @param last the last name
     * @param email the email address
     */
    public Person(String first, String last, String email) {
        mFirstName = first;
        mLastName = last;
        mEmail = email;
    }
    
    /**
     * Gets the first name.
     *
     * @return the first name
     */
    public String getFirstName() {
        return mFirstName;
    }
    
    /**
     * Gets the last name.
     *
     * @return the last name
     */
    public String getLastName() {
        return mLastName;
    }
    
    /**
     * Gets the email address
     *
     * @return the email address
     */
    public String getEmail() {
        return mEmail;
    }
    
    @Override
    public String toString() {
        return mFirstName + ' ' + mLastName;
    }
}
