package com.learning.JaversPoc;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BookingPayloads {
    private BookingPayload oldPayload;
    private BookingPayload newPayload;
    // getters and setters
}
