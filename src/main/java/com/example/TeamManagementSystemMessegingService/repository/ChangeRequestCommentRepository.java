package com.example.TeamManagementSystemMessegingService.repository;

import com.tms.dao.tmsdao.changeRequestDomain.entity.ChangeRequestCommentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChangeRequestCommentRepository extends JpaRepository<ChangeRequestCommentEntity, Long> {
}
