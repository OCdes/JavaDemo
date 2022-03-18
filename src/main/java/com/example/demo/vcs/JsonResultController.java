package com.example.demo.vcs;

import com.example.demo.configs.JsonResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/jsonresult")
public class JsonResultController {

    Logger logger = LoggerFactory.getLogger(JsonResultController.class);

    @RequestMapping(value ="/user/{id}",method = RequestMethod.GET)
    public JsonResult<User> getUser(@PathVariable String id) {
        User user = new User("李维","789");
        logger.info(id);
        return new JsonResult<>(user);
    }

    @RequestMapping("/parauser")
    public JsonResult<User> paramUser(@RequestParam String id) {
        User user = new User("李维",id);
        return new JsonResult<>(user);
    }

    @PostMapping("/parasuser")
    public JsonResult<User> paramUser(@RequestParam(required = false) String id, @RequestParam String name) {
        User user = new User(name,id);
        return new JsonResult<>(user);
    }

    @RequestMapping("/list/{id}/{name}")
    public  JsonResult<List> getUserList(@PathVariable String id, @PathVariable
String name) {
        List<User> list = new ArrayList<User>();
        User user = new User(name,id);
        User user2 = new User("张三","456");
        list.add(user2);
        list.add(user);
        return new JsonResult<>(list);
    }

    @RequestMapping("/map")
    public JsonResult<Map> getMap() {
        Map<String,Object> map = new HashMap();
        User user = new User("李维","789");
        map.put("user",user);
        map.put("address","Hangzhou");
        return new JsonResult<>(map);
    }
}
