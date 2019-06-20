/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week_4_inheritance;

/**
 *
 * @author Robin
 */
    // Java program to illustrate 
//the concept of Aggregation. 
import java.io.*; 
import java.util.*; 
  
// student class 
class Studen
{ 
    String name; 
    int id ; 
    String dept; 
      
    Studen(String name, int id, String dept)  
    { 
          
        this.name = name; 
        this.id = id; 
        this.dept = dept; 
          
    } 
} 
  
/* Department class contains list of student 
Objects. It is associated with student 
class through its Object(s). */
class Department  
{ 
      
    String name; 
    private List<Studen> students; 
    Department(String name, List<Studen> students)  
    { 
          
        this.name = name; 
        this.students = students; 
          
    } 
      
    public List<Studen> getStudents()  
    { 
        return students; 
    } 
} 
  
/* Institute class contains list of Department 
Objects. It is asoociated with Department 
class through its Object(s).*/
class Institute  
{ 
      
    String instituteName; 
    private List<Department> departments; 
      
    Institute(String instituteName, List<Department> departments) 
    { 
        this.instituteName = instituteName; 
        this.departments = departments; 
    } 
      
    // count total students of all departments 
    // in a given institute  
    public int getTotalStudentsInInstitute() 
    { 
        int noOfStudents = 0; 
        List<Studen> students;  
        for(Department dept : departments) 
        { 
            students = dept.getStudents(); 
            for(Studen s : students) 
            { 
                noOfStudents++; 
            } 
        } 
        return noOfStudents; 
    } 
      
}  
  
// main method 
class GFG 
{ 
    public static void main (String[] args)  
    { 
        Studen s1 = new Studen("Mia", 1, "CSE"); 
        Studen s2 = new Studen("Priya", 2, "CSE"); 
        Studen s3 = new Studen("John", 1, "EE"); 
        Studen s4 = new Studen("Rahul", 2, "EE"); 
      
        // making a List of  
        // CSE Students. 
        List <Studen> cse_students = new ArrayList<>(); 
        cse_students.add(s1); 
        cse_students.add(s2); 
          
        // making a List of  
        // EE Students 
        List <Studen> ee_students = new ArrayList<>(); 
        ee_students.add(s3); 
        ee_students.add(s4); 
          
        Department CSE = new Department("CSE", cse_students); 
        Department EE = new Department("EE", ee_students); 
          
        List <Department> departments = new ArrayList<>(); 
        departments.add(CSE); 
        departments.add(EE); 
          
        // creating an instance of Institute. 
        Institute institute = new Institute("BITS", departments); 
          
        System.out.print("Total students in institute: "); 
        System.out.print(institute.getTotalStudentsInInstitute()); 
    } 
} 
