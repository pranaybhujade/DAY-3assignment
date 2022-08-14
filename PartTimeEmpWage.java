package com.bridgelabz;

public class PartTimeEmpWage {
    public static void main(String[] args) {
        int fulltime=2;
        int parttime=1;
        int emprateperhr=20;
        int empHrs=0;
        int empWage=0;
        double empCheck=Math.floor(Math.random()*10)%3;
        if(empCheck==fulltime)
            empHrs=8;
        else if (empCheck==parttime)
            empHrs=4;

        else
            empHrs=0;
        empWage=empHrs*emprateperhr;
        System.out.println("emp wage:" +empWage);
    }
}
