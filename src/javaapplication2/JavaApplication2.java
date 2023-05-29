/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

/**distributed vcs - local rep
 *steps : initialize versioning , .gitconfig , .gitignore , commit
 * @author seram
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student[] list = new Student[3];  // array of object declaration
                       // object student1
        Student s1 = new Student(); // define s1 name and age; 
       s1.setName("peter");
       s1.setAge(21);
       
         Student s2 = new Student(); // define s1 name and age; 
       s2.setName("tARA");
       s2.setAge(31);
       
         Student s3 = new Student(); // define s1 name and age; 
       s3.setName("KAUr");
       s3.setAge(91);
       //array
       list[0]=s1;
       list[1]= s2;
       list[2]=s3;
       
       
       for( int i = 0; i < list.length ;i++){
           System.out.println(list[i].getName() + "  " + list[i].getAge());
       }
   } //branch modified
    
}
