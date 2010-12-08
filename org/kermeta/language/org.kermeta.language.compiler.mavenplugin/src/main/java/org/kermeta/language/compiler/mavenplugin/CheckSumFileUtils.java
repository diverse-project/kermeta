/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kermeta.language.compiler.mavenplugin;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author ffouquet
 */
public class CheckSumFileUtils {


    public static boolean compareCheckSum(String inputPath,String outputPath){
        boolean res = false;
        try {
            String checkSum = checkSumFile(inputPath);
            String checkSumPrevious = readCheckSum(outputPath);
            //System.out.println(checkSum+"-"+checkSumPrevious);

            if(checkSum.equals(checkSumPrevious)){
                res = true;
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (NoSuchAlgorithmException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return res;
    }

    public static String readCheckSum(String outputPath) {
        StringWriter appender = new StringWriter();
        File file = new File(outputPath + "/checksum");
        if(!file.isFile()) return "null";
        FileInputStream fis = null;
        BufferedInputStream bis = null;
        DataInputStream dis = null;
        try {
            fis = new FileInputStream(file);
            bis = new BufferedInputStream(fis);
            dis = new DataInputStream(bis);
            while (dis.available() != 0) {
                appender.append(dis.readLine());
            }
            fis.close();
            bis.close();
            dis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return appender.toString();
    }

    public static void writeCheckSum(String outputPath, String checkSumContent) throws FileNotFoundException, UnsupportedEncodingException, IOException {
        Writer out = new OutputStreamWriter(new FileOutputStream(outputPath + "/checksum"), "UTF-8");
        try {
            out.write(checkSumContent);
        } finally {
            out.close();
        }
    }

    public static String checkSumFile(String inputFilePath) throws FileNotFoundException, NoSuchAlgorithmException, IOException {
        MessageDigest md = MessageDigest.getInstance("SHA1");
        FileInputStream fis = new FileInputStream(inputFilePath);
        byte[] dataBytes = new byte[1024];
        int nread = 0;
        while ((nread = fis.read(dataBytes)) != -1) {
            md.update(dataBytes, 0, nread);
        }
        byte[] mdbytes = md.digest();
        //convert the byte to hex format
        StringBuffer sb = new StringBuffer("");
        for (int i = 0; i < mdbytes.length; i++) {
            sb.append(Integer.toString((mdbytes[i] & 0xff) + 0x100, 16).substring(1));
        }
        return sb.toString();
    }
}
