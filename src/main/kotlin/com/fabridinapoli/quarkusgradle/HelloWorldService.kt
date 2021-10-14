package com.fabridinapoli.quarkusgradle

import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
class HelloWorldService {
    fun greeting(name: String) = "hello $name"
}
