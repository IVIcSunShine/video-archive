package com.example.demo.video;

import org.springframework.web.bind.annotation.RestController;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class VideoController {
    
    private List<Video> videolist = new ArrayList<Video>(Arrays.asList(
        new Video("Edge of Tomorrow", "16", "In Zeitschleife gefangen bis Aliens vernichtet", "SciFi"),
        new Video("Security", "18", "Marine rettet Mädchen in Kaufhaus", "Action")
    ));

    @RequestMapping("/videos")
    public List<Video> getVideoList(){
        return videolist;
    }
}
