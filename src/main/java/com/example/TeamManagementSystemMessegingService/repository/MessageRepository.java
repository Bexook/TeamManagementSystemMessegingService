package com.example.TeamManagementSystemMessegingService.repository;

import com.example.TeamManagementSystemMessegingService.domain.entity.MessageEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepository extends JpaRepository<MessageEntity, Long> {



}
