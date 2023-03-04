package com.ksun.mrsk.containerbooking.validator;

import com.ksun.mrsk.containerbooking.model.dto.BookingRequest;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class BookingRequestValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return clazz == BookingRequest.class; //todo
    }

    @Override
    public void validate(Object target, Errors errors) {
        BookingRequest bookingRequest = (BookingRequest) target;
        if (bookingRequest.getContainerSize() > 20) {
            return;
        }
        errors.reject("code");


    }
}
