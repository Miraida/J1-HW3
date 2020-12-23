package com.company;

import java.text.DecimalFormat;
import java.util.Random;

public class Main {
    static Random random = new Random();
    public static void main(String[] args) {

        double[] fractionalArray = new double[15];

        int a,b,i=0,s=0,count=0;
        double x, avarageNumber=0.0;
        DecimalFormat df = new DecimalFormat("#.###");
        System.out.print("Array numbers: ");
        while (i<15)
        {
            a=getRandomNumber();
            b=getRandomNumber();

            if(b!=0){
                fractionalArray[i] = (double) a/b ;
                    System.out.print(fractionalArray[i]+"  ");
                i++;
            }
        }
        System.out.println();

        for (double j:fractionalArray)
        {
            if (j<0)
            {
               s++;
            }
            if (s>0 && j>=0)
             {
                avarageNumber = avarageNumber + j;
                count++;
             }

        }
         if (count == 0){avarageNumber = 0.0;}
         else avarageNumber/=count;
        System.out.println("WARNING (-0.0 equals to 0 !!!)");
        System.out.println("Count is: "+count);
        System.out.println("Avarage number is: "+avarageNumber);
        System.out.println("____________________________________________________________");

        increaseAlgorithm();
    }

    public static int getRandomNumber(){

        return  random.nextInt(20)-4;
    }

/////////////////////// ////////Доп. Задание /////////////////////////////////////////

public static void increaseAlgorithm() {
    int[] increaseArray = new int[10];
    int k , swap ;

    System.out.print("Increase array: ");

    for (int j = 0; j < 10; j++) {
        increaseArray[j] = random.nextInt(50);
        System.out.print(increaseArray[j] + " ");
    }

    System.out.println();

    int min;
    for (int i = 0; i < 10; i++)
    {
        min = increaseArray[i];  k = i;
        for (int j = i; j < 9; j++)
         {
            if (min > increaseArray[j + 1])
              {
                min = increaseArray[j + 1];
                k = j + 1;
              }
         }
      swap = increaseArray[i];
      increaseArray[i] = min;
      increaseArray[k] = swap;

      System.out.print("iteration " + i +": ");

        for (int l = 0; l < 10; l++)
          {
            System.out.print(increaseArray[l] + " ");
          }
          System.out.println();
    }

  }

}
