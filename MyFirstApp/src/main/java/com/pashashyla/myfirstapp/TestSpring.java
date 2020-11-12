package com.pashashyla.myfirstapp;


import com.pashashyla.myfirstapp.config.SpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring {


    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);


        musicPlayer.playMusic();
        System.out.println("Name: " + musicPlayer.getName() + " Volume: " + musicPlayer.getVolume());

        context.close();
    }
}
