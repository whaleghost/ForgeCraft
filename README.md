# ForgeCraft

基于 [NeoForge](https://neoforged.net/) 的 Minecraft 1.21.1 模组。

- Mod ID：`forgecraft`
- 主类：`com.forgecraft.ForgeCraft`
- 版本：`0.1.0`

## 环境要求

- JDK 21
- 无需单独安装 Gradle，项目自带 Gradle Wrapper

## 常用命令

| 命令 | 说明 |
| --- | --- |
| `gradlew build` | 构建模组，产物输出到 `build/libs/` |
| `gradlew runClient` | 启动客户端开发环境 |
| `gradlew runServer` | 启动服务端开发环境 |
| `gradlew runData` | 运行数据生成器 |

## 项目结构

```text
src/main/java/com/forgecraft/   模组源码
src/main/resources/             资源文件（语言、模型、纹理等）
src/main/templates/             neoforge.mods.toml 模板
src/generated/resources/        数据生成器输出
```

## 文档

- [NeoForge 文档](https://docs.neoforged.net/)
- [ModDevGradle](https://github.com/neoforged/ModDevGradle)
