package com.pashashyla.myfirstapp.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.pashashyla.myfirstapp")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

}
