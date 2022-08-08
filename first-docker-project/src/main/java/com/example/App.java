package com.example;

import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      List<String> names=Arrays.asList("dhanush","Surya","Vijay","Aarya");
      names.forEach(System.out::println);
    }
}
