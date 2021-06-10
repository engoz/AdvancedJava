package com.eng.behavior;

import javax.naming.*;
import javax.naming.directory.*;

import java.util.Hashtable;

public class Simple {

    public static void main(String[] args) {


        boolean b = authenticateUserInActiveDirectory("admin", "Aa123456");
        System.out.println(b);

    }

    private static boolean authenticateUserInActiveDirectory(String enteredUsername, String enteredPassword) {
        Hashtable env = new Hashtable();
        env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
        env.put(Context.PROVIDER_URL, "ldap://10.34.11.50:389");
        env.put(Context.SECURITY_AUTHENTICATION, "simple");
        env.put(Context.SECURITY_PRINCIPAL, enteredUsername + "@corp.servicium.com");
        env.put(Context.SECURITY_CREDENTIALS, enteredPassword);
        env.put(Context.REFERRAL, "follow");
        DirContext ctx = null;
        try {
            ctx = new InitialDirContext(env);
        } catch (javax.naming.AuthenticationException e) {
            e.printStackTrace();
        } catch (javax.naming.NamingException e) {
            e.printStackTrace();
        }
        if (ctx != null) {
            System.out.println("Username and Password matches in AD.");
        }
        return ctx != null;
    }
}
