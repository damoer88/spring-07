package lianxi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyTest {
     public static void main(String[] args) throws IOException{
    	 File file=new File("F:/自己的/copytest/1.txt");   	 
    	 File copyfile=new File("F:/自己的/copytest/test1/"+file.getName());
    	 InputStream is=new FileInputStream(file);    	 
    	 OutputStream os=new FileOutputStream(copyfile);
    	 byte[] b=new byte[(int) file.length()];
         is.read(b);
         is.close();
         os.write(b);
         os.close();
         System.out.println("输入完成");
     }
}
