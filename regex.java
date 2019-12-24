package cn.snake;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex {
    public void regex(String fileName, String reg) throws IOException {
        String encoding = "UTF-8";
        File file = new File(fileName);
        Long filelength = file.length();
        byte[] filecontent_cache = new byte[filelength.intValue()];
        try {
            FileInputStream in = new FileInputStream(file);
            in.read(filecontent_cache);
            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            String filecontent = new String(filecontent_cache, encoding);
            Pattern pattern = Pattern.compile(reg);// ƥ���ģʽ
            Matcher m = pattern.matcher(filecontent);
            while (m.find()) {
              System.out.println(m.group(1));
//                m.group(1);
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
//            return null;
        }
    }

}
