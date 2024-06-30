package com.learning.JaversPoc;

import lombok.AllArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document(collection = "bookings")
@AllArgsConstructor
public class BookingPayload {
    private String bookingId;
    private String customerName;
    private LocalDate bookingDate;
    private String bookingStatus;

    // getters and setters
}

