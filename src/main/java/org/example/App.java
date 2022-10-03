package org.example;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("ALL")
public class App {
    public static void main(String[] args) {
//        System.out.println("Hello World!");

        m1();
        m2();

    }


    private static final Map<Account, LocalDateTime> LAST_LOGINS = new HashMap<>();
    private static final String LANG = "Java";
    public static void m1() {
        Account a = new Account("vip account", "1");

        // user logged in
        LAST_LOGINS.put(a, LocalDateTime.now());

        a.setVip(true);

        // some compliance check
        LocalDateTime lastLogin = LAST_LOGINS.get(a);
        System.out.println(lastLogin);
    }

    public static void m2() {
        String myLang = new String(LANG);

        if (myLang == LANG) {
            System.out.println("Java the best");
        } else {
            System.out.println("something went wrong");
        }
    }

}
