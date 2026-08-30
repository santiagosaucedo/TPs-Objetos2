package unq;

import java.util.ArrayList;
import java.util.List;

public class DisarmNumber {
    private List<Integer> listOfNumbers;

    public void setListOfNumbers(List<Integer> aListOfNumbers){
        this.listOfNumbers = aListOfNumbers;
    }

    public  List<Integer> getListOfNumbers(){
        return this.listOfNumbers;
    }



    public int getNumberWithMoreEvensIn(List<Integer> aList ){
        int maxEvenNumberNow = aList.getFirst();
        for (int num : aList){
            maxEvenNumberNow = this.getMaxEvensBetween(num , maxEvenNumberNow);
        }
        return maxEvenNumberNow;
    }

    public int getMaxEvensBetween(int num1, int num2){
        int cantEvens1 = this.getCantEvenNumbers(num1);
        int cantEvens2 = this.getCantEvenNumbers(num2);
        return (cantEvens1 > cantEvens2) ? num1 : num2;
    }

    public int getCantEvenNumbers(int number){
        int cantEvensNow = 0;
        int actualNumber = Math.abs(number);
        do{
            //saco primer digito
            int actualDigit =  actualNumber % 10;
            //evaluó el digito
            cantEvensNow += this.oneIfNumberIsEven(actualDigit);
            //avanzo al proximo digito
            actualNumber = actualNumber /10;

        } while(actualNumber > 0);
        return cantEvensNow;
    }

    public int oneIfNumberIsEven(int i){
        return (i % 2 == 0) ? 1 :0;
    }

}
