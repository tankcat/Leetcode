package problems.easy;

/**
 * Given a non-negative integer c, your task is to decide whether there're two integers a and b such that a2 + b2 = c.

 Example 1:
 Input: 5
 Output: True
 Explanation: 1 * 1 + 2 * 2 = 5
 Example 2:
 Input: 3
 Output: False
 */
public class SumOfSquareNumbers {
    public boolean judgeSquareSum(int c) {
        int a=0;
        int b=(int)Math.sqrt(c);
        while(a<=b){
            if(a*a+b*b==c)
                return true;
            else if(a*a+b*b<c)
                a++;
            else
                b--;
        }
        return false;
    }

    public static void main(String[] args){
        SumOfSquareNumbers obj=new SumOfSquareNumbers();
        System.out.println(obj.judgeSquareSum(25));
    }
}
