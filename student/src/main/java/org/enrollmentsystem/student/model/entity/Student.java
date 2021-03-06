package org.enrollmentsystem.student.model.entity;

import lombok.Builder;

@Builder
public class Student {

    private final Long id;
    private final String firstName;
    private final String lastName;
}
