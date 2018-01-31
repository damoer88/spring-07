package lianxi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class IO {

	public static void main(String[] args) throws IOException {
        File file=new File("F:/×Ô¼ºµÄ/copytest/test1/a.txt");
        /*System.out.println(file.exists());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getName());
        System.out.println(file.getParent());
        System.out.println(file.isFile());
        System.out.println(file.length());*/
        /*System.out.println(file.createNewFile());*/
        /*System.out.println(file.mkdir());*/
        /*InputStream is=new FileInputStream(file);
        byte[] b=new byte[(int)file.length()];
        is.read(b);
        System.out.println(new String(b));*/
        /*Reader reader=new FileReader(file);
        char c[]=new char[(int)file.length()];
        reader.read(c);
        String str=new String(c);
        System.out.println(str);*/
        /*OutputStream os=new FileOutputStream(file,true);
        String str="4448111";
        os.write(str.getBytes());*/
        /*Writer writer=new FileWriter(file,true);
        writer.write("abcjs");
        writer.close();*/
        /*InputStream is=new FileInputStream(file);
        InputStreamReader isr=new InputStreamReader(is);*/
	}

}
