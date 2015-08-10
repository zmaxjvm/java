package com.zmax;

import com.zmax.dao.GroupDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by zmax.
 */
@Controller
@RequestMapping("/main")
public class MainController {

    @Autowired
    public GroupDao groupDaoImpl;

    @RequestMapping(method = RequestMethod.GET)
    public String printWelcome(ModelMap model) {

        model.addAttribute("message", "Main page");
        model.addAttribute("list", groupDaoImpl.getAllGroupsIntoDatabase());

        return "main";
    }

}