package com.laioffer.happystay.exception;

public class ReservationNotFoundException extends RuntimeException {
    public ReservationNotFoundException(String message) {
        super(message);
    }
}
