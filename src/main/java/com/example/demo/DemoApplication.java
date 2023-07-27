package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}

@RestController
class HelloWorld {
    @GetMapping("/hi")
    public String sayHi() {
        return "Hello World";
    }
}

@Controller
public class ExampleController
{
    @GetMapping(value = "/find")
    public void find(@RequestParam("filename") String filename) throws IOException {

        Runtime.getRuntime().exec("/usr/bin/find . -iname " + filename);
    }
}
