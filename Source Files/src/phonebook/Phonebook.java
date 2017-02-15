/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonebook;
import javax.swing.JFrame;
/**
 *
 * @author rgukt

*/
import java.io.*;
public class Phonebook {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       try{
           File fr=new File("phnoebook/");
           if(!fr.exists())
               fr.mkdir();         
       }
       catch(Exception Ex) {
           ;
       }
       try{
           File fr=new File("phnoebook/userdata");
           if(!fr.exists())
               fr.mkdir();         
       }
       catch(Exception Ex) {
           ;
       }
       try{
           File fr=new File("phnoebook/userdata/admin");
           if(!fr.exists())
               fr.createNewFile();         
       }
       catch(Exception Ex) {
           ;
       }
       try{
           File fr=new File("phnoebook/userdata/guest");
           if(!fr.exists())
               fr.createNewFile();         
       }
       catch(Exception Ex) {
           ;
       }
       home frame=new home();
       frame.setTitle("Phone Book");
       frame.setLocationRelativeTo(null);
       frame.setVisible(true);
      
    }
    
}
