package nvc.it.myspring2.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController


// Annotation
@Controller
@RestController
class MainController {

    @GetMapping("/")
    fun index(): String{
        return "Hello, Spring Boot";
    }

    @PostMapping("/")
    fun create(): String {
        return "Hello POST";
    }



}