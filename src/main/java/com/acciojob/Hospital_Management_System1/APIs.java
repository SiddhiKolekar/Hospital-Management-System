package com.acciojob.Hospital_Management_System1;

import com.acciojob.Hospital_Management_System1.Models.User;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class APIs {

    Map<Integer,User> userDb = new HashMap<>();
    @GetMapping("/IntroToMathsWorld")
    public String introPage(){
        return  "Hi Welcome to the Maths World";
    }

    @GetMapping("/addTwoNo")
    public String addNo(@RequestParam("no1")int no1, @RequestParam("no2")Integer no2){
        int result = no1 + no2;
        return "The sum of numbers is "+result;
    }

    @PostMapping("/addUserViaReqBody")
    public String addUser(@RequestBody User user){
        int key = user.getUserId();

        System.out.println("User Object entered is "+user);

        System.out.println(user.toString());
      //  System.out.println("The attribution entered are "+user.getName()+" "+user.getUserId()+" "+user.getShoeSize());
        userDb.put(key, user);
        return "Adding user to the database";
    }

    @GetMapping("/getInfo")
    public User getUserInfo(@RequestParam("userId")Integer userId) {
        User user = userDb.get(userId);
        return user;
    }

    @GetMapping("getInfo/{userId}")
    public User getUserInfoViaParams(@PathVariable("userId")Integer userId){

        User user = userDb.get(userId);
        return user;
    }
    @PostMapping("/addUser") //should have been postmapping here
    public String addUser(@RequestParam("userId")Integer userId,
                          @RequestParam("name")String name,
                          @RequestParam("age")Integer age){
        User user = new User(userId, name, age);
        userDb.put(userId, user);
        return "User with UserId "+userId+ " has been added to dB";
    }

    @GetMapping("getUser")
    public String getUser(@RequestParam("userId")Integer userId){

        User user = userDb.get(userId);

        return user.getName();
    }


}
