
package FileHandl;

import java.io.*;

/**
 *
 * @author shubi
 */
public class SimpleIOStream {
    public static void main(String[] args) throws IOException {   
       //Need to close input and output streams that werer opened earlier to perform delete operation
        File f= new File("G:\\DeleteMe.txt");
        f.createNewFile();
        try {
            FileOutputStream fo = new FileOutputStream("G:\\DeleteMe.txt");
            String s = "Welcome to home";
            byte b[] = s.getBytes();
            fo.write(b);
            fo.close();
            System.out.println("File write successfully");
            
            FileInputStream fi = new FileInputStream("G:\\DeleteMe.txt");
            int i =0;
            while((i=fi.read())!=-1){
                System.out.print((char)i);
            }
            fi.close();
            System.out.println("\nErasing data from file");
            FileOutputStream del = new FileOutputStream("G:\\DeleteMe.txt");
            String empty = "";
            byte bo[] = empty.getBytes();
            del.write(bo);
            del.close();
            System.out.println("Erase done");
            
            System.out.println("Reading new data");
            FileInputStream fii = new FileInputStream("G:\\DeleteMe.txt");
            int j =0;
            while((j=fii.read())!=-1){
                System.out.print((char)j);
            }
            fii.close();
        }
       catch(Exception e){
       e.printStackTrace();
       }
            System.out.println("\nDelete done ? = "+f.delete());
    }
}
