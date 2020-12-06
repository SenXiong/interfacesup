package com.xj.interfacesup.dao;

import com.xj.interfacesup.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
