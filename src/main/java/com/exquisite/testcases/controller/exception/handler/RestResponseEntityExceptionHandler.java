package com.exquisite.testcases.controller.exception.handler;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

    private final String DEFAULT_EXCEPTION_TITLE = "An exception has occurred";

    @ExceptionHandler (value = {Exception.class})
    ResponseEntity<Object> handleException(RuntimeException exception, WebRequest webRequest){
       final ErrorResponseEntity errorResponseEntity = new ErrorResponseEntity(DEFAULT_EXCEPTION_TITLE,
                                                                            HttpStatus.INTERNAL_SERVER_ERROR.value(),
                                                                            ExceptionUtils.getStackTrace(exception));

       return handleExceptionInternal(exception, errorResponseEntity, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR, webRequest);
    }

    private class ErrorResponseEntity{

        private final String title;
        private final int httpStatusCode;
        private final String exceptionStackTrace;

        public ErrorResponseEntity(String title, int httpStatusCode, String exceptionStackTrace) {
            this.title = title;
            this.httpStatusCode = httpStatusCode;
            this.exceptionStackTrace = exceptionStackTrace;
        }

        public String getTitle() {
            return title;
        }

        public int getHttpStatusCode() {
            return httpStatusCode;
        }

        public String getExceptionStackTrace() {
            return exceptionStackTrace;
        }
    }
}
