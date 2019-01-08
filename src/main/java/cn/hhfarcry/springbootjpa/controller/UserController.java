package cn.hhfarcry.springbootjpa.controller;

import cn.hhfarcry.springbootjpa.entity.UserEntity;
import cn.hhfarcry.springbootjpa.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @program: springbootjpa
 * @description: ${description}
 * @author: huanghong
 * @date: 2019-01-08 10:29
 */
@Controller
@ResponseBody
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping(value = "/save" ,method = {RequestMethod.GET,RequestMethod.POST})
    public UserEntity save(HttpServletRequest request, HttpServletResponse response){
        String name = request.getParameter("name");
        UserEntity param = new UserEntity(name);
        return userService.add(param);
    }

    @RequestMapping(value = "/getlist" ,method = {RequestMethod.GET,RequestMethod.POST})
    public List<UserEntity> getList(){
        return userService.getList();
    }

}
