package org.example;
import org.apache.commons.codec.digest.DigestUtils;

import java.util.ArrayList;
import java.util.List;



public class account {
    String username;
    String password;
    String email;

    static List<account> users = new ArrayList<>();
    static List<post> posts = new ArrayList<>();
    static List<comment> comments = new ArrayList<>();
    static List<subreddit> subr = new ArrayList<>();
    int karma;
    public account(String username, String password,String email){
        this.username = username;
//        this.password = DigestUtils.sha256Hex(password);
        this.password = password;
        this.email = email;
    }
    public String retPass(){
//        return DigestUtils.sha256Hex(password);
        return password;
    }
    public String getUsername(){
        return this.username;
    }
    public String getEmail(){
        return this.email;
    }
    public  static boolean Check(String username, String pass){
        for (int i = 0 ; i < users.size() ; i++){
            if (username.equals(users.get(i).getUsername()) || username.equals(users.get(i).getEmail())){
                account acc = users.get(i);
                if (pass.equals(acc.retPass())){
                    return true;
                }
            }
        }
        return false;
    }
    public void setPosts(){

    }
}