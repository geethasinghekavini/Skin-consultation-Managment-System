 import dto.Doctor;
 import manager.SkinConsultationManager;
 import manager.WestminsterSkinConsultationManager;

 import java.util.ArrayList;
import java.util.Scanner;


 /**
  * The class Main
  */
 public class Main {

     /**
      *
      * Main
      *
      * @param args  the args
      */
     public static void main(String[] args) {

         SkinConsultationManager skinConsultationManager;
         skinConsultationManager=new WestminsterSkinConsultationManager();

        // ArrayList<Doctor> doctors=new ArrayList<>();

         Scanner option=new Scanner(System.in);
         System.out.println("---------------------------------------------------------------------------");
         System.out.println("            Westminster Skin Consultation Manager                          ");
         System.out.println("---------------------------------------------------------------------------");
         System.out.println("                 A: Add Doctor                                         ");
         System.out.println("                 D: Delete Doctor                                      ");
         System.out.println("                 S: Save Doctor                                        ");
         System.out.println("                 P: Print Doctor                                       ");
         System.out.println("                 L: Load Doctor                                       ");
         System.out.println("                 G: Display GUI                                            ");
         System.out.println("---------------------------------------------------------------------------\n\n");

         System.out.println("Enter Your option(A,D,S,P,L,G): ");
         String choice=option.next();
         String selection=choice.toLowerCase();/**Convert Uppercase to Lowercase because java is case-sensitive**/

         while (!selection.equals("q")) {
             switch (selection) {
                 case "a":
                     skinConsultationManager.addDoctor();
                     break;
                 case "d":
                     skinConsultationManager.deleteDoctor();
                     break;
                 case "s":
                     skinConsultationManager.saveDoctor();
                     break;
                 case "p":
                     skinConsultationManager.printDoctor();
                     break;
                 case "l":
                     skinConsultationManager.loadDoctor();
                     break;
                 case "g":
                     skinConsultationManager.GUI(skinConsultationManager.getDoctors());
                     break;
                 case "q":
                     Quit();
                 default:
                     System.out.println("Invalid Input !! Try Again !!");
             }

             System.out.print("Enter your selection (A, D, S, P, L, G, Q): ");
             choice=option.next();
             selection=choice.toLowerCase();/**Convert Uppercase to Lowercase because java is case-sensitive**/
         }

         /**
          *
          * Quit
          *
          */

     }

     private static void Quit() {

         System.exit(1);
     }
 }






