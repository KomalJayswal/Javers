package com.learning.JaversPoc;

import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document(collection = "bookings")
public class BookingPayload {
    private String bookingId;
    private String customerName;
    private LocalDate bookingDate;
    private String bookingStatus;

    // getters and setters
}

