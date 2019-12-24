package cn.snake;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import cn.snake.regex;

public class testadd {
    public static void main(String[] args) {
        
        // Pattern pattern = Pattern.compile(rgex);// ƥ���ģʽ
        // Matcher m = pattern.matcher(originstr);
        // while (m.find()) {
        //     System.out.println(m.group(1));
        // }

        regex regex1 = new regex();//获取路径
        regex regex2 = new regex();//获取视频名
        String path = "*/test1.html";
        String s_regex1 = "<input type=\"text\" name=\"search\" id=\"video1\" class=\" form-control get-text\" value=\"(.*?)\">";
        try {
            regex1.regex(path,s_regex1);
        } catch (IOException e) {
            e.printStackTrace();
        }
//        String content2 = regex2.regex(path,regex2);
//        String content = content1 + "\t" + content2;
    }
}
