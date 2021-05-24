package LAB3;
import java.io.*;

public class displayCharectar {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("D:\\CapgeminiAJ172\\Lab Assignment JA-17\\src\\LAB3\\file1.txt"); 
        FileInputStream fileStream = new FileInputStream(file); 
        InputStreamReader input = new InputStreamReader(fileStream); 
        BufferedReader reader = new BufferedReader(input); 
          
        String line; 
          
         
        int countWords = 0; 
        int lineCount = 0; 
        int charCount = 0; 
          
         
        while((line = reader.readLine()) != null) 
        { 
            if(!(line.equals(""))) 
            { 
                  
                charCount += line.length(); 
                  
                
                String[] wordList = line.split("\s+"); 
                  
                countWords += wordList.length;  
                  
                
                String[] lineList = line.split("[,;!?.:]+"); 
                  
                lineCount += lineList.length; 
            } 
        } 
        
        System.out.println("Total number of characters = " + charCount); 
        System.out.println("Total number of lines = " + (lineCount-1)); 
        System.out.println("Total word count = " + countWords); 
        
        reader.close();
        
	}

}
