package com.kunal_debug_png.FullStack.repository;

import com.kunal_debug_png.FullStack.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
