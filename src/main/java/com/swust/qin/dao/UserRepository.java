package com.swust.qin.dao;

import com.swust.qin.po.User;
import com.swust.qin.po.UserId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,UserId>{
}
