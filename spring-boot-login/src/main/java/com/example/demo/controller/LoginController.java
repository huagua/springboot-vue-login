package com.example.demo.controller;

import com.example.demo.pojo.User;
import com.example.demo.result.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@Controller
public class LoginController {
    @CrossOrigin
    @RequestMapping(value = "api/login")
    @ResponseBody
    public Result login(@RequestBody User requestUser){
        if(!Objects.equals("admin", requestUser.getUsername()) || !Objects.equals("123456", requestUser.getPassword())){
            System.out.println("username= "+requestUser.getUsername());
            System.out.println("password= "+requestUser.getPassword());

            String message = "账号或密码错误！";
            System.out.println(message+"test");
            return new Result(400);
        }else{
            return new Result(200);
        }
    }
}
