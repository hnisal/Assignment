package assignment;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author Lenovo
 */
public class Assignment {

    public static void main(String[] args) throws IOException {
        
        System.err.println("Start Converting MediaFiles");  
                
        //VideConverter converter = new Mp4ToFlv();
        ReadMp4ToMp3 toMp3 = new ReadMp4ToMp3();
        toMp3.listen();
        
        System.err.println("Finished Converting MediaFiles");
        
        
        
    }
}
