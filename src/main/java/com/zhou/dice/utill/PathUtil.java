package com.zhou.dice.utill;

import java.io.File;

public class PathUtil {

    public static String appendPathSep(String src, String separator, String... addPaths){
        StringBuilder result = new StringBuilder(src);
        for (int i = 0; i < addPaths.length; i++) {
            String temp = addPaths[i].startsWith(separator)? addPaths[i] : separator + addPaths[i];
            if(result.toString().endsWith(separator)){
                //含头不含尾。
                result.delete(result.length() - separator.length(), result.length());
            }
            result.append(temp);
        }
        return result.toString();
    }

    public static String appendWebPath(String src,String... addPaths){
        return  appendPathSep(src, "/", addPaths);
    }

    public static String appendPath(String src, String... addPaths){
        return  appendPathSep(src, File.separator, addPaths);
    }

    public static boolean startWith(String src, String[] sep){
        for (String s : sep) {
            if(src.startsWith(s)){
                return true;
            }
        }
        return false;
    }



    public static void main(String[] args) {
        System.out.println(PathUtil.startWith("jie",new String[]{"/"}));
        System.out.println(PathUtil.startWith("/jie",new String[]{"\\"}));
        System.out.println(PathUtil.startWith("\\jie",new String[]{"\\","/"}));
//        String s = PathUtil.appendPathSep("acount/", "/","/jie/chagn", "/xie/aaa/");
//        System.out.println(s);
        /*StringBuilder sb = new StringBuilder("mozq/account/img/");
        sb.delete(sb.length() - 2 , sb.length() - 1);
        System.out.println(sb.toString());*/
//        StringBuilder sb = new StringBuilder("mozq/account/img/");
//        sb.delete(-2, -3);//Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: -2
        //System.out.println(null + "123");
        //StringBuilder stringBuilder = new StringBuilder(null);
        //Exception in thread "main" java.lang.NullPointerException
    }
}