package com.example.TeamManagementSystemMessegingService.service.impl;

import com.example.TeamManagementSystemMessegingService.service.ChangeRequestService;
import com.tms.dao.tmsdao.changeRequestDomain.dto.ChangeRequestDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChangeRequestServiceImpl implements ChangeRequestService {
    @Override
    public List<ChangeRequestDTO> findAll() {
        return null;
    }

    @Override
    public ChangeRequestDTO findByCreated(String email) {
        return null;
    }

    @Override
    public ChangeRequestDTO findByApprovedBy(String email) {
        return null;
    }
}
