package com.company;

public class MobilePhone extends Phone {
    private String operator;

    @Override
    public String getPhone(){
        StringBuffer str = new StringBuffer();
        str.append(operator);
        str.append(" ");
        str.append(number);
        return str.toString();

    }

    public MobilePhone(String a,String b){
        operator=a;
        number=b;
    }

    public MobilePhone() {}

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator){
        this.operator = operator;
    }

    public  String getNumber() {
        return number;
    }

    public void setNumber(String number){
        this.number=number;
    }

}
