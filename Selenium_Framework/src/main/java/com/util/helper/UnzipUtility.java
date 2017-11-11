package com.util.helper;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;



public class UnzipUtility { 

static String file1;
String file2;
//	public static void main(String[] args) throws IOException {
	/*
	System.out.println(dirPath);
File fileobj=new File("RRAF_CONSOL.xls");
	String dirPath=fileobj.getAbsolutePath();
	
	/*Path source =Paths.get(dirPath);
	Path destNew =Paths.get("./2052A_Report_Test_Data/Moodys_Test_data/Testing");
	Files.move(source, destNew.resolve(source.getFileName()));*/
	
	
	//File dir = new File("C:\\Users\\AhmmedS\\workspace\\Rabobank_LRM_TestAutomation_UAT\\2052A_Report_Test_Data\\Moodys_Test_data\\RAF");
	//File fileobj=new File("C:\\Users\\AhmmedS\\workspace\\Rabobank_LRM_TestAutomation_UAT\\2052A_Report_Test_Data\\Moodys_Test_data\\RAF");

	/*
	if (fileobj.isDirectory()) { // make sure it's a directory
	    for (final File f : fileobj.listFiles()) {
	    	

	    		System.out.println(f);		
	    	
	    	try {
	        	
	            File newfile =new File("INFLOW ASSET.xls");

	            
	            if(f.renameTo(newfile)){
	               // System.out.println("Rename succesful");
	            }else{
	              //  System.out.println("Rename failed");
	            }
	        } catch (Exception e1) {
	            // TODO: handle exception
	            e1.printStackTrace();
	        }
	
	    }
	    		
	    	
	}
	*/
		
		
		
		    /**
		     * Size of the buffer to read/write data
		     */
		    private static final int BUFFER_SIZE = 4096;
		    
		    public static void main(String[] args) {
		        String zipFilePath = "./2052A_Report_Test_Data/Moodys_Test_data/RAF/RAF.zip";
		        String destDirectory = "./2052A_Report_Test_Data/Moodys_Test_data/Testing";
		        UnzipUtility unzipper = new UnzipUtility();
		        try {
		            unzipper.unzip(zipFilePath, destDirectory);
		        } catch (Exception ex) {
		            // some errors occurred
		            ex.printStackTrace();
		        }
		    }

		    /**
		     * Extracts a zip file specified by the zipFilePath to a directory specified by
		     * destDirectory (will be created if does not exists)
		     * @param zipFilePath
		     * @param destDirectory
		     * @throws IOException
		     */
		    public void unzip(String zipFilePath, String destDirectory) throws IOException {
		        File destDir = new File(destDirectory);
		        if (!destDir.exists()) {
		            destDir.mkdir();
		        }
		        ZipInputStream zipIn = new ZipInputStream(new FileInputStream(zipFilePath));
		        ZipEntry entry = zipIn.getNextEntry();
		        // iterates over entries in the zip file
		        while (entry != null) {
		            String filePath = destDirectory + File.separator + entry.getName();
		            if (!entry.isDirectory()) {
		                // if the entry is a file, extracts it
		                extractFile(zipIn, filePath);
		            } else {
		                // if the entry is a directory, make the directory
		                File dir = new File(filePath);
		                dir.mkdir();
		            }
		            zipIn.closeEntry();
		            entry = zipIn.getNextEntry();
		        }
		        zipIn.close();
		    }
		    /**
		     * Extracts a zip entry (file entry)
		     * @param zipIn
		     * @param filePath
		     * @throws IOException
		     */
		    private void extractFile(ZipInputStream zipIn, String filePath) throws IOException {
		        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(filePath));
		        byte[] bytesIn = new byte[BUFFER_SIZE];
		        int read = 0;
		        while ((read = zipIn.read(bytesIn)) != -1) {
		            bos.write(bytesIn, 0, read);
		        }
		        bos.close();
		    }
		

	
	
}



