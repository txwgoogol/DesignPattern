package top.txwgoogol.designpattern.template.model;

/**
 * 抽象的电脑类
 * Created by txwgoogol on 2018/1/18.
 */
public abstract class AbstractComputer {

    protected void powerOn() {
        System.out.println("开启电源");
    }

    protected void checkHardware() {
        System.out.println("硬件检查");
    }

    protected void loadOS() {
        System.out.println("载入操作系统");
    }

    protected void login() {
        System.out.println("小白的计算机无验证，直接进入系统");
    }

    /**
     * 启动计算机方法，步骤固定为开启电源、系统检查、加载操作系统、用户登录。该方法为final，防止算法框架被覆写
     */
    public final void startUp() {
        System.out.println("开机 START");
        powerOn();
        checkHardware();
        loadOS();
        login();
        System.out.println("开机 END");
    }

}
