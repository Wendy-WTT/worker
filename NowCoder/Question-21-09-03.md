## 2 以下—— 不属于把CSS样式表与HTML网页关联的方法。()
![选项](https://img-blog.csdnimg.cn/5fcddc1dcc5944b09ed7af63c4ddf4bf.png?x-oss-process=image/watermark,type_ZHJvaWRzYW5zZmFsbGJhY2s,shadow_50,text_Q1NETiBAa2V2ZW5fZGVuZw==,size_20,color_FFFFFF,t_70,g_se,x_16)

答案 ：
**A明显的是注释**
link引入css
@import引入样式表
内敛样式
style表里面添加样式

## 4以下代码执行后，console 输出的信息是？
```javascript
for(var i = 0; i < 5; i++){
requestAnimationFrame(() => console.log(i));
}
```
![我的错误答案](https://img-blog.csdnimg.cn/c21bdfe09815495d8f0a65a1f59fa319.png?x-oss-process=image/watermark,type_ZHJvaWRzYW5zZmFsbGJhY2s,shadow_50,text_Q1NETiBAa2V2ZW5fZGVuZw==,size_20,color_FFFFFF,t_70,g_se,x_16)
正确的解释：**因为request是异步，所以for循环先执行完成（此时i=5）再执行request，**

## 7写出程序运行的结果（）
```javascript
var k = 0;
for(var i=0,j=0;i<10,j<6;i++,j++){
    k += i + j;
}
console.log(k)

```
![我的答案](https://img-blog.csdnimg.cn/f9c1f816b9754ab0af5841191df53625.png?x-oss-process=image/watermark,type_ZHJvaWRzYW5zZmFsbGJhY2s,shadow_50,text_Q1NETiBAa2V2ZW5fZGVuZw==,size_20,color_FFFFFF,t_70,g_se,x_16)
考察知识点：**逗号表达式只有最后一项是有效的**，即对于i<10,j<6; 来说，判断循环是否结束的是 j < 6；而对于 j<6,i<10; 来说，判断循环是否结束的是 i < 10。

## 8 angularjs1中服务的正确写法是？![我的答案](https://img-blog.csdnimg.cn/bdedee2e518940c0b179ada1da4b708d.png?x-oss-process=image/watermark,type_ZHJvaWRzYW5zZmFsbGJhY2s,shadow_50,text_Q1NETiBAa2V2ZW5fZGVuZw==,size_20,color_FFFFFF,t_70,g_se,x_16)
瞎选的，我都还没学过anularjs
答案：**service是服务的意思，server是服务器，伺候者，发球员。通过字面意思可以做出选择，容易错选B。**

## 9 判断对象myObj是否存在的写法，下面说法错误的是( )
![我的答案](https://img-blog.csdnimg.cn/26437423e940473c93ab4f32eedf5cdf.png?x-oss-process=image/watermark,type_ZHJvaWRzYW5zZmFsbGJhY2s,shadow_50,text_Q1NETiBAa2V2ZW5fZGVuZw==,size_20,color_FFFFFF,t_70,g_se,x_16)
前提是myobj是一个对象，只是存在与不存在的问题，几种表示方法：
1、！obj
2、！window.obj
3、typeof myObj == "undefined（判断对象是否有定义，已定义未赋值，返回true）
4、myObj == undefined（已定义未赋值。返回true）
5、myObj === undefined （已定义未赋值，返回true）
6、!this.hasOwnProperty('myObj'))（判断是否为顶层对象的一个属性）
7、myobj == null（注意null与undefined的区别，ull指的是已经赋值为null的空对象，即这个对象实际上是有值的，而undefined指的是不存在或没有赋值的对象。）
以上几种都正确，但是我用的最多争议最少的是第三种

## 10  下面说法正确的有( )
![我的答案](https://img-blog.csdnimg.cn/8eaa7ff207e54b4080cefcb1f057637d.png?x-oss-process=image/watermark,type_ZHJvaWRzYW5zZmFsbGJhY2s,shadow_50,text_Q1NETiBAa2V2ZW5fZGVuZw==,size_20,color_FFFFFF,t_70,g_se,x_16)
**答案：**
1. p元素不能包含任何块级元素(包括自身)
2. a元素可以包含任何其他元素(除了自身)
3. document是文档(整个DOM树)的根节点
