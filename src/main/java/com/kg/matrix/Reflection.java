package com.kg.matrix;

import com.kg.matrix.year2018.Browsing;
import com.kg.matrix.year2018.Dictionary;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.aspectj.EnableSpringConfigured;
import sun.tools.jar.CommandLine;

import java.util.stream.Stream;

@Aspect
@EnableSpringConfigured

public class Reflection extends CommandLine {

    @Before("sysout()")
    public void beforeAdvice(){
        System.out.println("Going to setup student profile.");
    }

    public static void main(String... args)
    {
        //AspectJ
        new Reflection();
        //sysout(new Reflection().getClass().getClasses().toString());
        Stream.of(new Dictionary().getClass().getDeclaredMethods()).forEach(record->sysout(record.getName()));
     sysout();
       // Stream.of(new Diction/ary().getClass()./).forEach(record->sysout(record.getName()));
    }

    private static void sysout() {

    }
    private static void sysout(String name) {
        System.out.println(name);
    }

}
