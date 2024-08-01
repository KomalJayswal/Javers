package com.learning.JaversPoc;

import com.learning.Booking;
import org.javers.core.Javers;
import org.javers.core.JaversBuilder;
import org.javers.core.diff.Diff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingAvroDeltaService {

//    @Autowired
//    private Javers javers;

    public String calculateDelta(Booking oldPayload, Booking newPayload) {
        Javers javers = JaversBuilder.javers().build();

        UserWrapper user1 = new UserWrapper("1", "John Doe", "john.doe@example.com");
        UserWrapper user2 = new UserWrapper("1", "John Smith", "john.smith@example.com");

        Diff diff = javers.compare(oldPayload, newPayload);
        return diff.prettyPrint();
    }
}

