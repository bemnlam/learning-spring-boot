package com.examplehotel.roomwebapp.controllers;

import java.util.List;

import com.examplehotel.roomwebapp.models.Staff;
import com.examplehotel.roomwebapp.services.StaffService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/staffs")
public class StaffRestController {
    private StaffService staffService;

    public StaffRestController(StaffService staffService) {
        this.staffService = staffService;
    }

    @GetMapping()
    public List<Staff> getAllStaffs() {
        return staffService.getAllStaffs();
    }
}
