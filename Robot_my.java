package cn.snake;

import java.awt.*;
import java.awt.event.KeyEvent;  

public class Robot_my {
    private static Robot robot ;
    static{
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

  
    public void copy(){
    	// 复制URL操作
        robot.keyPress(KeyEvent.VK_CONTROL );
		robot.keyPress(KeyEvent.VK_C);
        robot.delay(200);
        robot.keyRelease(KeyEvent.VK_C);
        robot.keyRelease(KeyEvent.VK_CONTROL );
        robot.delay(200);  

	}

	 public void mouseOnClick(int x,int y){  
        //因为会自动跳出下载界面  返回excel  坐标待确定
        robot.mouseMove(x,y);
        robot.mousePress(KeyEvent.BUTTON1_MASK);
         robot.mouseRelease(KeyEvent.BUTTON1_MASK);
        robot.delay(200);  
    }


    public void keyboardOnClick(int keycode){
    	//按下Tab键 切换到下个单元格  "这里要回去看源码"
        robot.keyPress(keycode);
        robot.delay(200);
        robot.keyRelease(keycode);
        robot.delay(200);
    }


    public void paste(){
		robot.keyPress(KeyEvent.VK_CONTROL );
		robot.keyPress(KeyEvent.VK_V);
        robot.delay(200);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL );
        robot.delay(200);  
    }

    public void delay(int delays) {
        robot.delay(delays);
    }
}
