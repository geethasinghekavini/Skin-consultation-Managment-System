package dto;

/**
 * The class Person
 */
public class Person {
    private String name;
    private String surname;
    private int dateOfBirth;
    private int mobileNumber;

    /**
     *
     * It is a constructor.
     *
     */
    public Person(){

    }

    /**
     *
     * It is a constructor.
     *
     * @param name  the name
     * @param surname  the surname
     * @param dateOfBirth  the date of birth
     * @param mobileNumber  the mobile number
     */
    public Person(String name, String surname, int dateOfBirth, int mobileNumber) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.mobileNumber = mobileNumber;
    }

    /**
     *
     * Gets the name
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * Sets the name
     *
     * @param name  the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * Gets the surname
     *
     * @return the surname
     */
    public String getSurname() {
        return surname;
    }


    /**
     *
     * Sets the surname
     *
     * @param surname  the surname
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     *
     * Gets the date of birth
     *
     * @return the date of birth
     */
    public int getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     *
     * Sets the date of birth
     *
     * @param dateOfBirth  the date of birth
     */
    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }


    /**
     *
     * Gets the mobile number
     *
     * @return the mobile number
     */
    public int getMobileNumber() {
        return mobileNumber;
    }


    /**
     *
     * Sets the mobile number
     *
     * @param mobileNumber  the mobile number
     */
    public void setMobileNumber(int mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
}
