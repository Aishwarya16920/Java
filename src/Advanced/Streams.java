package Advanced;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args){

        List<Integer> nums = Arrays.asList(6, 5, 2, 8, 1, 7);

        nums.stream()
                .filter(n -> n%2 == 1)
                .sorted()
                .map(n -> n*2)
                .forEach(n -> System.out.println(n));

        int result =nums.stream()
                .filter(n -> n%2 == 1)
                .map(n -> n*2)
                .reduce(0, (c,e) -> c+e);

        System.out.println(result);

//        Stream<Integer> data = nums.stream();
//        Stream<Integer> mappedData = data.map(n -> n*2);
//        mappedData.forEach(n -> System.out.println(n));



//        data.forEach(n -> System.out.println(n));

//        long count = data.count();
//        System.out.println(count);

//        Stream<Integer> sortedData = data.sorted();
//        sortedData.forEach(n -> System.out.println(n));


    }
}
