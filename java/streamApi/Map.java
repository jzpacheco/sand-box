package streamApi;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Map {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);

        Consumer<Object> print = System.out::println;
        UnaryOperator<String> inverterString = string -> new StringBuilder(string).reverse().toString();
        Function<String, Integer> converteInteger = n -> Integer.parseInt(n ,2);

        nums.stream()
                .map(Integer::toBinaryString)
                .map(inverterString)
                .map(converteInteger)
                .forEach(print);
    }
}
