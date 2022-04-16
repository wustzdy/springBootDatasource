package com.wustzdy.springboot.crud.service;

import com.wustzdy.springboot.crud.util.LocaleUtils;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

@Service
public class I18nService {

    private final MessageSource messageSource;

    public I18nService(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    public String getMessage(String msgKey, Object[] args) {
        return messageSource.getMessage(msgKey, args, LocaleUtils.getCurrentLocale());
    }

    public String getMessage(String msgKey) {
        return messageSource.getMessage(msgKey, null, LocaleUtils.getCurrentLocale());
    }
}
