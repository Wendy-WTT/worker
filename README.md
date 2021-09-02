# worker

你好！打工人！

本仓库建立目标：`刷题、巩固基础、进厂`。

范围：涉及Leetcode面试常见算法题，数据结构实现，后端设计模式，牛客网面试基础题以及git和github的使用，使用语言不限。

刷题网址：
1. https://www.nowcoder.com/intelligentTest 
2. https://leetcode-cn.com/problemset/all/

KPI：每天一道算法题，每天10道牛客基础面试题（当前）

### 一、分支管理

`本小节只提供了部分的git使用命令，更多git使用命令，需要各位自己学习。本小节给的命令就是最常用的命令，遇到问题百度`

每位成员按以下操作进行分支管理

```bash
# 1. 克隆项目到本地
git clone git@github.com:CQUST-SOITAE/worker.git

# 2. 任意编辑器打开

# 3. 在编辑器终端中，创建自己的分支，xxx起自己的名字缩写，或者英文名
git branch xxx

# 4. 选择创建的分支
git checkout xxx

# 5. 编写自己的代码

# 6. 编写完后，添加文件，推荐第二种，如果是完成某个板块的所有功能，那么推荐第一中
git add .
git add 具体文件名称

# 7. 提交文件，并写清楚提交信息
# windows系统
git commit -m "详细信息"
# linux系统
git commit -m '详细信息'
 
# 8. 向远程仓库提交自己的分支，也就是自己创建的分支名称
git push origin xxx

```

### 二、文件目录名

文件目录结构有自己自定义，但推荐：

```xml
|-你名字
|--Leetcode
|----easy
|------Code207.java
|------Code207.js
|------Code207.py
|----mid
|------Code208.java
|------Code208.js
|------Code208.py
|----hard
|------Code208.java
|------Code208.js
|------Code208.py
```

### 三、文件命名

LeetCode上的题，每个题都是有编号的，因此命名就以Code+编号为名称。

### 四、代码规范

每个人提交的代码格式，推荐是这样的：

```java

/**
 * 本题介绍：（直接复制粘贴题目）
 * @author xxx
 **/
public class Code207{

    /**
     * 解题思路：
    **/
}

```

### 五、其他常用git命令


```bash
# 查看git 信息
git status 
# 克隆某个项目
git clone xxx 
# 查看分支情况
git branch -v 
# 创建分支
git branch [分支名] 
# 选择分支
git checkout [分支名] 
# 添加所有的文件
git add . 
# 提交某个文件并写好提交信息
git commit -m "提交信息" [某文件]（执行过add，则不填某文件名） 
# 查看远程地址
git remote -v 
# 为本地仓库添加远程连接
git remote add [别名] [地址] 
# 推送本地到远程仓库
git push [别名] [分支名] 
# 删除远程仓库地址
git remote rm origin 
# 将远程仓库文件拉去下来，但不合并
git fetch origin master 
# 将远程仓库master合并在本地
git merge origin/master master
# 将远程仓库的master合并到本地
git pull origin master 

# 合并分支的操作
# 切换到接受修改的分支上（被合并的分支），再执行merge。例如：将hot_fix合并到master上
git checkout master
git merge hot_fix
```








