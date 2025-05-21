package com.crio.qcalc;

public class StandardCalculator {

    private int result;
    
    public int getResult() {
        return result;
    }


    public void setResult(int result) {
        this.result = result;
    }


    public void add(int num1, int num2){
        setResult(num1 + num2);
        printResult(num1, num2);
    }


    public void subtract(int num1, int num2){
        setResult(Math.abs(num1 - num2));
        printResult(num1, num2);
    }

    public void multiply(int num1, int num2){
        setResult(num1 * num2);
        printResult(num1, num2);
    }


    public void divide(int num1, int num2){
        setResult(num1 / num2);
        printResult(num1, num2);
    }

    
    public void clearResult(){
        setResult(0);
    }


    public void printResult(int num1, int num2){
        System.out.println("Result of last operation between " + num1 + " and " + num2 + " is: " + getResult());
    }


}
