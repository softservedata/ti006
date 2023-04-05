package com.softserve.edu.opencart.data;

import com.softserve.edu.opencart.tools.CSVReader;
import com.softserve.edu.opencart.tools.ExcelReader;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public final class UserRepository {
    private static volatile UserRepository instance = null;
    private static final String TIME_TEMPLATE = "HH_mm_ss_S";

    private UserRepository() {
    }

    public static UserRepository get() {
        if (instance == null) {
            synchronized (UserRepository.class) {
                if (instance == null) {
                    instance = new UserRepository();
                }
            }
        }
        return instance;
    }

    public IUser getDefault() {
        return getValidUser();
    }

    public IUser getHahaha() {
        return getValidUser();
    }

    public IUser getValidUser() {
        //User user = new User(); // Error
        return User.get()
                .setFirstname("hahaha")
                .setLastname("hahaha")
                .setEmail("haha@gmail.com")
                .setTelephone("hahaha")
                .setAddress1("address1")
                .setCity("city_5")
                .setPostcode("postcode")
                .setCountry("country")
                .setRegion("region")
                .setPassword("qwerty")
                //.setPassword(System.getenv().get("MY_PASSWORD_HAHAHA"))
                .setSubscribe(true)
                .setFax("fax")
                .setCompany("company")
                .setAddress2("address2")
                .build();
    }

    public IUser getAwdrt() {
        return User.get()
                .setFirstname("my")
                .setLastname("hahaha")
                .setEmail("xdknxusqvjeovowpfk@awdrt.com")
                .setTelephone("hahaha")
                .setAddress1("address1")
                .setCity("city_5")
                .setPostcode("postcode")
                .setCountry("country")
                .setRegion("region")
                .setPassword(System.getenv().get("MY_PASSWORD_AWDTR"))// MY_PASSWORD_AWDTR
                .setSubscribe(true)
                .setFax("fax")
                .setCompany("company")
                .setAddress2("address2")
                .build();
    }

    public IUser getNewUser() {
        String currentTime = new SimpleDateFormat(TIME_TEMPLATE).format(new Date());
        String newEmail = "temp" + currentTime + "@gmail.com";
        System.out.println("newEmail = " + newEmail); // TODO Log
        return User.get()
                .setFirstname("firstName3")
                .setLastname("lastName3")
                .setEmail(newEmail)
                .setTelephone("telephone3")
                .setAddress1("address13")
                .setCity("city3")
                .setPostcode("postCode3")
                .setCountry("Ukraine")
                .setRegion("Kyiv")
                .setPassword(System.getenv().get("MY_PASSWORD_AWDTR"))
                //.setPassword("password3")
                .setSubscribe(true)
                .setFax("fax3")
                .build();
    }

    public IUser getInvalidUser() {
        return User.get()
                .setFirstname("hahaha1")
                .setLastname("hahaha1")
                .setEmail("hahaha1@gmail.com")
                .setTelephone("hahaha")
                .setAddress1("address1")
                .setCity("city_5")
                .setPostcode("postcode")
                .setCountry("country")
                .setRegion("region")
                .setPassword("q")
                //.setPassword(System.getenv().get("MY_PASSWORD_HAHAHA"))
                .setSubscribe(true)
                .setFax("fax")
                .setCompany("company")
                .setAddress2("address2")
                .build();
    }

    public List<IUser> fromCsv(String filename) {
        return User.getByLists(new CSVReader(filename).getAllCells());
    }

    public List<IUser> fromCsv() {
        return fromCsv("users.csv");
    }

    public List<IUser> fromExcel(String filename) {
        return User.getByLists(new ExcelReader(filename).getAllCells());
    }

    public List<IUser> fromExcel() {
        return fromExcel("users.xlsx");
    }

}