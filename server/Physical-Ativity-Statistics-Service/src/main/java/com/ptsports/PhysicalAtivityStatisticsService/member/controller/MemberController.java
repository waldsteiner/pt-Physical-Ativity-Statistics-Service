package com.ptsports.PhysicalAtivityStatisticsService.member.controller;

import com.ptsports.PhysicalAtivityStatisticsService.member.dto.MemberDto;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/members")
public class MemberController {
    // 회원 생성 요청
    @PostMapping
    public ResponseEntity postMember() {
        return new ResponseEntity<>();
    }

    // 회원 조회 요청
    @GetMapping
    public ResponseEntity getMember() {
        return new ResponseEntity<>();
    }

    // 회원 정보 전체 조회 요청
    @GetMapping
    public ResponseEntity getMembers() {
        return new ResponseEntity<>();
    }

    // 회원 정보 수정 요청
    @PatchMapping
    public ResponseEntity patchMember() {
        return new ResponseEntity<>();
    }

    // 회원 정보 전체 수정 요청
    @PutMapping
    public ResponseEntity putMember() {
        return new ResponseEntity<>();
    }


    // 회원 정보 삭제 요청
    @DeleteMapping
    public ResponseEntity deleteMember() {
        return new ResponseEntity<>();
    }



}