
import java.security.MessageDigest;
import java.util.Formatter;

public class ShaTest {
    public static void main(String[] args) throws Exception{
        // test sha1(94a1b8563f08a8b9c65189161fb61aaa1603356013445678）= a230e6da8c8a4e3aaa2c3330edf4e60f6962e517
        String beforeEncrypt = "94a1b8563f08a8b9c65189161fb61aaa1603356013445678";

        MessageDigest crypt = MessageDigest.getInstance("SHA-1");
        crypt.reset();
        crypt.update(beforeEncrypt.getBytes("UTF-8"));
        String afterEncrypt = byteToHex(crypt.digest());
        System.out.println(afterEncrypt);

        int t = (int) System.currentTimeMillis() / 1000;
        System.out.println(t);
    }
    public static String byteToHex(final byte[] hash) {
        Formatter formatter = new Formatter();
        for (byte b : hash) {
            formatter.format("%02x", b);
        }
        String result = formatter.toString();
        formatter.close();
        return result;
    }
}
