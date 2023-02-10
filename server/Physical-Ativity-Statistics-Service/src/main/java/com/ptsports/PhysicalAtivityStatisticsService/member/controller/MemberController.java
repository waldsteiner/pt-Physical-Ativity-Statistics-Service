package com.ptsports.PhysicalAtivityStatisticsService.member.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/members")
public class MemberController {
    @GetMapping
    public String getMember() {
        return "hello sports";
    }

    // 회원 생성 요청

    // 회원 조회 요청

    // 회원 정보 수정 요청

    // 회원 정보 삭제 요청

}