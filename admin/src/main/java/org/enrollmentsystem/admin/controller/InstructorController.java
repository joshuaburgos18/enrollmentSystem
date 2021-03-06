package org.enrollmentsystem.admin.controller;

import org.enrollmentsystem.admin.model.api.InstructorVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/instructor")
public class InstructorController {

    @GetMapping
    public InstructorVO getInstructor() {
        return InstructorVO.builder().build();
    }

    @GetMapping("/list")
    public List<InstructorVO> getInstructors() {
        return List.of(InstructorVO.builder().build());
    }
}
