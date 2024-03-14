# Github-Practice
这是一个供我练习git和github一些操作的仓库。

## v1.0 练习如何创建仓库并关联到本地仓库
1. 先在github上创建一个仓库，获取URL。
2. 在本地创建仓库(git init)，并使用：
   ```git
   git remote add [shortname] [URL]
   ```
   将本地仓库关联到远程仓库
3. 使用命令
   ```git
   git fetch [shortname]
   ```
   便可以拉取仓库的信息。
   这一步是很有必要的。因为在本地创建仓库时，默认分支是master。
   然而在github中，默认分支是main。所以在拉取后，需要
   ```git
   git checkout main
   ```
   来切换到main分支。
4. 上传文件
   使用
   ```
   git add [file]
   ```
   以及
   ```
   git commit
   ```
    将文件提交到本地仓库。
    然后再使用
    ```
    git push [remote] [branch]
    ```
    就可以将本地项目上传到远程仓库了。