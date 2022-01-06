/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ComaparatorInColl;

import java.util.Comparator;

/**
 *
 * @author shubi
 */
public class IdComprEMp implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.id-o2.id;
    }
    
}
