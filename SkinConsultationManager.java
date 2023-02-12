package manager;

import dto.Consultation;
import dto.Doctor;
import dto.Patient;

import java.util.ArrayList;

public interface SkinConsultationManager {

    public void addDoctor();
    public void addConsultation(Consultation consultation);
    public void addPatient(Patient patient);
    public void deleteDoctor();
    public void saveDoctor();
    public void printDoctor();
    public void loadDoctor();
    public ArrayList<Doctor> getDoctors();
    public ArrayList<Consultation> getConsultation();
    public ArrayList<Patient> getPatient();
    public ArrayList<Doctor> GUI(ArrayList<Doctor> doctors);

}
