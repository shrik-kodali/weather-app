package com.ai.weather.client;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import feign.Response;
import feign.codec.ErrorDecoder;


/**
 * ErrorDecoder implementation to handle Feign Exceptions
 */
public class DefaultErrorDecoder implements ErrorDecoder {
    @Override
    public Exception decode(String key, Response response) {
        if (response.status() == 404) {
            return new ResponseStatusException(HttpStatus.NOT_FOUND, "City Not found");
        }

        if (response.status() == 400) {
            return new ResponseStatusException(HttpStatus.BAD_REQUEST, "Nothing to geocode");
        }

        return new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "An error occured pleas try again later");
    }

}
    

