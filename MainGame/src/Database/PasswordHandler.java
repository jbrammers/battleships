package Database;

import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.util.ArrayList;

/**
 * Class used to hash passwords for secure storage
 */
public class PasswordHandler {

    /**
     * Method hashes password
     * @param password char array of password to be hashed
     * @param salt randomly generated salt stored with the password
     * @return String containing the hashed password with salt
     */
    public static String hashPassword(String password, byte[] salt) {
        try {
            char[] passChars = password.toCharArray();

            SecretKeyFactory skf = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA512");
            PBEKeySpec spec = new PBEKeySpec(passChars, salt, 5000, 512);
            SecretKey key = skf.generateSecret(spec);
            byte[] bytes = key.getEncoded();

            String hexes = "0123456789ABCDEF";
            StringBuilder hex = new StringBuilder(bytes.length * 2);
            for (byte b : bytes) {
                hex.append(hexes.charAt((b & 0xF0) >> 4))
                        .append(hexes.charAt((b & 0xF)));
            }

            return hex.toString();
        } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Creates a hashed password and salt pair from a given password
     * @param password password to be stored
     *
     * @return String[] where 0 = hashed password to be stored
     * and 1 is the salt to be stored
     */
    public static ArrayList<Object> newPassword(String password) {
        ArrayList<Object> output = new ArrayList<>();

        SecureRandom sr = new SecureRandom();
        byte[] bytes = new byte[16];
        sr.nextBytes(bytes);


        output.add(hashPassword(password, bytes));
        output.add(bytes);
        return output;
    }
}
