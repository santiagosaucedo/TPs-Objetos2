package unq;

import java.util.ArrayList;
import java.util.List;

public class Counter {
    List<Integer> list = new ArrayList<>();

    public void addNumber(int number) {
        this.list.add(number);
    }

    public int getEvenOccurrences() {
        return (int) list.stream().filter(x -> x % 2 != 0).count() ;
    }
    public int getOddOccurrences() {
        return (int) list.stream().filter(x -> x % 2 == 0).count();
    }

    public int getMultipleOccurrences(int number){
        if(number == 0){
            return (int) list.stream().filter(x -> x == number).count();
        }
        return (int) list.stream().filter(x -> x % number == 0).count();
    }
}
