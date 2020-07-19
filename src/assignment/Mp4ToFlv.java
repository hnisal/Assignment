package assignment;

import it.sauronsoftware.jave.Encoder;
import it.sauronsoftware.jave.EncodingAttributes;
import it.sauronsoftware.jave.VideoAttributes;
import java.io.File;

public class Mp4ToFlv implements MediaConverter {

    @Override
    public void Convert(File file) {
        
        // Print start file converting
        System.err.println("Start Converting");
        
        // Create the destination file in target folder
        File ConvertedFile = new File("C:\\samples\\VideoConverted.flv");
        
        //Set Attributes for video converstion
        VideoAttributes video=new VideoAttributes();
        EncodingAttributes attr=new EncodingAttributes();
        attr.setFormat("flv");
        attr.setVideoAttributes(video);
        
        // Do the converting 
        Encoder encode=new Encoder();
        try{
        encode.encode(file, ConvertedFile, attr);
            System.err.println("File Converting Finished");
        }catch(Exception e){
            System.err.println(e.toString());
        }    
    }
}
