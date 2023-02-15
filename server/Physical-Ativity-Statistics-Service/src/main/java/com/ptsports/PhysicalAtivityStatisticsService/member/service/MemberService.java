package com.ptsports.PhysicalAtivityStatisticsService.member.service;

import com.ptsports.PhysicalAtivityStatisticsService.member.entity.Member;
import org.springframework.stereotype.Service;

@Service
public interface MemberService {
    // 회원 생성
    Member createMember(Member member);

    // 회원 정보 조회
    Member findMember(Long id);

    // 회원 정보 수정
    Member updateMember(Member member);

    // 회원 정보 삭제
    void deleteMember(Long id);

    // 가입한 회원인지 확인
    Member findVerifiedMember(Long id);

    // 이메일 검증
    void verifyExistsEmail(String email);
}
