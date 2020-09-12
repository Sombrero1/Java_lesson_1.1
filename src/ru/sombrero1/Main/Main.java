package ru.sombrero1.Main;

import java.util.Arrays;
import java.util.Random;
//Первая практическая - все задачи в виде функций
public class Main {

    public static void main(String[] args) {
	// write your code here

        example3();
        System.out.println(example4(args));
        example5();
        example6();
        System.out.println( example7(5));




    }

    public static void example3(){
        int []mass=new int[10];
        int answer=0;

        Random rand=new Random();
        for(int i=0; i<10; i++)
            mass[i]=rand.nextInt(100);

        for(int i=0; i<mass.length; i++)
            answer+=mass[i];

        System.out.println(String.format("Answer_3: %d",answer));

        answer=0;
        int j=0;
        while(j<mass.length) {
            answer += mass[j];
            j++;
        }
        System.out.println(String.format("Answer_3: %d",answer));

        answer=0;
        j=0;
        do{
            answer+=mass[j];
            j++;

        }
        while(j<mass.length);
        System.out.println(String.format("Answer_3: %d",answer));



    }

    public static String example4(String []args){
        String s="Answer_4: ";

        for (String a:args
             ) {
            s+=a +" ";
        }

        return s;

    }

    public static void example5(){
        double answer=0;
        String [] a=new String[11];
        a[0]="Answer 5:";

        for(int i=0; i<10; i++)
            a[i+1]= Double.toString((1.0/(i+1)));


        for (String s:a
             ) {
            System.out.println(s);

        }
    }



    public static void example6(){
        int []mass=new int[10];
        Random rand=new Random();

        System.out.println("Answer_6.1:");
        for(int i=0; i<10; i++)
            mass[i]=rand.nextInt(100);

        for (int a: mass
             ) {
            System.out.print(a +" ");
        }

        System.out.println();

        Arrays.sort(mass);  for (int a: mass
        ) {
            System.out.print(a +" ");

        }
        System.out.println();


        //вторым способом

        System.out.println("Answer_6.2:");
        for(int i=0; i<10; i++)
            mass[i]=(int)(Math.random()*100);

        for (int a: mass
        ) {
            System.out.print(a +" ");
        }

        System.out.println();

        Arrays.sort(mass);  for (int a: mass
        ) {
            System.out.print(a +" ");

        }
        System.out.println();


    }

    public static String example7(int n){
        int answer=1;


        for(int i=n; i>1; i--){
            answer*=i;
        }




        String s=String.format("Answer_7: %d",answer);
        return s;
    }



}
