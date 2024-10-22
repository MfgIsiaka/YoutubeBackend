package com.baseten.youtube.controller;


import com.baseten.youtube.model.Video;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping(path = "/api")
public class VideoController {
    LocalDateTime now=LocalDateTime.now();

    @GetMapping(path = "/videos")
    String getvideos(){
        return "Videos";
    }

    @GetMapping(path = "/comments")
    List<Video> getComments(){
        return List.of(new Video(123432343323143L,"","","",now,now),new Video(123432343323143L,"","","",now,now));
    }

}
