package com.hgz.springboothello.controller;

import com.hgz.springboothello.entity.Resource;
import com.hgz.springboothello.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * @author huangguizhao
 */
@RestController
@RequestMapping("user")
@PropertySource("classpath:resource.properties")
public class UserController {

    @Value("${images.serverpath}")
    private String imageServer;

    @Autowired
    private Resource resource;

    @GetMapping("hello")
    public String hello(){
        System.out.println(resource.getImageServer()+":"+resource.getEmailServer());
        return "hello"+imageServer;
    }

    //可以设置默认值
    @GetMapping("page")
    public String page(@RequestParam(name = "pageIndex",required = false,defaultValue = "1") Integer pageIndex){
        return "pageIndex:"+pageIndex;
    }

    @GetMapping("page/{pageIndex}")
    public String pageRestful(@PathVariable(name = "pageIndex") Integer pageIndex){
        return "pageIndex:"+pageIndex;
    }

    @PostMapping("add")
    public User add(User user){
        //user.setEntryDate(new Date());
        return user;
    }




}
