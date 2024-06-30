package com.learning.JaversPoc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/bookings")
public class BookingController {

    @Autowired
    private BookingDeltaService bookingDeltaService;

    @PostMapping("/delta")
    public String calculateDelta(@RequestBody BookingPayloads payloads) {
        return bookingDeltaService.calculateDelta(payloads.getOldPayload(), payloads.getNewPayload());
    }
}

