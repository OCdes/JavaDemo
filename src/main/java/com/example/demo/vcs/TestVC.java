package com.example.demo.vcs;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/json")
public class TestVC {

    @RequestMapping("/user")
    public User getUser() {
        return new User("Bruce Lee","123456");
    }

    @RequestMapping("/list")
    public List<User> getUserList() {
        List<User> list = new ArrayList<>();
        User user1 = new User("李维","256");
        User user2 = new User("张三","456");
        list.add(user1);
        list.add(user2);
        return list;
    }

    @RequestMapping("/map")
    public Map<String, Object> getMap() {
        Map<String, Object> map = new HashMap<>(3);
        User user = new User("赵四","789");
        map.put("作者信息",user);
        map.put("地址",null);
        map.put("qq","76515226");
        return map;
    }

    @RequestMapping("/test")
    public void aset(HttpServletResponse response) throws Exception {
//       response.getOutputStream().write("0000".getBytes());
       response.getWriter().write("aaaaa");
    }
}
