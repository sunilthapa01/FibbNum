package com.project;


public class FibbNum{

    public int[] find(int number){

        int arr[]=new int[number];
        int n1 = 0, n2 =1;

        for(int i = 0;i<number;i++){

            if(i==0){
                arr[i] = n1;

            }
            else if(i==1){
                arr[i]=n2;

            }
            else{
                arr[i]=arr[i-1]+arr[i-2];

            }
        }
        return arr;

    }



    
    }
