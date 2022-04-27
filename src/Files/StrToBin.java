package Files;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StrToBin {
    public static void main(String[] args) {
        String input  = "Boyan";
        String result = convertStringToBinary(input);

        System.out.println(result);

        System.out.println(prettyBinary(result,8," "));
    }
    public static String convertStringToBinary(String input) {

    StringBuilder result = new StringBuilder();
    char[] chars = input.toCharArray();
        for (char aChar:chars) {
            result.append(String.format("%8s",Integer.toBinaryString(aChar))
            .replaceAll(" ","0"));
        }
        return result.toString();
    }
    public static String prettyBinary(String binary,int blockSize, String separator){
        List<String> result = new ArrayList<>();
        int index = 0;
        while (index < binary.length()){
            result.add(binary.substring(index,Math.min(index + blockSize,binary.length())));
            index += blockSize;
        }
        return result.stream().collect(Collectors.joining(separator));
    }
}
