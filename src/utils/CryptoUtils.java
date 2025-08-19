/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;
import javax.crypto.*;
import javax.crypto.spec.*;
import java.security.*;
import java.security.spec.KeySpec;
import java.util.Base64;

public class CryptoUtils {
    private static final String PASSWORD = "PuraVida-2025!";
    private static final String SALT = "MiPyME-SALT";
    
    public static String cifrar(String cedula) throws Exception {
        SecretKey key = generarClave(PASSWORD, SALT);
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        byte[] iv = new byte[12]; new SecureRandom().nextBytes(iv);
        GCMParameterSpec spec = new GCMParameterSpec(128, iv);
        cipher.init(Cipher.ENCRYPT_MODE, key, spec);
        byte[] cifrado = cipher.doFinal(cedula.getBytes());
        return Base64.getEncoder().encodeToString(iv) + ":" + Base64.getEncoder().encodeToString(cifrado);
    }

    public static String descifrar(String texto) throws Exception {
        String[] partes = texto.split(":");
        byte[] iv = Base64.getDecoder().decode(partes[0]);
        byte[] cifrado = Base64.getDecoder().decode(partes[1]);
        SecretKey key = generarClave(PASSWORD, SALT);
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        GCMParameterSpec spec = new GCMParameterSpec(128, iv);
        cipher.init(Cipher.DECRYPT_MODE, key, spec);
        return new String(cipher.doFinal(cifrado));
    }

    private static SecretKey generarClave(String password, String salt) throws Exception {
        SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");
        KeySpec spec = new PBEKeySpec(password.toCharArray(), salt.getBytes(), 65536, 256);
        SecretKey tmp = factory.generateSecret(spec);
        return new SecretKeySpec(tmp.getEncoded(),"AES");
    }
}
