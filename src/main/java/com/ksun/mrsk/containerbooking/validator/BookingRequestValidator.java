package com.ksun.mrsk.containerbooking.validator;

import com.ksun.mrsk.containerbooking.model.dto.BookingRequest;
import com.ksun.mrsk.containerbooking.model.dto.CheckRequest;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class BookingRequestValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return clazz == CheckRequest.class || clazz == BookingRequest.class;
    }

    @Override
    public void validate(Object target, Errors errors) {
        CheckRequest bookingRequest = (CheckRequest) target;
        if (bookingRequest.getContainerSize() == 20 || bookingRequest.getContainerSize() == 40) {
            return;
        }
        errors.reject("ERRORCODE", "Container Size must be either 20 or 40");
    }
}
