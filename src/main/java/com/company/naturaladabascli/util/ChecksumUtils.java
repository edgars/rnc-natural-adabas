package com.company.naturaladabascli.util;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * MD5 checksum for artifact fingerprinting.
 */
public final class ChecksumUtils {

    private ChecksumUtils() {
    }

    public static String md5Hex(byte[] data) {
        if (data == null) {
            return "";
        }
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] digest = md.digest(data);
            return String.format("%032x", new BigInteger(1, digest));
        } catch (NoSuchAlgorithmException e) {
            return "";
        }
    }
}
