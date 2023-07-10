package com.kamiri.biztrack_backend.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import com.kamiri.biztrack_backend.repository.BusinessRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.kamiri.biztrack_backend.models.Business;
import java.util.UUID;

@RestController
@RequestMapping("/api/businesses")
public class BusinessController {

    private BusinessRepository businessRepository;

    public BusinessController(BusinessRepository businessRepository) {
        this.businessRepository = businessRepository;
    }

    // Get business by UUID
    @GetMapping("/{uuid}")
    public Business getBusinessByUuid(@PathVariable("uuid") UUID uuid) {
        return businessRepository.findByUuid(uuid);
    }

    // Get business(es) by owner UUID
    @GetMapping("/owner/{owner_uuid}")
    public Business[] getBusinessesByOwnerUuid(@PathVariable("owner_uuid") UUID owner_uuid) {
        return businessRepository.findByOwnerUuid(owner_uuid);
    }
}