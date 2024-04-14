package org.example;

import java.util.Scanner;

import static org.example.account.*;

public class Main {
    public static void main(String[] args) {
        account acc ;
        post ps;
        subreddit sr;
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Enter 1 to signUp\nEnter 2 to Login\nEnter 3 to exit");
            int in1 = in.nextInt();
            if (in1 == 1) {
                boolean flag = true;
                System.out.println("Enter your username");
                String in2 = in.next();
                System.out.println("Enter your email");
                String in3 = in.next();
                System.out.println("Enter your password");
                String in4 = in.next();
                for (int i = 0 ; i < users.size() ; i++) {
                    if (users.get(i).getUsername().equals(in2)) {
                        System.out.println("Username has alredy exist\nPlease enter another username");
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    acc = new account(in2, in4, in3);
                    users.add(acc);
                    System.out.println("account created");
                }

            }
            if (in1 == 2) {
                System.out.println("Enter your username");
                String in5 = in.next();
                System.out.println("Enter your password");
                String in6 = in.next();
                if (account.Check(in5, in6)) {
                    System.out.println("login Successful");
                    acc = new account(in5,in6,"");
                    while (true) {
                        System.out.println("Press 1 to see and join SubReddits\nPress 2 to creat new SubReddit\nPress 3 to creat new post\nPress 4 to see all posts\nPress 5 to LogOut ");
                        int in7 = in.nextInt();
                        if (in7 == 5){
                            break;
                        }
                        if (in7 == 2){
                            System.out.println("Enter the title of the SubReddit");
                            Scanner inC = new Scanner(System.in);
                            String in10 = inC.nextLine();
                            sr = new subreddit(in10);
                            subr.add(sr);
                        }
                        if (in7 == 1){
                            for (int i = 0 ; i < subr.size() ; i++){
                                System.out.println(subr.get(i).getTitle());
                            }
                            System.out.println("Enter the name of SubReddit you want to join or enter the exit to exit");
                            Scanner inE = new Scanner(System.in);
                            String in13 = inE.nextLine();
                            if (in13 == "exit"){
                                break;
                            }
                            for (int i = 0 ; i < subr.size() ; i++){
                                if (in13 == subr.get(i).getTitle()){

                                }
                            }
                        }
                        if (in7 == 4){
                            for (int i=0 ; i < posts.size() ; i++){
                                System.out.println("__________________");
                                System.out.println("SubReeddit : " + posts.get(i).getSubreddit());
                                System.out.println("Author : " + acc.getUsername());
                                System.out.println("Title : " + posts.get(i).getTitle());
                                System.out.println("Content : " + posts.get(i).getBody());
                                System.out.println("__________________");
                            }
                        }
                        if (in7 == 3) {
                            for(int i = 0 ; i < subr.size() ; i++){
                                System.out.println(subr.get(i).getTitle());
                            }
                            System.out.println("Enter the SubReddit name");
                            Scanner inD = new Scanner(System.in);
                            String in11 = inD.nextLine();
                            for (int i = 0 ; i < subr.size() ; i++){
                                if (in11 == subr.get(i).getTitle()){
                                    System.out.println("You can post in this SubReddit");
                                }
                            }
                            System.out.println("Enter the title of your post");
                            Scanner inA = new Scanner(System.in);
                            String in8 = inA.nextLine();
                            System.out.println("Enter the body of your post");
                            Scanner inB = new Scanner(System.in);
                            String in9 = inB.nextLine();
                            ps = new post(in8, in9, "",in11);
                            posts.add(ps);
                            System.out.println("__________________");
                            System.out.println("SubReeddit : " + ps.getSubreddit());
                            System.out.println("Author : " + acc.getUsername());
                            System.out.println("Title : " + ps.getTitle());
                            System.out.println("Content : " + ps.getBody());
                            System.out.println("__________________");
                        }

                    }
                }
                else if (!account.Check(in5, in6)) {
                    System.out.println("Invalid username or password");

                }
            }
            if (in1 == 3){
                break;
            }
//            else {
//                System.out.println("Enter the correct character");
//            }
        }
    }
}