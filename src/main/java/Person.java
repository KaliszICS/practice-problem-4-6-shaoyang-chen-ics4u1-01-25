import java.util.Arrays;

/**
 * The Person class represents a person with personal information including name,
 * birthdate, social security number, and siblings.
 *
 * @author Shaoyang Chen
 * @version 114.514
 * @since 1919.8.10
 */
public class Person {
    private String firstname;
    private String lastname;
    private int birthDay;
    private int birthMonth;
    private int birthYear;
    private String ssn;
    private int numberOfSiblings;
    private Person[] siblings;

    /**
     * Constructs a new Person with the specified personal information.
     * The numberOfSiblings is initialized to 0 and siblings to an empty array.
     *
     * @param firstname the first name of the person
     * @param lastname the last name of the person
     * @param birthDay the day of birth
     * @param birthMonth the month of birth
     * @param birthYear the year of birth
     * @param ssn the social security number
     */
    public Person(String firstname, String lastname, int birthDay, int birthMonth, int birthYear, String ssn) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
        this.ssn = ssn;
        this.numberOfSiblings = 0;
        this.siblings = new Person[0];
    }

    // Getters and setters for firstname and lastname

    /**
     * Returns the first name of the person.
     *
     * @return the first name of the person
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * Sets the first name of the person.
     *
     * @param firstname the new first name for the person
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     * Returns the last name of the person.
     *
     * @return the last name of the person
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * Sets the last name of the person.
     *
     * @param lastname the new last name for the person
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * Returns the birthday of the person in day/month/year format.
     *
     * @return the birthday as a string in "day/month/year" format
     */
    public String getBirthday() {
        return birthDay + "/" + birthMonth + "/" + birthYear;
    }

    /**
     * Adds a sibling to the person's siblings array.
     * This method increases the size of the siblings array and adds the new sibling.
     *
     * @param sibling the sibling to add
     */
    public void addSibling(Person sibling) {
        // Increase the size of the siblings array by 1
        Person[] newSiblings = Arrays.copyOf(siblings, siblings.length + 1);

        // Add the new sibling to the end of the array
        newSiblings[siblings.length] = sibling;

        // Update the siblings array reference
        siblings = newSiblings;

        // Increase the number of siblings
        numberOfSiblings++;
    }

    /**
     * Returns an array of the person's siblings.
     *
     * @return an array of Person objects representing the siblings
     */
    public Person[] getSiblings() {
        return siblings;
    }

    // Additional getters for other instance variables (not required but useful)

    /**
     * Returns the birthday of the person.
     *
     * @return the birthday
     */
    public int getBirthDay() {
        return birthDay;
    }

    /**
     * Returns the birth month of the person.
     *
     * @return the birth month
     */
    public int getBirthMonth() {
        return birthMonth;
    }

    /**
     * Returns the birth year of the person.
     *
     * @return the birth year
     */
    public int getBirthYear() {
        return birthYear;
    }

    /**
     * Returns the social security number of the person.
     *
     * @return the social security number
     */
    public String getSsn() {
        return ssn;
    }

    /**
     * Returns the number of siblings the person has.
     *
     * @return the number of siblings
     */
    public int getNumberOfSiblings() {
        return numberOfSiblings;
    }
}