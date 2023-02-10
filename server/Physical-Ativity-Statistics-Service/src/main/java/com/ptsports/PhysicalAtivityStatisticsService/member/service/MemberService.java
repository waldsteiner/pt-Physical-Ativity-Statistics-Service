package com.ptsports.PhysicalAtivityStatisticsService.member.service;

import org.springframework.stereotype.Service;

@Service
public interface MemberService {
    // 회원 생성
    Member createMember(Member member);

    // 회원 정보 조회
    Member findMember(Long memberId);

    // 회원 정보 수정
    Member updateMember(Member member);

    // 회원 정보 삭제
    void deleteMember(Long memberId);

    // 이메일 검증

    //
}
