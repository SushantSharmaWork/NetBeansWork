/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ComaparatorInColl;

/**
 *
 * @author shubi
 */
public class StudentCompareTo implements Comparable<StudentCompareTo>{
    int id;
    String name;
    int marks;

    public StudentCompareTo(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", marks=" + marks + '}';
    }

   /* @Override
    public int compareTo(StudentCompareTo st) {
        if(id==st.id){
        
        return 0;}
        if(id>st.id){
        
        return 1;}
        else
            return -1;
    } */
    @Override
    public int compareTo(StudentCompareTo st) {
    return this.name.compareTo(st.name);
    }
}
