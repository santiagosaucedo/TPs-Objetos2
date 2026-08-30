package unq;

public class Multipler {

    public int  getHighestMultipleOf(int num1 ,int num2){
        int actuallyHighest = -1;
        for (int i = 0 ; i <= 1000 ;i++) {
            actuallyHighest = (i % num1 == 0 && i % num2 == 0) ? i : actuallyHighest;
        }
        return actuallyHighest;
    }
}
