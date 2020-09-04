package com.twu;

import com.twu.top.search.system.TopSearchSystem;
import com.twu.top.search.system.list.TopSearch;
import com.twu.top.search.system.user.Manager;
import com.twu.top.search.system.user.NormalUser;
import com.twu.top.search.system.user.User;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TopSearchSystem topSearchSystem = new TopSearchSystem();
        runSystem(topSearchSystem);
    }

    private static void runSystem(TopSearchSystem topSearchSystem) {
        topSearchSystem.setRunning(true);
        while (topSearchSystem.isRunning()) {
            System.out.println("欢迎来到热搜排行榜，你是？");
            System.out.println("1.用户");
            System.out.println("2.管理员");
            System.out.println("3.退出");
            Scanner sc = new Scanner(System.in);
            String order = sc.next();
            String name;
            User user;
            switch (order) {
                case "1":
                    System.out.println("请输入您的昵称：");
                    name = sc.next();
                    user = new NormalUser(name);
                    logIn(user, topSearchSystem);
                    break;
                case "2":
                    System.out.println("请输入您的昵称：");
                    name = sc.next();
                    System.out.println("请输入您的密码：");
                    String password = sc.next();
                    user = new Manager(name, password);
                    logIn(user, topSearchSystem);
                    break;
                case "3":
                    topSearchSystem.setRunning(false);
                    break;
                default:
                    break;
            }
        }
    }

    private static void logIn(User user, TopSearchSystem topSearchSystem) {
        topSearchSystem.setLogIn(true);
        topSearchSystem.setUser(user);
        String searchName;
        System.out.println("你好，" + user.getName() + "，你可以：");
        Scanner sc = new Scanner(System.in);
        String order;
        while (topSearchSystem.isLogIn()) {
            if (user.getJurisdiction().equals("normal-user")) {
                System.out.println("1.查看热搜排行榜");
                System.out.println("2.给热搜事件投票");
                System.out.println("3.购买热搜");
                System.out.println("4.添加热搜");
                System.out.println("5.退出");
                order = sc.next();
                switch (order) {
                    case "1":
                        System.out.println(topSearchSystem.showRankingList());
                        break;
                    case "2":
                        break;
                    case "3":
                        break;
                    case "4":
                        System.out.println("请输入你要添加的热搜事件的名字");
                        searchName = sc.next();
                        TopSearch topSearch = new TopSearch(searchName, 0, false);
                        if (topSearchSystem.addTopSearch(topSearch)) {
                            System.out.println("添加成功");
                        } else {
                            System.out.println("添加失败");
                        }
                        break;
                    case "5":
                        topSearchSystem.setLogIn(false);
                        break;
                    default:
                        break;
                }
            } else if (user.getJurisdiction().equals("manager")) {
                TopSearch topSearch;
                System.out.println("1.查看热搜排行榜");
                System.out.println("2.添加热搜");
                System.out.println("3.添加超级热搜");
                System.out.println("4.退出");
                order = sc.next();
                switch (order) {
                    case "1":
                        System.out.println(topSearchSystem.showRankingList());
                        break;
                    case "2":
                        System.out.println("请输入你要添加的热搜事件的名字");
                        searchName = sc.next();
                        topSearch = new TopSearch(searchName, 0, false);
                        if (topSearchSystem.addTopSearch(topSearch)) {
                            System.out.println("添加成功");
                        } else {
                            System.out.println("添加失败");
                        }
                        break;
                    case "3":
                        System.out.println("请输入你要添加的超级热搜事件的名字");
                        searchName = sc.next();
                        topSearch = new TopSearch(searchName, 0, true);
                        if (topSearchSystem.addSuperTopSearch(topSearch)) {
                            System.out.println("添加成功");
                        } else {
                            System.out.println("添加失败");
                        }
                        break;
                    case "4":
                        topSearchSystem.setLogIn(false);
                        break;
                    default:
                        break;
                }
            }
        }
    }
}
