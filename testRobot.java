package cn.snake.test;

import org.junit.Test;
import cn.snake.Robot_my;

import java.awt.*;

public class testRobot {
    public static void main(String[] args) {
        System.out.println("5秒后执行机器人");
        testRobot testRobot = new testRobot();
        for (int i = 1; i <= 260; i++) {
            testRobot.testRobot();
        }

    }
    public void testRobot(){
        Robot_my rb_m = new Robot_my();
        int excel_x = 219;
        int excel_y = 879;
        int thunder_x = 272;
        int thunder_y = 875;
        int thunder_create_x = 255;
        int thunder_create_y = 45;
        int thunder_name_x = 570;
        int thunder_name_y = 345;
        int thunder_download_x = 877;
        int thunder_download_y = 611;
        int desktop_x = 1439;
        int desktop_y = 899;
//        rb_m.mouseOnClick(desktop_x, desktop_y);//显示桌面
//        rb_m.delay(1000);
        rb_m.delay(2000);
//        rb_m.mouseOnClick(excel_x,excel_y); //去到excel的界面
        rb_m.delay(1000);
        rb_m.copy();//复制当前单元格的内容
        rb_m.delay(1000);
        rb_m.mouseOnClick(thunder_x,thunder_y);//去到迅雷的界面
        rb_m.delay(1000);
        rb_m.mouseOnClick(thunder_create_x, thunder_create_y);//点击迅雷创建任务
        rb_m.delay(1000);
        rb_m.paste(); //粘贴url
        rb_m.delay(1000);
        rb_m.mouseOnClick(excel_x,excel_y);//回到excel
        rb_m.delay(1000);
        rb_m.keyboardOnClick(Event.ENTER);
        rb_m.delay(1000);
        rb_m.keyboardOnClick(Event.ENTER);//按下两次才能到达第二行的单元格 进行文件名复制
        rb_m.delay(1000);
        rb_m.copy();//复制文件名
        rb_m.delay(1000);
        rb_m.mouseOnClick(thunder_x,thunder_y);//去到迅雷的界面
        rb_m.delay(1000);
        rb_m.mouseOnClick(thunder_name_x,thunder_name_y);//移动到下载界面编辑名称的文本框并点击
        rb_m.delay(1000);
        rb_m.paste();//粘贴以修改文件名
        rb_m.delay(1000);
        rb_m.mouseOnClick(thunder_download_x, thunder_download_y);//点击下载按钮
        rb_m.delay(1000);
        rb_m.mouseOnClick(excel_x,excel_y); //去到excel的界面
        rb_m.delay(1000);
        rb_m.keyboardOnClick(Event.ENTER);
        rb_m.delay(1000);
        rb_m.keyboardOnClick(Event.ENTER);//按下两次去到下一个视频的url位置

    }
    @Test
    public void testexcel() {
        Robot_my rb_m = new Robot_my();
        int excel_x = 219;
        int excel_y = 879;
        rb_m.mouseOnClick(excel_x,excel_y); //去到excel的界面

    }
}
