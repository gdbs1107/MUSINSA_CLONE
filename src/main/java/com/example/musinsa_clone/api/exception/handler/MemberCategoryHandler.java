package com.example.musinsa_clone.api.exception.handler;

import com.example.musinsa_clone.api.code.BaseErrorCode;
import com.example.musinsa_clone.api.exception.GeneralException;

public class MemberCategoryHandler extends GeneralException {

    public MemberCategoryHandler(BaseErrorCode baseErrorCode) {

        super(baseErrorCode);
    }
}
