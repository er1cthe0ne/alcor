package com.futurewei.alcor.gatewaymanager.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class AttachmentNotFoundException extends Exception{
    public AttachmentNotFoundException() {
        super("Attachment could not be found");
    }
}
