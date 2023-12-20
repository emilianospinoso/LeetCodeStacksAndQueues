package a09LongestFTP2Minutes;

public class SolutionWindow {
    /*
    Given this array of int find the 2 consecutive mayor sum .
     */
    public static void main(String[] args) {
        int[] workoutPowerData = {2, 4, 7, 5, 0, 9, 8, 0, 0, 5, 3, 7, 2};
        System.out.println(max2MintFtp(workoutPowerData));

    }


    static int max2MintFtp(int[] minutesPower){
        int maxSum=0;
        for (int i=0;i<minutesPower.length-1;i++){
            int auxSum= minutesPower[i]+minutesPower[i+1];
            if(auxSum>maxSum){
                maxSum=auxSum;
            }

        }

        return maxSum;
    }
}
