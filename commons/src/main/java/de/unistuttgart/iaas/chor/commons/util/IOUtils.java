package de.unistuttgart.iaas.chor.commons.util;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Element;

import de.unistuttgart.iaas.chor.messages.ChoreographyBundleType;
import de.unistuttgart.iaas.chor.messages.ProcessBundleType;

public class IOUtils {

	public static byte[] loadChoreographyModelFile2(ChoreographyBundleType choreographyBundle) {

		List<String> fileEndings = new ArrayList<String>();
		fileEndings.add(".chor");

		File folder = ZipUtils.unzipArchive(choreographyBundle.getChoreographyFolderZip(), new ArrayList<String>(), fileEndings);
		String[] fileNames = folder.list();
		String fileName = fileNames[0];

		byte[] choreographyModelFile = null;
		try {
			choreographyModelFile = org.apache.commons.io.IOUtils.toByteArray(new FileInputStream(folder.getAbsolutePath() + "\\" + fileName));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return choreographyModelFile;

	}
	
	public static byte[] loadChoreographyModelFile(ChoreographyBundleType choreographyBundle) {

		List<String> fileEndings = new ArrayList<String>();
		fileEndings.add(".chor");

		byte[] choreographyModelFile = ZipUtils.unzipFile(choreographyBundle.getChoreographyFolderZip(), new ArrayList<String>(), fileEndings);
	
		return choreographyModelFile;

	}

	public static byte[] loadProcessModelFile(ProcessBundleType processBundle) {

		List<String> fileEndings = new ArrayList<String>();
		fileEndings.add(".bpel");

		byte[] processModelFile =  ZipUtils.unzipFile(processBundle.getProcessFolderZip(), new ArrayList<String>(), fileEndings);
	
		return processModelFile;
	}
	

	public static byte[] loadWSDLDefinitionFile(ProcessBundleType processBundle){
		
		List<String> fileEndings = new ArrayList<String>();
		fileEndings.add(".wsdl");

		byte[] wsdlFile =  ZipUtils.unzipFile(processBundle.getProcessFolderZip(), new ArrayList<String>(), fileEndings);
	
		return wsdlFile;
		
	}
	


	public static synchronized File writeFileFromByteArray(byte[] data, String fileName) {

		File folder = new File("temp");
		if (folder.exists()) {

			File[] files = folder.listFiles();
			for (int i = 0; i < files.length; i++) {

				files[i].delete();
			}

		} else {
			folder.mkdir();
		}

		File file = new File(folder, fileName);

		try {

			FileOutputStream fos = new FileOutputStream(file);
			fos.write(data);
			fos.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return file;

	}
	
	public static synchronized File createTempFolder(){
		
		File folder = new File("temp");
		if (folder.exists()) {

			File[] files = folder.listFiles();
			for (int i = 0; i < files.length; i++) {

				files[i].delete();
			}

		} else {
			folder.mkdir();
		}
		
		return folder;
	}
	
	public static synchronized byte[] fileToByteArray(File file){
		
		
		byte[] fileArray = null;
		try {
			fileArray = org.apache.commons.io.IOUtils.toByteArray(new FileInputStream(file));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return fileArray;
	}
	
	public static String determineWSDLFileName(File folder, String processName) {
		String[] fileNames = folder.list(new FilenameFilter() {

			@Override
			public boolean accept(File dir, String name) {

				return name.endsWith(".wsdl");
			}
		});

		for (int i = 0; i < fileNames.length; i++) {

			String fileName = fileNames[i];

			if (fileName.startsWith(processName)) {

				return fileName;
			}
		}

		return null;
	}
	
	public static String[] determineWSDLFiles(File folder) {
		String[] fileNames = folder.list(new FilenameFilter() {

			@Override
			public boolean accept(File dir, String name) {

				return name.endsWith(".wsdl");
			}
		});


		return fileNames;
	}
	
	
	
}
