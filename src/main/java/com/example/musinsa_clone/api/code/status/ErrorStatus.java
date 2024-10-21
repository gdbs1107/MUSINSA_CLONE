package com.example.musinsa_clone.api.code.status;



import com.example.musinsa_clone.api.code.BaseErrorCode;
import com.example.musinsa_clone.api.code.ErrorReasonDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum ErrorStatus implements BaseErrorCode {


    _INTERNAL_SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR,"COMMON1001","서버에러, 관리자에게 문의 바랍니다"),
    _BAD_REQUEST(HttpStatus.BAD_REQUEST,"COMMON1002","잘못된 요청입니다."),
    _UNAUTHORIZED(HttpStatus.UNAUTHORIZED,"COMMON1003","인증이 필요합니다."),
    _FORBIDDEN(HttpStatus.FORBIDDEN, "COMMON1004", "금지된 요청입니다."),

    // 멤버 관련 에러
    // 해당 에러코드는 추후 어노테이션으로 수정 할 예정입니다
    MEMBER_NOT_FOUND(HttpStatus.NOT_FOUND, "MEMBER3001", "사용자가 없습니다.");




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
                .isSuccess(false)
                .httpStatus(httpStatus)
                .build();
    }
}
