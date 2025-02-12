package com.example.demo.controller;

import com.example.demo.entity.DbFunctions;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Connection;

@RestController
public class MainController {
    /*
    @GetMapping("/api/main")
    public static void cont(String[] args) {
        DbFunctions db = new DbFunctions();
        Connection conn = db.connect_to_db("oop_project", "alibek", "20alibek07");
        db.read_data(conn, "customers");
    }

     */
}
