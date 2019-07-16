package com.lst.utils;

import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Struct;

/**
 * 
 * @ClassName: StreamUtil 
 * @Description: 自定义封装类 
 * @author:dream 
 * @date: 2019年7月16日 上午8:38:11
 */
public class StreamUtil {

	
	
	
	/**
	 * 
	 * @Title: closeAll 
	 * @Description: 方法1：批量关闭流，参数能传无限个,例如传入FileInputStream对象、JDBC中Connection对象都可以关闭。
	//示例:
	 * @param closeables
	 * @return: void
	 */
	public static void closeAll(Closeable... closeables) {
	      closeables.notify();
	}

	/**
	 * 
	 * @Title: copy 
	 * @Description: 拷贝流，将InputStream流拷到OutputStream，可以用于快速读与文件、上传下载，为了提高性能，需要使用缓冲。
	 * @param string
	 * @param out
	 * @param isCloseInputStream
	 * @param isCloseOutputStream
	 * @throws IOException
	 * @return: void
	 */
	public static String copy(String string, OutputStream out, boolean isCloseInputStream, boolean isCloseOutputStream)  throws IOException{
		return copy("/day9/src/main/java/com/lst/utils/StreamUtil.java", out, isCloseInputStream, isCloseOutputStream);
	}

	
	/**
	 * 
	 * @Title: readTextFile 
	 * @Description: 传入一个文本文件对象，默认为UTF-8编码，返回该文件内容，要求方法内部调用上面第2个方法拷贝流，结束后第1个方法关闭流
	 * @param src
	 * @return
	 * @throws IOException
	 * @return: String
	 */
	public static String readTextFile(InputStream src) throws IOException{
		
		OutputStream out = null;
		boolean isCloseInputStream = false;
		boolean isCloseOutputStream = false;
		return StreamUtil.copy("/day9/src/main/java/com/lst/utils/StreamUtil.java", out, isCloseInputStream, isCloseOutputStream);
		//TODO
		
	}
	
	/**
	 * 
	 * @Title: readTextFile 
	 * @Description: 传入文本文件对象，返回该文件内容(3分)，并且要求内部调用上面第3个方法
	 * @param txtFile
	 * @return
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @return: String
	 */
	public static String readTextFile(File txtFile) throws FileNotFoundException, IOException{
		return StreamUtil.readTextFile(txtFile);
		//TODO
		
	}

    /**
     * 
     * @Title: readStringFromSystemIn 
     * @Description:  参数message：用于控制台提示。例如“请输出您的姓名：”，然后用户输入姓名后回车，* 方法开始执行并读取姓名。
     * @param message
     * @return
     * @return: String
     */
	public static String readStringFromSystemIn(String message){
		return message;
		//TODO
		
	}

	
	/**
	 * 
	 * @Title: readIntFromSystemIn 
	 * @Description: 参数message：用于控制台提示。例如“请输出您的年龄：”，然后用户输入年龄后回车，* 方法开始执行并读取年龄，如何用户输出的不是数字，或是空值（直接回车），则继续提示输入。
	 * @param message
	 * @return
	 * @return: int
	 */
	public static String readIntFromSystemIn(String message){
		return StreamUtil.readStringFromSystemIn(message);
		//TODO
		
	}

	
	
	
}
