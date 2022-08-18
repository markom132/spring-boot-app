package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class ServiceClass {
    public static boolean check(String s) {
        if (s.contains("b") && s.contains("a") && ll(s) == 2 && oo(s) == 2 && s.contains("n")) {
            return true;
        } else if (ll(s) != 2 || oo(s) != 2 || !s.contains("b") || !s.contains("a") || !s.contains("n")) {

            return false;
        }
        return false;
    }

    public static int ll(String s) {
        char[] chars = s.toCharArray();
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            count = 1;
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j] && chars[i] == 'l') {
                    count++;
                    if (count == 2) {
                        chars[j] = '0';
                    }
                    return count;

                }
            }
        }
        return count;
    }

    public static int oo(String s) {
        char[] chars = s.toCharArray();
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            count = 1;
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j] && chars[i] == 'o') {
                    count++;
                    if (count == 2) {
                        chars[j] = '0';
                    }
                    return count;

                }

            }

        }
        return count;
    }


    public static String call(String s) {
        String th = "";
        String ss = chechB(chechA(chechL(chechO(chechN(s)))));
        int n = 0;
        if (check(s)) {
            do {
                th = chechB(chechA(chechL(chechO(chechN(s)))));
                s = th;
                n++;
            } while (s.length() >= 7);
            return String.valueOf(n);
        }
        System.out.print("In string we find " + n + " balloons, remaining chars: ");
        if (th.equals("")) {
            th = String.valueOf(0);
            return th;
        }

        return th;
    }

    public static String chechL(String s) {
        char[] chars = s.toCharArray();
        int count;
        String t = "";
        if (s.contains("l")) {

            for (int i = 0; i < chars.length; i++) {
                count = 1;
                for (int j = i + 1; j < chars.length; j++) {
                    if (chars[i] == chars[j] && chars[i] == 'l') {
                        count++;
                        if (count == 2) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(s);
                            sb.deleteCharAt(j);
                            sb.deleteCharAt(i);
                            chars = sb.toString().toCharArray();
                            t = String.valueOf(chars);
                            return t;

                        }
                        chars[j] = '0';
                        break;
                    }

                }


            }
        }
        return t;
    }

    public static String chechO(String s) {
        char[] chars = s.toCharArray();
        int count;
        String t = "";
        if (s.contains("o")) {

            for (int i = 0; i < chars.length; i++) {
                count = 1;
                for (int j = i + 1; j < chars.length; j++) {
                    if (chars[i] == chars[j] && chars[i] == 'o') {
                        count++;
                        if (count == 2) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(s);
                            sb.deleteCharAt(j);
                            sb.deleteCharAt(i);
                            chars = sb.toString().toCharArray();
                            t = String.valueOf(chars);
                            return t;

                        }
                        chars[j] = '0';
                        break;
                    }

                }


            }
        }
        return t;
    }

    public static String chechB(String s) {
        char[] chars = s.toCharArray();
        String t = "";
        if (s.contains("b")) {

            for (int i = 0; i < chars.length; i++) {


                if (chars[i] == 'b') {


                    StringBuilder sb = new StringBuilder();
                    sb.append(s);
                    sb.deleteCharAt(i);
                    chars = sb.toString().toCharArray();
                    t = String.valueOf(chars);
                    return t;


                }

            }


        }


        return t;
    }

    public static String chechA(String s) {
        char[] chars = s.toCharArray();
        int count = 0;
        String t = "";
        if (s.contains("a")) {

            for (int i = 0; i < chars.length; i++) {

                if (chars[i] == 'a') {


                    StringBuilder sb = new StringBuilder();
                    sb.append(s);
                    sb.deleteCharAt(i);
                    chars = sb.toString().toCharArray();
                    t = String.valueOf(chars);
                    return t;


                }

            }


        }


        return t;
    }

    public static String chechN(String s) {
        char[] chars = s.toCharArray();
        int count = 0;
        String t = "";
        if (s.contains("n")) {

            for (int i = 0; i < chars.length; i++) {

                if (chars[i] == 'n') {


                    StringBuilder sb = new StringBuilder();
                    sb.append(s);
                    sb.deleteCharAt(i);
                    chars = sb.toString().toCharArray();
                    t = String.valueOf(chars);
                    return t;


                }

            }


        }


        return t;
    }

}
