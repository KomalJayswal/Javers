package com.learning.JaversPoc;

import lombok.AllArgsConstructor;
import org.javers.core.metamodel.annotation.DiffIgnore;
import org.javers.core.metamodel.annotation.TypeName;

@TypeName("User")
@AllArgsConstructor
public class UserWrapper {

    private String id;
    private String name;

    @DiffIgnore
    private String email; // This field will be ignored in comparisons
}
