package assignment;

public class MediaConverterFactory {
    
    public MediaConverter getInstance (String extension){
        if ("mp4".equals(extension))
            return new Mp4ToFlv();
        return null;
    } 
    
}
