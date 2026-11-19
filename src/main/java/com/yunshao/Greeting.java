package com.yunshao;

/**
 * 合作者新增的示例类：模拟团队协作中的功能开发。
 */
public class Greeting {

    private String owner;

    public Greeting(String owner) {
        this.owner = owner;
    }

    public String welcome() {
        return "欢迎使用 " + owner + " 的 Maven 项目！";
    }

    public String version() {
        return "v1.1.0（由合作者提交）";
    }
}
