package com.ssafy.sera.Repository;

import com.ssafy.sera.Domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface UserRepository extends JpaRepository<User, Long> {
    User findByUserLoginId(String userLoginId);
    User findByUserNickname(String userNickname);
    User findByUserLoginIdAndUserPassword(String userLoginId, String userPassword);
}
