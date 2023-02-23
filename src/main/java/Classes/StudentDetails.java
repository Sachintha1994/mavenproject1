/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
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
            String studentData = student.getStudentID()+","+student.getStudentName()+","+student.getDob()+","+student.getEnrollmentDate()
                    +","+ student.getAddress()+","+student.getMobileNumber()+","+ student.getDegreeProgram();
            
            
            
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
    
    public Student findStudentFromTextFile(String studentId) throws IOException{
    
        Student student = null;
        try {
            
            FileInputStream fileInputStream = new FileInputStream(FILEPATH);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
            
            String readLine;
            
            while((readLine = (String) bufferedReader.readLine())!= null){
                String[] detailsStudent = readLine.split(",");
                if (studentId.equals(detailsStudent[0])){
                    student = new Student();
                    student.setStudentID(detailsStudent[0]);
                    student.setStudentName(detailsStudent[1]);
                    student.setDob(detailsStudent[2]);
                    student.setEnrollmentDate(detailsStudent[3]);
                    student.setAddress(detailsStudent[4]);
                    student.setMobileNumber(detailsStudent[5]);
                    student.setDegreeProgram(detailsStudent[6]);
                }
            }  
        } catch (FileNotFoundException ex) {
            Logger.getLogger(StudentDetails.class.getName()).log(Level.SEVERE, null, ex);
        } 
       return student; 
    }
}
