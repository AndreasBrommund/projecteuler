/**
 * Created by andreasbrommund on 2017-01-17.
 */
public class Problem1 {
    public static void main(String[] args) {
        int to = 999;
        int totSum = sumDivBy(3,to) + sumDivBy(5,to) - sumDivBy(3*5,to);
        System.out.println(totSum);
    }
    public static int sumDivBy(int n,int to){
        int max = to/n;
        return n * (max * (max + 1)) / 2; //arithmetic sum e.q. n * sum(i) from 1 to P = n * (P * (P + 1) / 2)
    }
}



