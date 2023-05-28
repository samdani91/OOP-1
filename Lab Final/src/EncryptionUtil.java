public class EncryptionUtil {

    public static String encrypt(String password, int n) {
        int length = password.length();
        int shift = n % length;
        String encryptedPassword = password.substring(shift) + password.substring(0, shift);
        return encryptedPassword;
    }

    public static String decrypt(String encryptedPassword, int n) {
        int length = encryptedPassword.length();
        int shift = length - (n % length);
        String decryptedPassword = encryptedPassword.substring(shift) + encryptedPassword.substring(0, shift);
        return decryptedPassword;
    }
}
