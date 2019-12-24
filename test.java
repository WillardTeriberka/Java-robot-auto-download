package cn.snake.test;

import org.junit.Test;
import cn.snake.regex;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test {
    private cn.snake.regex regex;

    @Test
    public void test() {
        String path = "C:\\Users\\ZAG WELL\\Desktop\\待获取真实路径网页\\golang\\视频解析网，微博、秒拍、汤不热视频解析下载网站 - 副本.txt";


        regex regex = new regex();
        for (int i = 0; i <= 996; i++) {
            String regex_url = "<input type=\"text\" name=\"search\" id=\"video" + i + "\" class=\"form-control get-text\" value=\"(.*?)\">";
            try {
                int flag = i + 1;
//                System.out.println("获取第" + flag + "个视频地址");
                regex.regex(path, regex_url);
                for (int j = flag; j <= flag; j++) {
//                    System.out.println("获取第" + j + "个视频名称");
                    String regex_name = "<span>#" + flag + "/(.*?)</span>";
                    System.out.print(flag);
                    regex.regex(path, regex_name);
//                    System.out.println();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}

