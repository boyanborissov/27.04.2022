package Files;

public class StrToBinVol2 {
    public static void main(String[] args) {
        String input = "Boyan";//01000010 01101111 01111001 01100001 01101110
        StringBuilder sb = new StringBuilder();

        char[]chars = input.toCharArray();
        for (char c:chars) {
            String binary = Integer.toBinaryString(c);
            String formatted = String.format("%8s",binary);
            String output = formatted.replaceAll(" ","0");
            sb.append(output);
            sb.append(" ");
        }
        System.out.println(sb.toString());
    }
}
