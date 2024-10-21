package com.example.musinsa_clone.api.code.status;



import com.example.musinsa_clone.api.code.BaseErrorCode;
import com.example.musinsa_clone.api.code.ErrorReasonDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum CommonErrorStatus implements BaseErrorCode {

    _INTERNAL_SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR,"COMMON500","서버에러,관리자에게 문의바랍니다"),
    _BAD_REQUEST(HttpStatus.BAD_REQUEST,"COMMON400","잘못된 인증 요청입니다"),
    _UNAUTHORIZED(HttpStatus.UNAUTHORIZED,"COMMON401","인증이 필요합니다"),
    _FORBIDDEN(HttpStatus.FORBIDDEN,"COOMON403","금지된 요청입니다");

    private final HttpStatus httpStatus;
    private final String code;
    private final String message;


    @Override
    public ErrorReasonDTO getReason() {
        return ErrorReasonDTO.builder()
                .message(message)
                .code(code)
                .isSuccess(false)
                .build();
    }

    @Override
    public ErrorReasonDTO getReasonHttpStatus() {

        return ErrorReasonDTO.builder()
                .message(message)
                .code(code)
                .httpStatus(httpStatus)
                .isSuccess(false)
                .build();
    }
}
