package org.example;

public class AdvMath {
    public static double eps=0.00001;

    public static void main(String[] args) {
        System.out.println(root(70, 145));
    }
    public static double pow(double num, int power) throws IllegalArgumentException
    {
        if (power<0)
            throw new IllegalArgumentException("Power cannot be less than zero!");
        double res=1;
        for(int i=0; i<power; i++)
            res*=num;
        return res;
    }

    public static double root(double num, int power) throws IllegalArgumentException
    {
        if(power<=0)
            throw new IllegalArgumentException("Power cannot be zero or less!");
        if(num<0)
            throw new IllegalArgumentException("Number cannot be less than zero!");
        double low=0;
        double high=num;
        double avg=0;
        while(high-low>=eps)
        {
            avg=(low+high)/2.0;
            if(pow(avg, power)>num)
                high=avg;
            else
                low=avg;
        }
        return avg;
    }
}
