package org.enrollmentsystem.admin.model.entity;

import lombok.Builder;

@Builder
public class Instructor{

    private final Long id;
    private final String firstName;
    private final String lastName;
}
