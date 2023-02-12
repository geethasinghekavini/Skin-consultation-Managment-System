package dto;

/**
 * The class Patient extends person
 */
public class Patient extends Person{
    private Integer patientId;

    /**
     *
     * Patient
     *
     * @param name  the name
     * @param surname  the surname
     * @param dateOfBirth  the date of birth
     * @param mobileNumber  the mobile number
     * @param patientId  the patient identifier
     * @return public
     */
    public Patient(String name, String surname, Integer dateOfBirth, Integer mobileNumber, Integer patientId) {
        super(name, surname, dateOfBirth, mobileNumber);
        this.patientId = patientId;
    }

    /**
     *
     * Gets the patient identifier
     *
     * @return the patient identifier
     */
    public int getPatientId() {
        return patientId;
    }


    /**
     *
     * Sets the patient identifier
     *
     * @param patientId  the patient identifier
     */
    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }
}
