package Files;

import java.util.Arrays;
import java.util.stream.Collectors;

public class BinToStr {
    public static void main(String[] args) {
        String input = "01000010 01101111 01111001 01100001 01101110";

        String raw = Arrays.stream(input.split(" "))
                .map(binary -> Integer.parseInt(binary,2))
                .map(Character:: toString)
                .collect(Collectors.joining());

        System.out.println(raw);
    }
}
