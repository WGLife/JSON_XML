package com.company;

public class Contact {
    private String name;
    private String surname;
    private HomePhone hp;
    private MobilePhone mp;


    public  Contact (String a, String b) {
        name = a;
        surname = b;

    }

    public Contact () {

    }

    public String getSurnameName() {
        return surname;
    }

    public void setSurnameName(String surname){
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getHomePhone() {
        return hp.getPhone();
    }

    public void setHomePhone (HomePhone hp){
        this.hp = new HomePhone(hp.getCity(),hp.getNumber());
    }
    
    public String getMobilePhone() {
        return  mp.getPhone();
    }

    public  void setMobilePhone (MobilePhone mp){
        this.mp = new MobilePhone(mp.getOperator(),mp.getNumber());
    }

    public void printAllInformation (){
        StringBuffer str = new StringBuffer();
        str.append(getName());
        str.append(" ");
        str.append(getSurnameName());
        str.append(" ");
        str.append(getHomePhone());
        str.append(" ");
        str.append(getMobilePhone());
        System.out.println(str.toString());
    }
}
