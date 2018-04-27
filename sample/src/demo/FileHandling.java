package demo;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.file.attribute.FileOwnerAttributeView;

public class FileHandling
{
public static void main(String[] args) {
	File f1=new File("D:\\hcr1.txt");
	int count=0;
	try
	{
		FileWriter fw=new FileWriter(f1,true);
		fw.write("Wipro is a good company.");
		fw.flush();
		fw.close();
		FileReader fr=new FileReader(f1);
		char[] ch=new char[(int)f1.length()];
		fr.read(ch);
		for(int i=0;i<ch.length;i++)
		{
			System.out.print(ch[i]);
			
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
			{
				count++;
			}
		}
		System.out.println();
		System.out.println(count);
		fr.close();
	}
	catch (Exception e) 
	{
		e.printStackTrace();
	}
	
}
}
