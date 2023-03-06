package util;

import java.util.List;

public class Printer {
    public static <T> void print(List<T> list) {
        list.forEach(System.out::println);
    }
}
