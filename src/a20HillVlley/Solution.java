package a20HillVlley;

public class Solution {
    public static void main(String[] args) {
        int[] A = {-3,-3};
        System.out.println(solution(A));
    }

    static int solution(int[] A) {

        int valley = A[0];
        int peak = A[0];
        int qCastles = 0;

        if(A.length==0){
            return 0;
        }

        int i = 0;
        while (i < A.length - 1) {
            while (i < A.length - 1 && A[i]>= A[i + 1]) {//check and keep iterating
                i++;
            }
            valley = A[i]; //valley found
            qCastles++;
            while (i < A.length - 1 && A[i] <= A[i + 1]) {//check and keep iterating
                i++;
            }
            peak = A[i]; //peak found...
            if(i>0 && (A[i] != A[i-1])){
                qCastles++;
            }

        }
        return qCastles;
        //THIS Solution is TimeCompl= O(N) and SpaceCompl 0(1)->For the variables that i used.
    }
}


