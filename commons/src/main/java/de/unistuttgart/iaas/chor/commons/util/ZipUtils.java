package de.unistuttgart.iaas.chor.commons.util;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.UUID;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;



public class ZipUtils {

	public static File unzipArchive(byte[] archiveBytes, List<String> fileNames, List<String> fileEndings) {

		File folder = new File("temp");
		if (folder.exists()) {

			File[] files = folder.listFiles();
			for (int i = 0; i < files.length; i++) {

				files[i].delete();
			}

		} else {
			folder.mkdir();
		}

		InputStream input = new ByteArrayInputStream(archiveBytes);
		ZipInputStream zip = new ZipInputStream(input);

		byte[] buffer = new byte[2048];
		int size;

		try {
			ZipEntry entry = zip.getNextEntry();

			while (entry != null) {

				int index = entry.getName().indexOf(".");
				String fileEnding = entry.getName().substring(index);
				
				if (fileNames.contains(entry.getName())|| fileEndings.contains(fileEnding)) {

					File target = new File(folder.getPath() + "/" + entry.getName());
					BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(target), buffer.length);
					while ((size = zip.read(buffer, 0, buffer.length)) != -1) {
						bos.write(buffer, 0, size);
					}

					bos.flush();
					bos.close();

					zip.closeEntry();
				}

				entry = zip.getNextEntry();
			}

			zip.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return folder;
	}
	
	public static byte[] unzipFile(byte[] archiveBytes, List<String> fileNames, List<String> fileEndings) {


		InputStream input = new ByteArrayInputStream(archiveBytes);
		ZipInputStream zip = new ZipInputStream(input);
		
		byte[] buffer = new byte[2048];
		ByteArrayOutputStream out = new ByteArrayOutputStream(buffer.length);
		int size;

		try {
			ZipEntry entry = zip.getNextEntry();

			while (entry != null) {

				int index = entry.getName().indexOf(".");
				String fileEnding = entry.getName().substring(index);
				
				if (fileNames.contains(entry.getName())|| fileEndings.contains(fileEnding)) {

					
					BufferedOutputStream bos = new BufferedOutputStream(out);
					while ((size = zip.read(buffer, 0, buffer.length)) != -1) {
						bos.write(buffer, 0, size);
					}

					bos.flush();
					bos.close();

					zip.closeEntry();
				}

				entry = zip.getNextEntry();
			}

			zip.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return out.toByteArray();
	}
	
	
	public static File unzipArchive2(byte[] archiveBytes) {

		
		String uuid = UUID.randomUUID().toString();
		File folder = new File("temp/"+ uuid);
//		if (folder.exists()) {
//
//			File[] files = folder.listFiles();
//			for (int i = 0; i < files.length; i++) {
//
//				files[i].delete();
//			}
//
//		} else {
//			folder.mkdir();
//		}

		folder.mkdir();
		InputStream input = new ByteArrayInputStream(archiveBytes);
		ZipInputStream zip = new ZipInputStream(input);

		byte[] buffer = new byte[2048];
		int size;

		try {
			ZipEntry entry = zip.getNextEntry();
			

			while (entry != null) {

				if (entry.getName().equals("deploy.xml") || entry.getName().endsWith(".wsdl") || entry.getName().endsWith("bpel") || entry.getName().endsWith("xsd")) {

					File target = new File(folder.getPath() + "/" + entry.getName());
					BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(target.getPath()), buffer.length);
					while ((size = zip.read(buffer, 0, buffer.length)) != -1) {
						bos.write(buffer, 0, size);
					}

					bos.flush();
					bos.close();

					zip.closeEntry();
				}

				entry = zip.getNextEntry();
			}

			zip.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return folder;
	}
	
	public static Map<String, byte[]> unzipArchive(byte[] archiveBytes) {

		
		Map<String, byte[]> unpackedFiles = new HashMap<String, byte[]>();
		
		InputStream input = new ByteArrayInputStream(archiveBytes);
		ZipInputStream zip = new ZipInputStream(input);
		
		
		byte[] buffer = new byte[2048];
		int size;

		try {
			ZipEntry entry = zip.getNextEntry();

			while (entry != null) {

				ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
				if (entry.getName().equals("deploy.xml") || entry.getName().endsWith(".wsdl") || entry.getName().endsWith("bpel") || entry.getName().endsWith("xsd") || entry.getName().endsWith("xsl")) {

					BufferedOutputStream bos = new BufferedOutputStream(outputStream, buffer.length);
					while ((size = zip.read(buffer, 0, buffer.length)) != -1) {
						bos.write(buffer, 0, size);
					}

					bos.flush();
					bos.close();

					zip.closeEntry();
				}
				unpackedFiles.put(entry.getName(), outputStream.toByteArray());
				entry = zip.getNextEntry();
			}

			zip.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return unpackedFiles;
	}
	
	public static byte[] zipArchive(File folder){

		ByteArrayOutputStream dataOut = new ByteArrayOutputStream(4096);

		try {
			// compress outfile stream
			ZipOutputStream out = new ZipOutputStream(dataOut);

			// writing stream
			BufferedInputStream in = null;

			byte[] data = new byte[4096];
			String files[] = folder.list(new FilenameFilter() {

				@Override
				public boolean accept(File dir, String name) {
					boolean accept = true;
					// We don't want some files of eclipse in the zip
					if (name.endsWith(".settings") || name.endsWith(".project")
							|| name.endsWith(".log")) {
						accept = false;
					}
					return accept;
				}
			});

			for (int i = 0; i < files.length; i++) {
				// System.out.println("Adding: " + files[i]);
				in = new BufferedInputStream(new FileInputStream(
						folder.getPath() + "/" + files[i]), 4096);

				out.putNextEntry(new ZipEntry(files[i])); // write data header
				// (name, size, etc)
				int count;
				while ((count = in.read(data, 0, 4096)) != -1) {
					out.write(data, 0, count);
				}
				out.closeEntry(); // close each entry

				in.close();
			}
			out.flush();
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dataOut.toByteArray();
	}
	
	public static byte[] zipArchive(Map<String, byte[]> unpackedFiles){

		ByteArrayOutputStream dataOut = new ByteArrayOutputStream(4096);
		byte[] result = null;

		try {
			// compress outfile stream
			ZipOutputStream out = new ZipOutputStream(dataOut);

			// writing stream
			BufferedInputStream in = null;

			byte[] data = new byte[4096];
			

			for (Entry<String, byte[]> entry: unpackedFiles.entrySet()) {
				
				in = new BufferedInputStream(new ByteArrayInputStream(entry.getValue()), 4096);

				out.putNextEntry(new ZipEntry(entry.getKey())); // write data header
				// (name, size, etc)
				int count;
				while ((count = in.read(data, 0, 4096)) != -1) {
					out.write(data, 0, count);
				}
				out.closeEntry(); // close each entry

				in.close();
			}
			result = dataOut.toByteArray();
			out.flush();
			out.close();
			
			dataOut.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}
}
