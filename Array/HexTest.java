package Array;

import java.util.Arrays;
import java.util.HexFormat;

public class HexTest {
    public static void main(String[] args) {
        String hex = "BADDECAF";
        byte[] bytes = HexFormat.of().parseHex(hex);
        assert Arrays.equals(bytes, new byte[] { -70, -35, -20, -81 });

        bytes = new byte[] { 0, -128, 65, -82,-3, 126 };
        String linuxAddress = HexFormat.ofDelimiter(":").formatHex(bytes);
        assert linuxAddress.equals("00:80:41:ae:fd:7e");
    }
}
