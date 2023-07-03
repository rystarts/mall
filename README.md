1.初始化 构建springboot项目
通过 https://start.spring.io/ 构建项目
可以构建多模块父子项目，更好的管理依赖
2.目标
mybatis 已整合完成
PagerHelper 已整合完成
Swagger 已整合完成
Jasypt 已整合完成
#加密口令

#### 方式一：直接作为程序启动时的命令行参数来带入 java -jar project.jar --jasypt.encryptor.password=xxx

#### 方式二：直接作为程序启动时的应用环境变量来带入VM java -Djasypt.encryptor.password=xxx -jar project.jar

#### 方式三：甚至可以作为系统环境变量的方式来带入 jasypt.encryptor.password=${JASYPT_ENCRYPTOR_PASSWORD:}

#### password: ${JASYPT_ENCRYPTOR_PASSWORD:}

Druid 已整合完成

#### SpringBoot3 无法完全正常使用 Druid , 例如监控页面、密码加密功能

已重新整合 mybatis-plus
已整合使用 mybatis-plus 的分页插件
已使用mybatisx构建了所有业务模块