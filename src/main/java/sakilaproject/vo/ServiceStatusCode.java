package sakilaproject.vo;

import lombok.Data;
import lombok.ToString;

import java.util.Objects;

@Data
@ToString
public class ServiceStatusCode {
    private final int code;
    private final String msg;
    private final String type;


    public ServiceStatusCode(int code) {
        this.code = code;
        this.msg ="";
        this.type = "";
    }

    public ServiceStatusCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
        this.type = "";
    }

    public ServiceStatusCode(int code, String msg, String type) {
        this.code = code;
        this.msg = msg;
        this.type = type;
    }

    public boolean equals(Object o) {
        if (this== o) {
            return true;
        } else if (!(o instanceof  ServiceStatusCode)) {
            return false;
        } else {
            ServiceStatusCode that = (ServiceStatusCode)o;
            return this.code == that.code && Objects.equals(this.type, that.type);
        }
    }
    public int hashCode() { return  Objects.hash(new Object[]{this.code,this.type}); }



}
