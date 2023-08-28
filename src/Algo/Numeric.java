package Algo;

public class Numeric {
        public static double answer;
        public static double intPower(double x,int n){
            if(n<0){
                answer = 1 / Math.pow(x,(-n));
            }
            else if(n>0 && n%2==0){
                answer = Math.pow((Math.pow(x,n)/2),2);
            }
            else if(n>0 && n%2!=0){
                answer = Math.pow(x,n-1) * x;
            }
            return answer;
        }
}
