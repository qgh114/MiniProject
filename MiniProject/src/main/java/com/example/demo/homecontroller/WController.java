package com.example.demo.homecontroller;

import com.example.demo.data.WishItemMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.context.request.WebRequest;

import java.sql.SQLException;

@Controller

public class WController {


    private WishItemMapper wishItemMapper = new WishItemMapper();

    @GetMapping("/")
    public String getHome() {
        return "index";
    }


    @PostMapping("/create-list")
    public String createWishList(WebRequest request, Model model) throws SQLException {
        String title = request.getParameter("title");
        wishItemMapper.createlist(title);



        // Go to to page dependent on role
        return "create-item";
    }

    @PostMapping("/create-item")
    public String createItem(WebRequest request) throws SQLException {
        String itemid = request.getParameter("itemid");
        String itemname = request.getParameter("itemname");
        String description = request.getParameter("description");
        String price = request.getParameter("price");

        wishItemMapper.createWishItem(itemid, itemname,description,price);


        // Go to to page dependent on role
        return "show-list";
    }



    @PostMapping("/show-list")
    public String showList(WebRequest request, Model model) throws SQLException {
        String title = request.getParameter("title");
        System.out.println(title);
        model.addAttribute("WishList", wishItemMapper.showList(title));

        // Go to to page dependent on role
        return "show-list";

    }
}
