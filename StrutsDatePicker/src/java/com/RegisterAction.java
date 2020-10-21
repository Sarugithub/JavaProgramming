package com;  
import com.opensymphony.xwork2.ActionSupport;  
import java.util.Date;  

public  class RegisterAction  extends ActionSupport {  
    private Date todayDate,todayDate2;  
        public Date getTodayDate2() {  
        return todayDate2;  
    }  
    public void setTodayDate2(Date todayDate2) {  
        this.todayDate2 = todayDate2;  
    }  
  
    public Date getTodayDate() {  
        return todayDate;  
        }  
        public void setTodayDate(Date value) {  
        todayDate = value;  
        }  
      
       public String execute(){  
        return SUCCESS;  
       }  
}  