package com.pathshala360.service.Impl;

import com.pathshala360.service.HelloWorldService;
import org.springframework.stereotype.Service;
import java.util.Scanner;
@Service
public class HelloworldServiceImpl implements HelloWorldService {


    @Override
    public String hello() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = scanner.nextLine();
        return("Hello " + name + "!");

    }
}
