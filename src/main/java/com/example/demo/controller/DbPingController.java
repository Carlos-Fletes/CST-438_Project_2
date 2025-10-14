package com.example.demo.controller;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
@RequestMapping("/api/db")
public class DbPingController {
    private final JdbcTemplate jdbc;
    public DbPingController(JdbcTemplate jdbc) { this.jdbc = jdbc; }

    @GetMapping("/ping")
    public Map<String,Object> ping() {
        Integer one = jdbc.queryForObject("SELECT 1", Integer.class);
        return Map.of("db","ok","one", one);
    }
}
