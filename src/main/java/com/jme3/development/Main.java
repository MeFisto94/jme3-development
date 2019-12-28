package com.jme3.development;

import com.jme3.app.SimpleApplication;

import java.net.URL;
import java.net.URLClassLoader;

public class Main extends SimpleApplication {
    public static void main(String[] args) {
        new Main().start();
    }

    @Override
    public void simpleInitApp() {
        System.out.println("Hello From jme3-development");
        stop();
    }
}
