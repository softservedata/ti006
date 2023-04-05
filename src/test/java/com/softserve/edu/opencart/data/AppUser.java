package com.softserve.edu.opencart.data;

public class AppUser {

    public static void main(String[] args) {
        /*
        // 1. Classic Constructor
        User user = new User("firstname1", "lastname1",
                "email234@awdrt.com", "+380671234567", "fax1",
                "company1", "address1", "address2",
                "city1", "postcode1", "Ukraine1",
                "Kyiv1", "qwerty1", true);
        System.out.println("user = " + user);
        */
        /*
        // 2. Use setters
        User user = new User();
        user.setFirstname("firstname2");
        user.setLastname("lastname2");
        user.setEmail("email234@awdrt.com");
        user.setTelephone("+380671234567");
        user.setFax("fax2");
        user.setCompany("company2");
        user.setAddress1("address1");
        user.setAddress2("address2");
        user.setCity("city2");
        user.setPostcode("postcode2");
        user.setCountry("Ukraine2");
        user.setRegion("Kyiv2");
        user.setPassword("qwerty2");
        user.setSubscribe(true);
        System.out.println("user = " + user);
        */
        /*
        // 3. Add Fluent interface
        User user = new User()
                .setFirstname("firstname3")
                .setLastname("lastname3")
                .setEmail("email234@awdrt.com")
                .setTelephone("+380671234567")
                .setFax("fax3")
                .setCompany("company3")
                .setAddress1("address1")
                .setAddress2("address2")
                .setCity("city3")
                .setPostcode("postcode3")
                .setCountry("Ukraine3")
                .setRegion("Kyiv3")
                .setPassword("qwert3")
                .setSubscribe(true);
        System.out.println("user = " + user);
        */
        /*
        // 4. Add Static Factory
        User user = User.get()
                .setFirstname("firstname4")
                .setLastname("lastname4")
                .setEmail("email234@awdrt.com")
                .setTelephone("+380671234567")
                .setFax("fax4")
                .setCompany("company4")
                .setAddress1("address1")
                .setAddress2("address2")
                .setCity("city4")
                .setPostcode("postcode4")
                .setCountry("Ukraine4")
                .setRegion("Kyiv4")
                .setPassword("qwert4")
                .setSubscribe(true);
        System.out.println("user = " + user);
        */
        /*
        // 5. Add Builder
        User user = User.get()
                .setFirstname("firstname4")
                .setLastname("lastname5")
                .setEmail("email234@awdrt.com")
                .setTelephone("+380671234567")
                .setAddress1("address1")
                .setCity("city5")
                .setPostcode("postcode5")
                .setCountry("Ukraine5")
                .setRegion("Kyiv4")
                .setPassword("qwert5")
                .setSubscribe(true)
                .setFax("fax4")
                .setCompany("company5")
                .setAddress2("address2")
                .build();
        System.out.println("user.getEmail() = " + user.setEmail("")); // Architecture Error
        System.out.println("user = " + user);
        */
        /*
        // 6. Add Dependency Inversion
        IUser user = User.get()
                .setFirstname("firstname4")
                .setLastname("lastname5")
                .setEmail("email234@awdrt.com")
                .setTelephone("+380671234567")
                .setAddress1("address1")
                .setCity("city5")
                .setPostcode("postcode5")
                .setCountry("Ukraine5")
                .setRegion("Kyiv4")
                .setPassword("qwert5")
                .setSubscribe(true)
                .setFax("fax4")
                .setCompany("company5")
                .setAddress2("address2")
                .build();
        //System.out.println("user.getEmail() = " + user.setEmail("")); // Compile Error
        //System.out.println("user.getEmail() = " + ((User) user).setEmail("111")); // Code Smell
        System.out.println("user = " + user);
        */
        //
        // 7.8. Add Repository and Singleton
        IUser user = UserRepository.get().getValidUser();
        System.out.println("user = " + user);
    }
}
