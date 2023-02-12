package manager;
import dto.Consultation;
import dto.Doctor;
import dto.Patient;
import frames.ConsultationFrame;
import java.io.*;
import java.util.*;

 /*
 * The class Westminster skin consultation manager implements skin consultation manager
 */
public class WestminsterSkinConsultationManager implements SkinConsultationManager {

    Scanner scanner = new Scanner(System.in);

    private final ArrayList<Doctor> doctors = new ArrayList<>();
    private final ArrayList<Consultation> consultations = new ArrayList<>();
    private final ArrayList<Patient> patients = new ArrayList<>();

    @Override

/**
 *
 * Gets the doctors
 *
 * @return the doctors
 */
    public ArrayList<Doctor> getDoctors() {

        return this.doctors;
    }

    @Override

/**
 *
 * Add doctor
 *
 */
    public void addDoctor() {

        try{
            //Check doctors arrayList size is more than or equals to 10
            if (doctors.size() >= 10){
                System.out.println("The maximum number of doctors that can be added to the system has been reached.");
                return;
            }

            /** Taking inputs **/
            System.out.println("Adding a Doctor...\n");
            System.out.print("Enter the name of the doctor: ");
            String name = scanner.next();

            System.out.print("Enter the surname of the doctor: ");
            String surname = scanner.next();

            System.out.print("Enter the date of birth of the doctor(YYYYMMDD): ");
            int dateOfBirth = scanner.nextInt();

            System.out.print("Enter the mobile number of the doctor(xxxxxxxxxx): ");
            int mobileNumber = scanner.nextInt();

            System.out.print("Enter the medical license number of the doctor: ");
            int medicalLicenseNumber = scanner.nextInt();

            System.out.print("Enter the specialization of the doctor(e.g. cosmetic dermatology, medical dermatology, paediatric, dermatology, etc.): ");
            String specialization = scanner.next();

            Doctor doctor = new Doctor(name, surname, dateOfBirth, mobileNumber, medicalLicenseNumber, specialization);
            doctor.setName(name);
            doctor.setSurname(surname);
            doctor.setDateOfBirth(dateOfBirth);
            doctor.setMobileNumber(mobileNumber);
            doctor.setMedicalLicenseNumber(medicalLicenseNumber);
            doctor.setSpecialization(specialization);

            //add data to the doctors array list
            doctors.add(doctor);
            System.out.println("Doctor added successfully.\nTotal number of doctors: " + doctors.size());

        } catch (InputMismatchException e) {
            System.out.println("Invalid!!! Press 'a' to add your doctor details again");
        }
    }

    @Override

/**
 *
 * Delete doctor
 *
 */
    public void deleteDoctor() {

        try{
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the medical license number of the doctor to remove: ");
            int medicalLicenseNumber = scanner.nextInt();

            // Find the doctor with the specified license number
            Doctor doctor = null;
            for (Doctor d : this.doctors) {
                if (d.getMedicalLicenseNumber() == (medicalLicenseNumber)) {
                    doctor = d;
                    break;
                }
            }

            if (doctor == null) {
                System.out.println("No doctor was found with the specified license number.");
            }
            else {
                this.doctors.remove(doctor);
                System.out.println("The doctor with:\nName: " + doctor.getName() + "\n" + "Surname: " + doctor.getSurname() + "\nMedical License number: " + doctor.getMedicalLicenseNumber() + "\nhas been removed.");
                System.out.println("The centre now has " + this.doctors.size() + " doctors.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input!!!!");
        }
    }

    @Override

/**
 *
 * Save doctor
 *
 */
    public void saveDoctor() {

        try {
            // Sort the doctors list alphabetically by name
            Collections.sort(doctors, new Comparator<Doctor>(){
                @Override
                /**
                 *
                 * Compare
                 *
                 * @param d1  the d1
                 * @param d2  the d2
                 * @return int
                 */
                public int compare(Doctor d1, Doctor d2) {
                    return d1.getName().compareTo(d2.getName());
                }
            });

            BufferedWriter w = new BufferedWriter(new FileWriter("text.txt", true));
            for (Doctor doctor : this.doctors) {
                w.write(doctor.getName() + " " + doctor.getSurname() + " " + doctor.getDateOfBirth() + " " + doctor.getMobileNumber() + " " + doctor.getSpecialization() + " " + doctor.getMedicalLicenseNumber() + "\n");
            }
            w.newLine();
            w.flush();
        } catch (IOException empty) {
            System.err.println("file not found");
        }
        System.out.println("Data saved to the text file");
    }

    @Override

/**
 *
 * Load doctor
 *
 */
    public void loadDoctor() {
        // Read the information for each doctor from the file and create a Doctor object for each one
        try {
            File readFile = new File("Text.txt");
            Scanner read = new Scanner(readFile);
            String fileLine;
            while (read.hasNext()){
                fileLine = read.nextLine();
                System.out.println(fileLine);
            }
            read.close();
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }

    @Override

/**
 *
 * Print doctor
 *
 */
    public void printDoctor() {

        doctors.sort((Doctor d1, Doctor d2) -> d1.getSurname().compareTo(d2.getSurname()));
        System.out.println("List of Doctors:");
        for (Doctor doctor : doctors) {
            System.out.println("Name: " + doctor.getName());
            System.out.println("Surname: " + doctor.getSurname());
            System.out.println("Date of Birth: " + doctor.getDateOfBirth());
            System.out.println("Mobile Number: " + doctor.getMobileNumber());
            System.out.println("Medical License Number: " + doctor.getMedicalLicenseNumber());
            System.out.println("Specialization: " + doctor.getSpecialization());
            System.out.println();
        }

    }

    @Override

/**
 *
 *  GUI
 *
 * @param doctors  the doctors
 * @return ArrayList<Doctor>
 */
    public ArrayList<Doctor> GUI(ArrayList<Doctor> doctors) {

        try {
            if (doctors.size() != 0) {
                ConsultationFrame frame2 = new ConsultationFrame(doctors);
                frame2.setVisible(true);
            } else {
                System.out.println("Add at least one doctor to go to the consultation view");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return doctors;
    }

    @Override

/**
 *
 * Add consultation
 *
 * @param consultation  the consultation
 */
    public void addConsultation(Consultation consultation) {

        consultations.add(consultation);
    }

    @Override

/**
 *
 * Gets the consultation
 *
 * @return the consultation
 */
    public ArrayList<Consultation> getConsultation() {

        return this.consultations;
    }

    @Override

/**
 *
 * Add patient
 *
 * @param patient  the patient
 */
    public void addPatient(Patient patient) {

        patients.add(patient);
    }

    @Override

/**
 *
 * Gets the patient
 *
 * @return the patient
 */
    public ArrayList<Patient> getPatient() {

        return this.patients;
    }
}


