package com.example.demo.data;


import com.example.demo.domain.WishItem;
import com.example.demo.domain.WishList;

import java.sql.*;
import java.util.ArrayList;

public class WishItemMapper {

    public void createWishItem(String itemid, String itemname, String description, String price) throws SQLException {

        Connection con = DBManager.getConnection();
        String SQL = "INSERT INTO wish_item (item_id, item_name, description, price) VALUES ((SELECT wishlist_id FROM wish_list WHERE title = ?), ?, ?,?)";
        PreparedStatement ps = con.prepareStatement(SQL);
        ps.setString(1, itemid);
        ps.setString(2, itemname);
        ps.setString(3, description);
        ps.setString(4, price);
        ps.executeUpdate();


    }


    public Object createlist(String title) throws SQLException {
        Connection con = DBManager.getConnection();
        String SQL = "INSERT INTO wish_list (title) VALUES (?)";
        PreparedStatement ps = con.prepareStatement(SQL);
        ps.setString(1, title);
        ps.executeUpdate();

        return null;
    }


    public ArrayList<WishItem> showList(String title) throws SQLException {
        Connection con = DBManager.getConnection();
        String query = "SELECT wish_item.item_name,wish_item.description,wish_item.price FROM wish_item INNER JOIN wish_list ON wish_list.wishlist_id = wish_item.item_id WHERE wish_list.title = ?;";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, title);
        ResultSet rs = ps.executeQuery();

        ArrayList<WishItem> wishall = new ArrayList<>();
        while(rs.next()){
            WishItem wishItem = new WishItem(rs.getString(1), rs.getString(2), rs.getString(3));
            wishall.add(wishItem);

        }
        return wishall;

    }

}

