package org.enrollmentsystem.admin.model.api;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class InstructorVO {
    private final String firstName;
    private final String lastName;
}
