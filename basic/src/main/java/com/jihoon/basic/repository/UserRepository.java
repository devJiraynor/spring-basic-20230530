package com.jihoon.basic.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jihoon.basic.entity.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, String> {
  List<UserEntity> findByNickname(String nickname);
}
