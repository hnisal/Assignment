/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author Lenovo
 */
public class ReadMp4ToMp3 implements ReadFolderObserver {

    @Override
    public void listen() throws IOException {
        
        try (Stream<Path> paths = Files.walk(Paths.get("c://samples//Mp4ToMp3"))) {
                List<String> mp4ToMp3List = paths.filter(Files::isRegularFile)
                         .map(p -> p.getFileName()
                                    .toString())
                         .collect(Collectors.toList());
                //mp4ToMp3List.forEach(System.out::println);

                } catch (IOException e) {
                     e.printStackTrace();
                }
    }
    
}
