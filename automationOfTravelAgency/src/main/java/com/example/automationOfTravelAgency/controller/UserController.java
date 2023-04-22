package com.example.automationOfTravelAgency.controller;

import com.example.automationOfTravelAgency.entity.User;
import com.example.automationOfTravelAgency.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService productService;

    @PostMapping("/save")
    public @ResponseBody boolean addDriver(@RequestBody User driver) {
        driver.setUserType("admin");
        User user=productService.save(driver);
        if(user!=null)
            return true;
        return false;
//        return "Driver Added Successfully";
    }



    @PutMapping("update")
    public @ResponseBody String update(@RequestBody User driver) {
        productService.update(driver);
        return "User update successfully";
    }

    @PostMapping("validate")
    public @ResponseBody boolean validate(@RequestBody User driver) {
        boolean flag=productService.validate(driver.getUsername().toString(),driver.getPassword().toString());
        return flag;
    }
}