package h2h;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5 {

    public static void main(String... a) throws NoSuchAlgorithmException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        MessageDigest md = MessageDigest.getInstance("MD5");

        byte[] messageDigest = md.digest(br.readLine().getBytes());

        BigInteger no = new BigInteger(1, messageDigest);

        String hashtext = no.toString(16);
        while (hashtext.length() < 32) hashtext = "0" + hashtext;

        System.out.println(hashtext + "Last 7815696ecbf1c96e6894b779456d330e");

    }
}
