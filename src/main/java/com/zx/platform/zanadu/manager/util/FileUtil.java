package com.zx.platform.zanadu.manager.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;


public class FileUtil {


	/**
	 * 创建文件
	 * @param folderPath 文件夹路径  D:\\file\\
	 * @param fileName 文件名称 Test.java
	 * @param fileTxt 文件内容 
	 * @return 是否创建成功，成功则返回true
	 */
	public static boolean createFile(String folderPath,String fileName,String fileTxt) {
		Boolean bool = false;
		
		File folder = new File(folderPath);
		try {
			// 如果文件不存在，则创建新的文件
			if (!folder.exists()) {
				folder.mkdirs();
			}
			String filePath = folderPath + fileName;// 文件夹路径+(名称+文件类型)
			File file = new File(filePath);
			file.createNewFile();
			writeFileContent(filePath, fileTxt);
			System.out.println("created file："+ filePath);
			bool = true;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return bool;
	}
	
	/**
	 * 创建文件
	 * @param folderPath 文件夹路径  D:\\file\\
	 * @param fileName 文件名称 Test.java
	 * @param fileTxt 文件内容 
	 * @return 是否创建成功，成功则返回true
	 */
	public static boolean createFileOnly(String fullPath) {
		Boolean bool = false;
		String folderPath = fullPath.substring(0, fullPath.lastIndexOf("\\"));
		File folder = new File(folderPath);
		try {
			// 如果文件不存在，则创建新的文件
			if (!folder.exists()) {
				folder.mkdirs();
			}
			File file = new File(fullPath);
			file.createNewFile();
			System.out.println("created file："+ fullPath);
			bool = true;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return bool;
	}
	
	
	/**
     * 向文件中写入内容
     * @param filepath 文件路径与名称   D:\\file\\Test.java
     * @param newstr  写入的内容
     * @return
     * @throws IOException
     */
    public static boolean writeFileContent(String filepath,String newstr) throws IOException{
        Boolean bool = false;
        String filein = newstr+"\r\n";//新写入的行，换行
        
        FileInputStream fis = null;
        InputStreamReader isr = null;
        BufferedReader br = null;
        FileOutputStream fos  = null;
        PrintWriter pw = null;
        try {
            File file = new File(filepath);//文件路径(包括文件名称)
            //将文件读入输入流
            fis = new FileInputStream(file);
            isr = new InputStreamReader(fis);
            br = new BufferedReader(isr);
            StringBuffer buffer = new StringBuffer();
            
            //文件原有内容，需要就打开注释？
//            for(;(temp =br.readLine())!=null;){
//                buffer.append(temp);
//                // 行与行之间的分隔符 相当于“\n”
//                buffer = buffer.append(System.getProperty("line.separator"));
//            }
            buffer.append(filein);
            
            fos = new FileOutputStream(file);
            pw = new PrintWriter(fos);
            pw.write(buffer.toString().toCharArray());
            pw.flush();
            bool = true;
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            //不要忘记关闭
            if (pw != null) {
                pw.close();
            }
            if (fos != null) {
                fos.close();
            }
            if (br != null) {
                br.close();
            }
            if (isr != null) {
                isr.close();
            }
            if (fis != null) {
                fis.close();
            }
        }
        return bool;
    }
    
    
    /***
	 * 读取文件内容为字符串
	 * @param 包文件路径 
	 * 	filePath "com/zx/code/autotabin/createfile/templatefile/constantsql.properties"
	 * @return  
	 */
	public static String readFile(String filePath) {
		InputStream in = FileUtil.class.getClassLoader()
				.getResourceAsStream(filePath);
		
		StringBuffer out = new StringBuffer();
		byte[] b = new byte[4096];
		try {
			for (int n; (n = in.read(b)) != -1;) {
				out.append(new String(b, 0, n));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return out.toString();
	}
}
