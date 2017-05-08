/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akatkar.exam01.midtermQuestions;

/**
 *
 * @author akatkar
 */
public class Question3 {

    public int arrayElements() {
        int[] array = {1, 2, 3, 4, 5};
        int sum = 0;
        for(int i: array){
            if(i>3){
                sum += i;
            }
        }
        return sum;
    }
    
    public static void main(String[] args) {
        Question3 q3 = new Question3();
        int i=q3.arrayElements();
        System.out.println("i:"+i);
                
    }

}
