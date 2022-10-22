/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task2;

/**
 *
 * @author hp
 */
public class GradeBook {
    int grade1;
    int grade2;
    int grade3;
    
    public void subbmit(int grade1,int grade2,int grade3){
        System.out.println("grade1"+"="+grade1+ "grade2"+"="+grade2+"grade3"+"="+ grade3);
    }
        public void sum(int grade1,int grade2,int grade3){
            int result=grade1+grade2+grade3;
            System.out.println(result);
        
    }
              public void average (int grade1,int grade2,int grade3){
            double res= (grade1+grade2+grade3)/3;
                  System.out.println(res);
        
    }
        

    
}
