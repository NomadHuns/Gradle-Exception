package com.cos.photogramstart.domain.user;

import org.springframework.data.jpa.repository.JpaRepository;

// 어노테이션이 없어도 JpaRepository를 상속하면 IoC 등록이 자동으로 된다
public interface UserRepository extends JpaRepository<User, Integer> { // 객체와 primary key의 타입을 적어줌
    // JPA Query method
    User findByUsername(String username);
}
