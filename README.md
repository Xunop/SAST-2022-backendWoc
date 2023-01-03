# SAST-2022-backendWoc
SAST 2022 寒假大作战后端 demo

要求：

1、完成 UserController、AdminController 接口

2、建立 GitHub 仓库并提交

文件结构：
```
├─.idea                                   idea的文件夹，不用管
│  └─libraries                            
├─src           						
│  ├─main                                 main目录为主要编写代码的区域
│  │  ├─java                              用于存放代码
│  │  │  └─com
│  │  │      └─example
│  │  │          └─demo
│  │  │              ├─controller         controller层
│  │  │              ├─entity             存放基础的实体类
│  │  │              ├─mapper             mapper层（也叫dao层）
│  │  │              └─service            service层
│  │  └─resources                         用于存放资源文件、配置文件等
│  │      ├─mapper                        存放mapper映射文件
│  │      ├─static
│  │      └─templates
│  └─test                                 测试专用文件夹
│      └─java          
│          └─com
│              └─example
│                  └─demo
└─target                                  项目编译后生成的target文件夹
    ├─classes
    │  ├─com
    │  │  └─example
    │  │      └─demo
    │  │          ├─controller
    │  │          ├─mapper
    │  │          └─service
    │  └─mapper
    ├─generated-sources
    │  └─annotations
    ├─generated-test-sources
    │  └─test-annotations
    └─test-classes
        └─com
            └─example
                └─demo

```

---

数据库：
```sql
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `user_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '用户名',
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '用户密码',
  `email` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '用户邮箱（可选）',
  `role` tinyint NOT NULL COMMENT '用户角色 -1 游客 0 普通用户 1 管理员',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 11 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;
```
