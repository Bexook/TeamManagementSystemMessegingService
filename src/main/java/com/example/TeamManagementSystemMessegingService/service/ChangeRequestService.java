package com.example.TeamManagementSystemMessegingService.service;


import com.tms.dao.tmsdao.changeRequestDomain.dto.ChangeRequestDTO;

import java.util.List;

public interface ChangeRequestService {


    List<ChangeRequestDTO> findAll();

    ChangeRequestDTO findByCreated(String email);

    ChangeRequestDTO findByApprovedBy(String email);

}
