package JavaConcept;

import org.testng.annotations.Test;

import java.util.Scanner;

public class Iteration {

    @Test
    public void iterateThrewForloop(){
       int userInput=2;
       for(int i =1; i<=10 ;i ++){
           int userOutput =userInput*i;
           System.out.println(userOutput);
       }
    }
    @Test
    public void iterateUsingForEachloop(){
       int [] arr ={1,2,3,4,5,6,7,8,9,10} ;
       int userInput=2;
       for(int i:arr){
           int userOutput = userInput*i;
           System.out.println(userOutput);
       }
    }
}
