package com.codeliner.restapi.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

import com.codeliner.restapi.models.Member;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/members")
@RestController
public class MemberController {
    
    @GetMapping("/test")
    public Member memberTest() {
        return new Member(0L, "asd", 30, "asdf", new Date());
    }

    @GetMapping("/test/list")
    public ArrayList<Member> getMembers() {
        return new ArrayList(
            Arrays.asList(
                new Member(1, "1", 21, "1", new Date()),
                new Member(2, "2", 22, "2", new Date()),
                new Member(3, "3", 23, "3", new Date()),
                new Member(4, "4", 24, "4", new Date())
            )
        );
    }
}
