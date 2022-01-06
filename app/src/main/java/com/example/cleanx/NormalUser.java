package com.example.cleanx;

public class NormalUser {

    String name,email1,address1,city1,area1, pincode1 ,company1,number,psw,con;

    public NormalUser() { }

    public NormalUser(String name, String email1, String address1, String city1, String area1, String pincode1, String company1, String number, String psw, String con)
    {
        this.name = name;
        this.email1 = email1;
        this.address1 = address1;
        this.city1 = city1;
        this.area1 = area1;
        this.pincode1 = pincode1;
        this.company1 = company1;
        this.number = number;
        this.psw = psw;
        this.con = con;
    }

    public String getName()
    {   return name;
    }

    public String getEmail1()
    {   return email1;
    }

    public String getAddress1()
    {   return address1;
    }

    public String getCity1()
    {   return city1;
    }

    public String getArea1()
    {   return area1;
    }

    public String getPincode1()
    {   return pincode1;
    }

    public String getCompany1()
    {   return company1;
    }

    public String getNumber()
    {   return number;
    }

    public String getPsw()
    {   return psw;
    }
    public String getCon()
    {   return con;
    }
}

