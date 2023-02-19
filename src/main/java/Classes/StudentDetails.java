/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author sachi
 */
public class StudentDetails {
     
    private static final String FILEPATH = "C:\\Users\\sachi\\Documents\\NetBeansProjects\\mavenproject1\\src\\main\\java\\Classes\\studentData.txt";
    
    FileWriter fw = null;
    BufferedWriter bw = null;
    
    public boolean addStudentToTextFile(Student student){
    
        
        try {
            PrintWriter out = null;
            String studentData = student.getStudentName()+" "+ student.getStudentID()+" "+student.getDob()+" "+student.getEnrollmentDate()
                    +" "+ student.getAddress()+" "+student.getMobileNumber()+" "+ student.getDegreeProgram();
            
            
            
            out = new PrintWriter(new BufferedWriter(new FileWriter(FILEPATH,true)));
            out.println(studentData);
            
            out.close();
            
            JOptionPane.showMessageDialog(null, "Details are added");
            
            return true;
        } catch (IOException ex) {
            Logger.getLogger(StudentDetails.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
}
