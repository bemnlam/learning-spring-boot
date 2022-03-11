package com.examplehotel.roomwebapp.services;

import java.util.ArrayList;
import java.util.List;

import com.examplehotel.roomwebapp.models.Staff;

import org.springframework.stereotype.Service;

@Service
public class StaffService {
    
    public StaffService() {

    }

    public List<Staff> getAllStaffs() {
        List<Staff> staffs = new ArrayList<>();

        staffs.add(new Staff("9f717667-505a-4074-ba43-ceae2c0e9f4b", "Adams", "Roy", "HOUSEKEEPING"));
        staffs.add(new Staff("3cb69467-dcaa-4d53-84d9-c0d7ba439645", "Adams", "Martin", "SECURITY"));
        staffs.add(new Staff("a36df0b3-da59-47e3-b110-37a5a222d46b", "Alvarez", "Roger", "FRONT_DESK"));
        staffs.add(new Staff("0e235279-ba2d-40f8-8cfa-c346be49eb47", "Alvarez", "Anne", "HOUSEKEEPING"));
        staffs.add(new Staff("461f5182-9ab1-4e27-a1fb-0c2669bfbb55", "Alvarez", "Ann", "CONCIERGE"));
        staffs.add(new Staff("eeefd5a8-d4b8-49b0-af0d-a7e9eb170db6", "Anderson", "Betty", "HOUSEKEEPING"));
        staffs.add(new Staff("5ee0a977-6856-455e-becb-0a4de6d08958", "Anderson", "Laura", "HOUSEKEEPING"));
        staffs.add(new Staff("784234d6-5b90-4471-a51e-eb00940a5608", "Armstrong", "Christopher", "HOUSEKEEPING"));
        staffs.add(new Staff("241c9d7b-f6e9-46e7-807a-e82f33d7ab35", "Bell", "David", "HOUSEKEEPING"));
        staffs.add(new Staff("f01ec3b4-7e44-49d1-8601-929d88524286", "Berry", "Paula", "SECURITY"));
        staffs.add(new Staff("cb2f2846-d432-4f81-b6cb-06c03c9aaf03", "Bishop", "Dennis", "HOUSEKEEPING"));
        staffs.add(new Staff("fff66b51-fd6b-40ac-9422-79079595a05f", "Bishop", "Carolyn", "CONCIERGE"));
        staffs.add(new Staff("bb5f87cd-58e5-4f7b-9f82-e9984cbc4e85", "Black", "Harold", "FRONT_DESK"));
        staffs.add(new Staff("c063038f-5854-4b45-8e76-322ddc7794aa", "Bowman", "Jerry", "HOUSEKEEPING"));
        staffs.add(new Staff("d5371ef2-6fe5-45bf-a1f3-07d79d408d03", "Bradley", "Keith", "FRONT_DESK"));
        staffs.add(new Staff("2d43db23-1994-40a3-9b82-17cd57bfa8d6", "Brooks", "Samuel", "HOUSEKEEPING"));
        staffs.add(new Staff("c0dd0ccc-5f69-477a-87ea-19b7d7ecbe6c", "Bryant", "Donald", "FRONT_DESK"));
        staffs.add(new Staff("de8e222e-dcb1-42e3-bcaf-b0aff93527c3", "Burke", "Tammy", "SECURITY"));
    
        return staffs;
    }
}
