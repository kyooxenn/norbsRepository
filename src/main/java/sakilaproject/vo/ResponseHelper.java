package sakilaproject.vo;

import lombok.Data;
import  org.springframework.web.multipart.MaxUploadSizeExceededException;

@Data
public class ResponseHelper {

    public static <T> ResponseVO<T> success() {
        return new ResponseVO(ParentCommonStatusCode.SUCCESS);
    }

    public static <T> ResponseVO<T> success(T data) {
        return new ResponseVO(ParentCommonStatusCode.SUCCESS, data);
    }

    public static<T> ResponseVO<T> error() {
        return new ResponseVO(ParentCommonStatusCode.FAILURE);
    }

    public static<T> ResponseVO<T> unauthorized() {
        return new ResponseVO(ParentCommonStatusCode.UNAUTHORIZED);
    }

    public static<T> ResponseVO<T> userExist() {
        return new ResponseVO(ParentCommonStatusCode.USER_EXIST);
    }

    public static<T> ResponseVO<T> nullData() {
        return new ResponseVO(ParentCommonStatusCode.NULL_VALUE);
    }

    public static<T> ResponseVO<T> forbidden() {
        return new ResponseVO(ParentCommonStatusCode.FORBIDDEN);
    }

    public static<T> ResponseVO<T> invalid() {
        return new ResponseVO(ParentCommonStatusCode.INVALID_INPUT);
    }

    public static<T> ResponseVO<T> notAcceptable() {
        return new ResponseVO(ParentCommonStatusCode.NOT_ACCEPTABLE);
    }

    public static<T> ResponseVO<T> fileSize2(MaxUploadSizeExceededException exc) {
        return new ResponseVO(ParentCommonStatusCode.TOO_LARGE_FILE,exc);
    }

    public static<T> ResponseVO<T> fileSize(MaxUploadSizeExceededException exc) {
        return new ResponseVO(ParentCommonStatusCode.TOO_LARGE_FILE);
    }

    public static<T> ResponseVO<T> userNotFound() {
        return new ResponseVO(ParentCommonStatusCode.INVALID_USER);
    }

    public static<T> ResponseVO<T> fileError() {
        return new ResponseVO(ParentCommonStatusCode.INVALID_FILE);
    }
}
