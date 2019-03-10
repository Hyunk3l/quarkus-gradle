package com.fabridinapoli.quarkusgradle;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class HelloWorldService {

  public String greeting(String name) {
    return "hello " + name;
  }

}
