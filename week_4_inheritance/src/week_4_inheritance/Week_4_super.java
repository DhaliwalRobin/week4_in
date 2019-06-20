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
public class Week_4_super {
    public String name;
    public int id;
    public Week_4_super(){
        this(3,"hello");
        System.out.println("super class-no arg");
    }
    public Week_4_super(int id, String name){
        this.name=name;
        this.id=id;
//        System.out.println("Super Class");
    }
    
    @Override
    public String toString(){
        return name+""+id;
    }
}
class Student extends Week_4_super{
    public Student(){
        this("hello");
        System.out.println("sub-class");
    }
    public Student(String msg){
        System.out.println("sub class-String arg");
    }
    
}
class Instructor extends Week_4_super{
    public Instructor(){
        System.out.println("this is Instructor Class");
    }
}