package org.enrollmentsystem.student.controller;

import org.enrollmentsystem.student.model.api.StudentVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @GetMapping()
    public StudentVO getStudent() {

        return StudentVO.builder()
                .lastName("LastName")
                .firstName("FirstName")
                .build();
    }

    @GetMapping("/list")
    public List<StudentVO> getStudents() {
        return List.of(StudentVO.builder()
                .lastName("LastName")
                .firstName("FirstName")
                .build());
    }
}
