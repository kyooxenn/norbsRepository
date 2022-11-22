package sakilaproject.vo;

public class ParentCommonStatusCode {

    public  static final ServiceStatusCode SUCCESS = new ServiceStatusCode(200,"Successful Operation");
    public  static final ServiceStatusCode FAILURE = new ServiceStatusCode(500,"An exception occurred in the server side!");
    public  static final ServiceStatusCode NOT_ACCEPTABLE = new ServiceStatusCode(200,"The Input Data is Not Acceptable!");
    public  static final ServiceStatusCode UNAUTHORIZED = new ServiceStatusCode(200,"Username or Password is Incorrect");
    public  static final ServiceStatusCode FORBIDDEN = new ServiceStatusCode(200,"Authorization Failed!");
    public  static final ServiceStatusCode USER_EXIST = new ServiceStatusCode(200,"User Account Already Exist");
    public  static final ServiceStatusCode NULL_VALUE = new ServiceStatusCode(200,"No Data Found");
    public  static final ServiceStatusCode INVALID_INPUT = new ServiceStatusCode(200,"Invalid Input");
    public  static final ServiceStatusCode TOO_LARGE_FILE = new ServiceStatusCode(200,"File too large!");
    public  static final ServiceStatusCode INVALID_USER = new ServiceStatusCode(200,"Incorrect Username or Password.");
    public  static final ServiceStatusCode INVALID_FILE = new ServiceStatusCode(200,"Please upload a csv file!");


}
