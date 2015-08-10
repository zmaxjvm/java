package com.zmax;

import com.zmax.dao.GroupDao;
import com.zmax.entity.shop.Group;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by zmax.
 */
@Controller
public class ProductController {

    @Autowired
    public GroupDao groupDaoImpl;

    @RequestMapping(value = "/product", method = RequestMethod.GET, params = "id")
    public ModelAndView byParameter(@RequestParam("id") Long id) {
        ModelAndView result = new ModelAndView("product");
        Group group = groupDaoImpl.getGroupById(id);
        result.addObject("groupName", group.getName());
        result.addObject("list", group.getProductList());

        return result;
    }
}