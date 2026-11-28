/**
 * The rand7() API is already defined in the parent class SolBase.
 * public int rand7();
 * @return a random integer in the range 1 to 7
 */
class Solution extends SolBase {
    public int rand10() {
        int num1 = rand7();
        int num2 = rand7();
        while(num1 == 7){
            num1 = rand7();
        }
        while(num2 > 5){
            num2 = rand7();
        }
        return num1 < 4? num2:num2+5;
    }
}