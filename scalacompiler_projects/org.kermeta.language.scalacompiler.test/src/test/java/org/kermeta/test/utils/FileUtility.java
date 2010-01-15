package org.kermeta.test.utils;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class FileUtility {
	
	public static void compareFiles(String file1,String file2) throws Exception {
		FileInputStream fileOutput = new FileInputStream(file1);
		InputStreamReader fileOutputReader = new InputStreamReader(fileOutput, "UTF-8");
		BufferedReader fileOutputBufferedReader =  new BufferedReader(fileOutputReader);
		
		FileInputStream fileTrace = new FileInputStream(file2);
		InputStreamReader fileTraceReader = new InputStreamReader(fileTrace, "UTF-8");
		BufferedReader fileTraceBufferedReader =  new BufferedReader(fileTraceReader);
		
		String traceLine = "";
		String ouputLine = "";
		while (( traceLine = fileTraceBufferedReader.readLine()) != null){
			ouputLine = fileOutputBufferedReader.readLine();
			if(traceLine != null){
				if(ouputLine != null){
					if(!traceLine.trim().equals(ouputLine.trim())){
						throw new Exception("Content Not Equals "+traceLine+" | "+ouputLine);
					} else {
						
					}
				} else {
					throw new Exception("Content Not Equals, trace:"+traceLine+" | found:"+ouputLine);
				}
			}
		}
		
		fileTraceBufferedReader.close();
		fileTraceReader.close();
		fileTrace.close();
		
		fileOutputBufferedReader.close();
		fileOutputReader.close();
		fileOutput.close();
	}

}
