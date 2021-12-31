package com.example.TeamManagementSystemMessegingService.repository;

import com.tms.dao.tmsdao.changeRequestDomain.entity.ChangeRequestEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChangeRequestRepository extends JpaRepository<ChangeRequestEntity, Long> {
}
