# maven-demo

编程实践（二）实验项目：Maven 构建与 Git 版本控制 / GitHub 团队协作。

## 项目信息

- groupId：`com.yunshao`
- artifactId：`maven-demo`
- version：`1.0.0`
- JDK：17
- 构建工具：Apache Maven 3.9.9（本地仓库 `D:\Maven\repository`，阿里云镜像）

## 目录结构

| 目录 / 文件 | 作用 |
| --- | --- |
| `src/main/java` | 主代码目录，存放 Java 源文件 |
| `src/main/resources` | 资源目录，存放配置文件（`application.properties` 会被打进 jar） |
| `src/test/java` | 测试代码目录，JUnit 单元测试 |
| `pom.xml` | Maven 项目核心描述文件：坐标、依赖、插件、编译参数 |
| `target` | 构建输出目录：class 文件、测试报告、生成的 jar（已被 .gitignore 忽略） |

## 依赖

- `junit:junit:4.13.2`（scope=test，单元测试）
- `org.apache.commons:commons-lang3:3.12.0`（第三方工具库，演示依赖自动下载）

## 常用命令

```bash
mvn clean            # 清理 target
mvn clean compile    # 编译
mvn clean test       # 运行单元测试
mvn clean package    # 打包，生成 target/maven-demo.jar
```

## 运行

```bash
mvn dependency:build-classpath -Dmdep.outputFile=classpath.txt
java -cp "target/classes;$(cat classpath.txt)" com.yunshao.App
```
