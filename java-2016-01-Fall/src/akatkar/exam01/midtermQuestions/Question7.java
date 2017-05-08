package akatkar.exam01.midtermQuestions;

/**
 *
 * @author akatkar
 */
public class Question7 {
    
    public int numbers(int n){
        int sum = 0;
        for(int i=1;i<n;i++){
            if(i%3 != 0){
                sum += i;
            }
        }
        return sum;
    }
 
    public static void main(String[] args) {
        Question7 q7 = new Question7();
        int i = q7.numbers(7);
        System.out.println(i);
    }
}
