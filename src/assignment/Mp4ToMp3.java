package assignment;

import it.sauronsoftware.jave.Encoder;
import it.sauronsoftware.jave.EncodingAttributes;
import it.sauronsoftware.jave.AudioAttributes;
import java.io.File;

public class Mp4ToMp3 implements MediaConverter {

    @Override
    public void Convert(File file) {
        // Print start file converting
        System.err.println("Start Converting");
        
        // Create the destination file in target folder
        File ConvertedFile = new File("C:\\samples\\VideoConverted.mp3");
        
        //Set Attributes for video converstion
        AudioAttributes audio=new AudioAttributes();
        EncodingAttributes attr=new EncodingAttributes();
        attr.setFormat("mp3");
        attr.setAudioAttributes(audio);
        
        String name = file.getName();
        System.out.println("File name: "+name);
        
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
