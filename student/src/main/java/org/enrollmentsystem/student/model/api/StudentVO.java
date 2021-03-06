package org.enrollmentsystem.student.model.api;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class StudentVO {
    private final String firstName;
    private final String lastName;
}
