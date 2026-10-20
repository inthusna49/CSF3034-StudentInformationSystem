/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentinformationsystem;

/********************************************************************
 * Author: Intan Nur Husna binti Morhisam
 * Program Name: StudentInformationSystem.java
 * Description: To display basic information and calculate marks
 * Date: 20 October 2026
 * Modified Date: None
 * Version: 1.0
 ********************************************************************/
public class StudentInformationSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Display student name and student ID
        System.out.println("Student Name: Intan Nur Husna binti Morhisam");
        System.out.println("S87478");
        //Update information
        System.out.println("Semester: Semester 1");
      
        //Calculate two marks
        //Initialize marks
        int mark1 = 67;
        int mark2 = 88;
        //Calculate total
        int total = mark1 + mark2;
        //Display total
        System.out.println("Total mark: " + total);
        
        //Display message
        if (total >= 150){
            System.out.println("Result: Excelent");
        }
        else if (total >= 100) {
            System.out.println("Result: Good");
        }
        else {
            System.out.println("Result: Needs Improvement");
        }
    }
    
}
