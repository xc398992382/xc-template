### 项目说明
    项目为单模块项目脚手架,目的为开发人员提供一套初始项目,同时保持各业务线代码风格一致性，方便后续维护升级。
    脚手架底层为SpringBoot+Nacos+Mysql+Mybatis Plus
    
    ```
    - SpringBoot 2.3.12.RELEASE
    - Nacos 1.4.2
    - Mybatis Plus 3.5.1
    ``` 

### 模版发布
    1.mvn archetype:create-from-project
    2.进入target/generated-sources/archetype下执行mvn deploy
    
### 模版使用
    mvn archetype:generate \
    -DgroupId=com.juzhun    \
    -DartifactId=juzhun-xx   \
    -Dversion=0.0.1-SNAPSHOT      \
    -Dpackage=com.juzhun.xx   \
    -DarchetypeGroupId=com.juzhun  \
    -DarchetypeArtifactId=juzhun-template-archetype  \
    -DarchetypeVersion=0.0.1-SNAPSHOT  \
    -DinteractiveMode=false  