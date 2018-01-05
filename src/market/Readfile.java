package market;
import java.io.File;  
import java.io.InputStreamReader;  
import java.io.BufferedReader;  
import java.io.BufferedWriter;  
import java.io.FileInputStream;  
import java.io.FileReader; 
import java.util.*;
public class Readfile {
	
	public static String txt2String(File file){
        StringBuilder result = new StringBuilder();
        try{
            BufferedReader br = new BufferedReader(new FileReader(file));//����һ��BufferedReader������ȡ�ļ�
            String s = null;
            while((s = br.readLine())!=null){//ʹ��readLine������һ�ζ�һ��
                result.append(System.lineSeparator()+s);
            }
            br.close();    
        }catch(Exception e){
            e.printStackTrace();
        }
        return result.toString();
    }
    
    public static void main(String[] args){
        File file = new File("D:/����.txt");
        List<String> itDate=new ArrayList<String>();
//        String[] arrayStr=txt2String(file).split("\\s+");
//        for (int i=1;i<arrayStr.length;i=i+2){
//        		itDate.add(arrayStr[i]);
//        	}
//        for(String m:itDate){
//        	System.out.println(m);
//        }
        	System.out.println(txt2String(file));
        }
    }

