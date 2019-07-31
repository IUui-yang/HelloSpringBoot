package com.qf.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author py
 * @Date 2019/7/30
 */
@RestController
@RequestMapping("log")
@Slf4j
public class LogController {
    @RequestMapping("out")
    public String out(){

        log.debug("debug...");
        log.info("info...");
        log.warn("warn...");
        log.error("error...");


        return "ok";
    }
}
