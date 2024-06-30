package com.learning.JaversPoc;

import com.learning.Booking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/bookings")
public class BookingController {

    @Autowired
    private BookingDeltaService bookingDeltaService;

    @Autowired
    private BookingAvroDeltaService bookingAvroDeltaService;

    @PostMapping("/delta")
    public String calculateDelta(@RequestBody BookingPayloads payloads) {
        return bookingDeltaService.calculateDelta(payloads.getOldPayload(), payloads.getNewPayload());
    }

    @GetMapping("/compare")
    public String compareAvroData() {
        // Example Avro objects
        Booking user1 = new Booking("1", "John Doe", "john.doe@example.com");
        Booking user2 = new Booking("1", "John Smith", "john.smith@example.com");

        // Compare using JaVers
        return bookingAvroDeltaService.calculateDelta(user1, user2);
    }
}

