package com.learning.JaversPoc;

import org.javers.core.Javers;
import org.javers.core.JaversBuilder;
import org.javers.core.diff.Diff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingDeltaService {

//    @Autowired
//    private Javers javers;

    public String calculateDelta(BookingPayload oldPayload, BookingPayload newPayload) {
        Javers javers = JaversBuilder.javers().build();
        Diff diff = javers.compare(oldPayload, newPayload);
        return diff.prettyPrint();
    }
}

