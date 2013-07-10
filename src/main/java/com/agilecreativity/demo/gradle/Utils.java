package com.agilecreativity.demo.gradle;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Utils {

	public String escapeXML(String s) {

		StringBuffer str = new StringBuffer();

		int len = (s != null) ? s.length() : 0;

		for (int i = 0; i < len; i++) {
			char ch = s.charAt(i);

			switch (ch) {
			case '<':
				str.append("&lt;");
				break;

			case '>':
				str.append("&gt;");
				break;

			case '&':
				str.append("&amp;");
				break;

			case '"':
				str.append("&quot;");
				break;

			case '\'':
				str.append("&apos;");
				break;

			default:
				str.append(ch);
			}
		}

		return str.toString();
	}

	/**
	 * Read the content of the whole file to string
	 * 
	 * @param filePath
	 * @return
	 * @throws IOException
	 */
	public static String readFromFile(String filePath) throws IOException {

		File file = new File(filePath);
		FileInputStream fis = new FileInputStream(file);
		byte[] data = new byte[(int) file.length()];
		fis.read(data);
		fis.close();

		String content = new String(data, "UTF-8");

		return content;
	}

	/**
	 * 
	 * @return the temporary file from the system (name only)
	 */
	public String getTempFileName() {
		File temp = null;
		try {
			temp = File.createTempFile("temp-file-name", ".xml");
			return temp.getName();
		} catch (IOException e) {
			// Note: just return null for now!
			return null;
		} finally {
			if (temp != null) {
				temp.delete();
			}
		}
	}

	/**
	 * Split input line to list of string array
	 * 
	 * @param line
	 * @return list of string array
	 */
	public String[] splitLine(String line) {
		
		if (line == null) {
			throw new IllegalArgumentException("line must not be null");
		}
		
		// remove the extra spaces if any
		line = line.trim();
		
		String[] fields = line.split("[ ]+", 3);
		
		if (fields == null || fields.length < 2 || fields.length > 3) {
			throw new IllegalArgumentException("Invalid fields array.");
		}
		
		return fields;
	}
	
	public String say(String message) {
		if (message == null) {
			throw new IllegalArgumentException("message must not be null");
		}
		return "Hello " + message;
	}
	
	public static void main(String[] args) {
		Utils utils = new Utils();
		if (args.length != 1) {
			System.out.println("Usage java Utils <line-to-be-split>");
			System.exit(1);
		}
		
		utils.splitLine("aa bb cc dd ee");
	}

}
