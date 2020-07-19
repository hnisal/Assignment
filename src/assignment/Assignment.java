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
        
        ReadPropertiesFile properties = new ReadPropertiesFile();
	properties.getPropValues();
        
        
        
        
        
        
        
        
        
        //Define the File
        File file=new File("C:\\samples\\SampleVideo.mp4");

        //Get file extensiont
        String extension = fileExtension(file);
        
        MediaConverterFactory factory = new MediaConverterFactory();
        MediaConverter Converter = factory.getInstance(extension);
        Converter.Convert(file);
                
        //VideConverter converter = new Mp4ToFlv();
        
        
        System.err.println("Finished Converting MediaFiles");
        
        
        
    }
    
    private static String fileExtension(File file) {
            String name = file.getName();
            if(name.lastIndexOf(".") != -1 && name.lastIndexOf(".") != 0)
                return name.substring(name.lastIndexOf(".") + 1);
             else
                return "";
        }
}
