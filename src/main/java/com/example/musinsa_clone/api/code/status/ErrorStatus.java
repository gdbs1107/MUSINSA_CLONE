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

    //토큰 관련 에러
    TOKEN_NOT_INCORRECT(HttpStatus.UNAUTHORIZED,"TOKEN2001","유효하지 않은 토큰입니다"),
    TOKEN_EXPIRED(HttpStatus.UNAUTHORIZED,"TOKEN2002","만료된 토큰입니다"),
    TOKEN_NULL(HttpStatus.UNAUTHORIZED,"TOKEN2003","토큰이 존재하지 않습니다"),

    // 멤버 관련 에러
    MEMBER_NOT_FOUND(HttpStatus.NOT_FOUND, "MEMBER3001", "사용자가 없습니다."),
    NICKNAME_NOT_EXIST(HttpStatus.BAD_REQUEST, "MEMBER3002", "닉네임은 필수 입니다."),
    USERNAME_EXISTED(HttpStatus.BAD_REQUEST, "MEMBER3003", "이미 존재하는 아이디입니다"),
    TOO_LONG_REQUEST(HttpStatus.BAD_REQUEST,"MEMBER3004","최대 20자입니다"),
    GENDER_ERROR(HttpStatus.BAD_REQUEST,"MEMBER3005","성별을 제대로 입력해주세요"),
    UNAUTHORIZED_ACCESS(HttpStatus.FORBIDDEN, "MEMBER3006","본인의 계정이 아닙니다"),
    MEMBER_PRIVATE_ERROR(HttpStatus.UNAUTHORIZED,"MEMBER3007","비공개 계정입니다. 조회 할 권한이 없습니다"),

    //릴스 관련 에러
    REELS_NOT_FOUND(HttpStatus.NOT_FOUND, "REELS4001", "릴스를 찾을 수 없습니다"),
    REELS_COMMENT_NOT_FOUND(HttpStatus.NOT_FOUND, "REELS4002", "릴스댓글을 찾을 수 없습니다."),
    REELS_END(HttpStatus.NOT_FOUND,"REELS4003","릴스 전부 조회하였습니다"),

    //팔로우, 팔로워 관련 에러
    NOT_YOUR_FOLLOWER(HttpStatus.BAD_REQUEST,"FOLLOW5001","팔로우가 되어있지 않아 요청을 처리 할 수 없습니다"),
    TARGET_NOT_FOUND(HttpStatus.NOT_FOUND,"FOLLOW5002","대상을 찾을 수 없습니다"),

    //이미지 관련 에러
    IMAGE_CONVERT_FAIL(HttpStatus.METHOD_NOT_ALLOWED,"IMAGE6001","파일 변환에 실패하였습니다"),
    IMAGE_NOT_FOUND(HttpStatus.NOT_FOUND,"IMAGE6002","이미지를 찾을 수 없습니다"),
    IMAGE_NOT_ALLOWED(HttpStatus.NOT_FOUND,"IMAGE6003","Amazon S3에서 파일을 불러올 수 없습니다"),
    IMAGE_NOT_DELETED(HttpStatus.NOT_FOUND,"IMAGE6004","이미지 삭제에 실패하였습니다"),

    //메모 관련 에러
    MEMO_NOT_FOUND(HttpStatus.NOT_FOUND,"MEMO7001","메모를 찾을 수 없습니다."),
    MEMO_EXISTED(HttpStatus.BAD_REQUEST, "MEMO7002", "이미 메모가 존재합니다. 삭제 혹은 수정 바랍니다."),

    //채팅 관련 에러
    CHATROOM_NOT_FOUND(HttpStatus.NOT_FOUND,"CHAT8001","채팅방을 찾을 수 없습니다."),
    CHATPART_NOT_FOUND(HttpStatus.NOT_FOUND,"CHAT8002","채팅 설정에 오류가 있습니다. 다시 시도해주세요.");




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
