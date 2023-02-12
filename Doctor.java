package dto;

public class Doctor extends Person{
    /**
     * The class Doctor extends person
     */
    private int medicalLicenseNumber;
    private String specialization;
    private boolean available;

    /**
     *
     * Doctor
     *
     * @param name  the name
     * @param surname  the surname
     * @param dateOfBirth  the date of birth
     * @param mobileNumber  the mobile number
     * @param medicalLicenseNumber  the medical license number
     * @param specialization  the specialization
     * @return public
     */

    public Doctor(String name, String surname, int dateOfBirth, int mobileNumber, int medicalLicenseNumber, String specialization) {
        super(name, surname, dateOfBirth, mobileNumber);
        this.medicalLicenseNumber = medicalLicenseNumber;
        this.specialization = specialization;
    }

    /**
     *
     * Gets the medical license number
     *
     * @return the medical license number
     */
    public int getMedicalLicenseNumber() {
        return medicalLicenseNumber;
    }

    /**
     *
     * Sets the medical license number
     *
     * @param medicalLicenseNumber  the medical license number
     */
    public void setMedicalLicenseNumber(int medicalLicenseNumber) {

        this.medicalLicenseNumber = medicalLicenseNumber;
    }

    /**
     *
     * Gets the specialization
     *
     * @return the specialization
     */
    public String getSpecialization() {

        return specialization;
    }

    /**
     *
     * Sets the specialization
     *
     * @param specialization  the specialization
     */
    public void setSpecialization(String specialization) {

        this.specialization = specialization;
    }

    /**
     *
     * Display doctor
     *
     */
    public void displayDoctor(){
        System.out.println("Name "+getName());
    }

}
