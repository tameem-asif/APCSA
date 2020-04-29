package piday;
import java.util.*;
public class LeibnizFormula {
    public static void main(String[]args)
{
//double Pi = 4*Sigma(1, n, n^2/2n+1);
Scanner input = new Scanner (System.in);
 int i = input.nextInt(); // value of i user entered
  double pi = 0;
 double denominator = 1;
 for (int x = 0; x < i; x++) {
    if (x % 2 == 0) {
       pi = pi + (1 / denominator);
    } else {
       pi = pi - (1 / denominator);
    }
    denominator = denominator + 2;
 }
 pi = pi * 4;
 System.out.println(pi);
}}
