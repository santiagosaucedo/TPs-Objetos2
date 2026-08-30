 package unq;

import java.util.List;

public class MultiOperator {
    public int sumOfAllIn(List<Integer> aList){
        return aList.stream().mapToInt(Integer::intValue).sum();
    }
    public int subtractOfAllIn(List<Integer> aList){
        int subtractTightNow = 0;
        return aList.stream().mapToInt(Integer::intValue)
                             .reduce(0,(subtotal ,actualNumber) -> subtotal - actualNumber);

    }

    public int productOfAllin(List<Integer> aList){
        return aList.stream()
                    .reduce(1,(productTotal,actualNumber) -> productTotal*actualNumber);

    }
}
