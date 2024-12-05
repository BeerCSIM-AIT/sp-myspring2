package nvc.it.myspring2.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@Controller
@RestController
@RequestMapping("/employees")
class EmployeeController {
    @GetMapping("")
    fun getEmployees(): String {
        return "All Employees";
    }

    @PostMapping("")
    fun createEmployee(): String {
        return "New Employee";
    }
}