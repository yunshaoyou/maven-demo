package com.yunshao;

import java.io.InputStream;
import java.util.Properties;

import org.apache.commons.lang3.StringUtils;

/**
 * 演示程序：验证 Maven 构建、依赖引入与资源文件读取。
 */
public class App {

    public static void main(String[] args) throws Exception {
        // 1. 直接输出
        System.out.println("Hello Maven!");

        // 2. 使用 commons-lang3 依赖（由 pom.xml 声明、Maven 自动下载）
        String raw = "  maven demo  ";
        System.out.println("trim 前: [" + raw + "]");
        System.out.println("trim 后: [" + StringUtils.trim(raw) + "]");
        System.out.println("首字母大写: " + StringUtils.capitalize(StringUtils.trim(raw)));

        // 3. 读取 src/main/resources 下的配置文件，验证资源目录会被打包进 jar
        Properties props = new Properties();
        try (InputStream in = App.class.getClassLoader()
                .getResourceAsStream("application.properties")) {
            if (in != null) {
                props.load(in);
                System.out.println("资源文件读取成功: app.name=" + props.getProperty("app.name")
                        + ", app.env=" + props.getProperty("app.env"));
            } else {
                System.out.println("资源文件未找到");
            }
        }
    }
}
