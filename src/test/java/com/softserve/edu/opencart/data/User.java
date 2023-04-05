package com.softserve.edu.opencart.data;

import java.util.ArrayList;
import java.util.List;

interface IFirstname {
    ILastname setFirstname(String firstname);
}

interface ILastname {
    IEmail setLastname(String lastname);
}

interface IEmail {
    ITelephone setEmail(String email);
}

interface ITelephone {
    IAddress1 setTelephone(String telephone);
}

interface IAddress1 {
    ICity setAddress1(String address1);
}

interface ICity {
    IPostcode setCity(String city);
}

interface IPostcode {
    ICountry setPostcode(String postcode);
}

interface ICountry {
    IRegion setCountry(String country);
}

interface IRegion {
    IPassword setRegion(String region);
}

interface IPassword {
    ISubscribe setPassword(String password);
}

interface ISubscribe {
    IBuildUser setSubscribe(boolean subscribe);
}

interface IBuildUser {
    IBuildUser setFax(String fax);
    IBuildUser setCompany(String company);
    IBuildUser setAddress2(String address2);

    // 5. Add Builder
    //User build();
    // 6. Add Dependency Inversion
    IUser build();
}

public class User implements IFirstname, ILastname, IEmail, ITelephone,
        IAddress1, ICity, IPostcode, ICountry, IRegion,
        IPassword, ISubscribe, IBuildUser, IUser {

    public static enum UserColumns {
        FIRST_NAME(0),
        LAST_NAME(1),
        EMAIL(2),
        TELEPHONE(3),
        ADDRESS1(4),
        CITY(5),
        POST_CODE(6),
        COUNTRY(7),
        REGION_STATE(8),
        PASSWORD(9),
        SUBSCRIBE(10),
        FAX(11),
        COMPANY(12),
        ADDRESS2(13);
        //
        private int index;

        private UserColumns(int index) {
            this.index = index;
        }

        public int getIndex() {
            return index;
        }
    }

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

    private final static String EMAIL_SEPARATOR = "@";
    public final static String EMPTY_STRING = new String();
    //
    private String firstname;
    private String lastname;
    private String email;
    private String telephone;
    private String fax;      // not required
    private String company;  // not required
    private String address1;
    private String address2; // not required
    private String city;
    private String postcode;
    private String country;
    private String region;
    private String password;
    private boolean subscribe;

    /* 1. Classic Constructor
    public User(String firstname, String lastname, String email, String telephone,
                String fax, String company, String address1, String address2,
                String city, String postcode, String country, String region,
                String password, boolean subscribe) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.telephone = telephone;
        this.fax = fax;
        this.company = company;
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.postcode = postcode;
        this.country = country;
        this.region = region;
        this.password = password;
        this.subscribe = subscribe;
    }
    */

    /*
    // 2. Use setters
    //public User() {
    // 4. Add Static Factory
    private User() {
        this.firstname = "";
        this.lastname = "";
        this.email = "";
        this.telephone = "";
        this.fax = "";
        this.company = "";
        this.address1 = "";
        this.address2 = "";
        this.city = "";
        this.postcode = "";
        this.country = "";
        this.region = "";
        this.password = "";
        this.subscribe = true;
    }
    */

    // 5. Add Builder
    private User() {
        this.fax = "";      // not required
        this.company = "";  // not required
        this.address2 = ""; // not required
    }

    // 4. Add Static Factory
    //public static User get() {
    // 5. Add Builder
    public static IFirstname get() {
        return new User();
    }

    // Setters
    // 1. Classic Constructor
    //public void setFirstname(String firstname) {
    // 3. Add Fluent interface
    //public User setFirstname(String firstname) {
    // 5. Add Builder
    public ILastname setFirstname(String firstname) {
        this.firstname = firstname;
        return this;
    }

    public IEmail setLastname(String lastname) {
        this.lastname = lastname;
        return this;
    }

    public ITelephone setEmail(String email) {
        this.email = email;
        return this;
    }

    public IAddress1 setTelephone(String telephone) {
        this.telephone = telephone;
        return this;
    }

    public IBuildUser setFax(String fax) {
        this.fax = fax;
        return this;
    }

    public IBuildUser setCompany(String company) {
        this.company = company;
        return this;
    }

    public ICity setAddress1(String address1) {
        this.address1 = address1;
        return this;
    }

    public IBuildUser setAddress2(String address2) {
        this.address2 = address2;
        return this;
    }

    public IPostcode setCity(String city) {
        this.city = city;
        return this;
    }

    public ICountry setPostcode(String postcode) {
        this.postcode = postcode;
        return this;
    }

    public IRegion setCountry(String country) {
        this.country = country;
        return this;
    }

    public IPassword setRegion(String region) {
        this.region = region;
        return this;
    }

    public ISubscribe setPassword(String password) {
        this.password = password;
        return this;
    }

    public IBuildUser setSubscribe(boolean subscribe) {
        this.subscribe = subscribe;
        return this;
    }

    // 5. Add Builder
    //public User build() {
    // 6. Add Dependency Inversion
    public IUser build() {
        return this;
    }

    // Getters

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getFax() {
        return fax;
    }

    public String getCompany() {
        return company;
    }

    public String getAddress1() {
        return address1;
    }

    public String getAddress2() {
        return address2;
    }

    public String getCity() {
        return city;
    }

    public String getPostcode() {
        return postcode;
    }

    public String getCountry() {
        return country;
    }

    public String getRegion() {
        return region;
    }

    public String getPassword() {
        return password;
    }

    public boolean isSubscribe() {
        return subscribe;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                ", telephone='" + telephone + '\'' +
                ", fax='" + fax + '\'' +
                ", company='" + company + '\'' +
                ", address1='" + address1 + '\'' +
                ", address2='" + address2 + '\'' +
                ", city='" + city + '\'' +
                ", postcode='" + postcode + '\'' +
                ", country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", password='" + password + '\'' +
                ", subscribe=" + subscribe +
                '}';
    }

    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

    public static IUser getByList(List<String> row) {
        //logger.trace("row.size() = " + row.size() + " UserColumns.values().length = " + UserColumns.values().length);
        List<String> userData = new ArrayList<>(row);
        for (int i = userData.size(); i < UserColumns.values().length; i++) {
            userData.add(EMPTY_STRING);
        }
        return User.get()
                .setFirstname(userData.get(UserColumns.FIRST_NAME.getIndex()))
                .setLastname(userData.get(UserColumns.LAST_NAME.getIndex()))
                .setEmail(userData.get(UserColumns.EMAIL.getIndex()))
                .setTelephone(userData.get(UserColumns.TELEPHONE.getIndex()))
                .setAddress1(userData.get(UserColumns.ADDRESS1.getIndex()))
                .setCity(userData.get(UserColumns.CITY.getIndex()))
                .setPostcode(userData.get(UserColumns.POST_CODE.getIndex()))
                .setCountry(userData.get(UserColumns.COUNTRY.getIndex()))
                .setRegion(userData.get(UserColumns.REGION_STATE.getIndex()))
                //.setPassword(System.getenv().get(userData.get(UserColumns.PASSWORD.getIndex())))
                .setPassword(userData.get(UserColumns.PASSWORD.getIndex()))
                .setSubscribe(Boolean.parseBoolean(userData.get(UserColumns.SUBSCRIBE.getIndex()).toLowerCase()))
                .setFax(userData.get(UserColumns.FAX.getIndex()) != null ? userData.get(UserColumns.FAX.getIndex()) : EMPTY_STRING)
                //.setFax( userData.get(UserColumns.FAX.getIndex()) == null
                //            || userData.get(UserColumns.FAX.getIndex()).isEmpty()
                //        ? EMPTY_STRING : userData.get(UserColumns.FAX.getIndex()))
                .setCompany(userData.get(UserColumns.COMPANY.getIndex()) != null ? userData.get(UserColumns.COMPANY.getIndex()) : EMPTY_STRING)
                .setAddress2(userData.get(UserColumns.ADDRESS2.getIndex()) != null ? userData.get(UserColumns.ADDRESS2.getIndex()) : EMPTY_STRING)
                .build();
    }

    public static List<IUser> getByLists(List<List<String>> rows) {
        List<IUser> result = new ArrayList<>();
        // TODO Verify Test Data as Valid
        if (!rows.get(0).get(UserColumns.EMAIL.getIndex())
                .contains(EMAIL_SEPARATOR)) {
            rows.remove(0);
        }
        for (List<String> currentRow : rows) {
            result.add(getByList(currentRow));
        }
        return result;
    }


}
