package com.util.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class UnzipFile {

	 public static void main(String[] args) {
	        String zipFilePath = ".\\2052A_Report_Test_Data\\Moodys_Test_data\\2052a Test Data\\2052aTestData.zip";
	         
	        String destDir = "./2052A_Report_Test_Data/Moodys_Test_data/2052a Test Data";
	         
	        unzip(zipFilePath, destDir);
	    }
	 
	    private static void unzip(String zipFilePath, String destDir) {
	        File dir = new File(destDir);
	        ArrayList<String> files=new ArrayList<String>();
	        // create output directory if it doesn't exist
	        if(!dir.exists()) dir.mkdirs();
	        FileInputStream fis;
	        //buffer for read and write data to file
	        byte[] buffer = new byte[1024];
	        try {
	            fis = new FileInputStream(zipFilePath);
	            ZipInputStream zis = new ZipInputStream(fis);
	            ZipEntry ze = zis.getNextEntry();
	            while(ze != null){
	                String fileName = ze.getName();
	                Pattern pattern = Pattern.compile("[^a-z-A-Z.']");
	        	    Matcher matcher = pattern.matcher(fileName);
	        	    String name = matcher.replaceAll("");
	        	      System.out.println(fileName);

	        System.out.println(name);
	       
	                File newFile = new File(destDir + File.separator + name);
	               // System.out.println("Unzipping to "+newFile.getAbsolutePath());
	                //create directories for sub directories in zip
	                new File(newFile.getParent()).mkdirs();
	                FileOutputStream fos = new FileOutputStream(newFile);
	                int len;
	                while ((len = zis.read(buffer)) > 0) {
	                fos.write(buffer, 0, len);
	                }
	                fos.close();
	                //close this ZipEntry
	                zis.closeEntry();
	                ze = zis.getNextEntry();
	            }
	            //close last ZipEntry
	            zis.closeEntry();
	            zis.close();
	            fis.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	         
	    }
	 
	}

