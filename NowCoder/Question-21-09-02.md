## 3 ng-class是做什么用的？
给元素绑定类名
eg:用法①：
```javascript
// An highlighted block
<div ng-class="{'A':isA,'B':isB,'C':isC}"></div> 
```
 用法②:
```javascript
<div   ng-class = "{{A}}" > </ div >  
```
给元素绑定监听 ng-click等

显示隐藏   ng-show  ng-hide

## 4当使用地图进行图像搜索时，可以把一幅图片从电脑桌面拖放到地图页面的输入框里，这是使用了HTML5的（）API实现的。（      ）
A：DOM window 对象通过 history 对象提供了对浏览器的会话历史的访问，它暴露了很多有用的方法和属性，允许你在用户浏览历史中向前和向后跳转，同时——从HTML5开始——提供了对history栈中内容的操作。详细 API 解读可查看：
[https://developer.mozilla.org/zh-CN/docs/Web/API/History_API](https://developer.mozilla.org/zh-CN/docs/Web/API/History_API)

B：HTML 5 DOM 的 File API 允许 Web 用户选取本地端的文件并读取文件，可以通过选取动作完成，也可通过拖拽动作完成，API 具体使用信息可查看如下链接：
[https://developer.mozilla.org/zh-TW/docs/Web/API/File/Using_files_from_web_applications](https://developer.mozilla.org/zh-TW/docs/Web/API/File/Using_files_from_web_applications)

C：根据我自己的搜索，并没有查询到有 system API，只查询到 FileSystem API ，它与选项B应该指的是同一个API，如果你知道这个 system API ，期待你回复告知我一下，感谢

D：指的就是我们常见的 <img> 标签吧，就不详述了，可查看：[https://developer.mozilla.org/zh-CN/docs/Web/HTML/Element/img](https://developer.mozilla.org/zh-CN/docs/Web/HTML/Element/img)

## 5根据以下代码，两个div元素垂直间距为()
```javascript
<div style="width:100px; height:100px; margin-bottom:100px;"></div>
<div style="width:100px; height:100px; margin-top:200px;"></div>
```
margin值共享，两个上下相邻的盒子，分别设置下上外边距时。取较大值最为公共外边距
所以答案为**200px**

## 7 关于javascript，以下选项描述错误的是
A 在原型上扩展的可枚举方法，会被for in循环出来
B 使用object.defineProperty可向对象添加或者修改属性
C 每个对象都有prototype属性，返回对象类型原型的引用
D 通过hasOwnProperty可判断一个对象以及其原型链上是否具有指定名称的属性
E 原型链是JS实现继承的一种模型
F For循环是按顺序的，for in 循环是不一定按顺序的


**对于 C 选项，题目应该写错了，应该是 [[prototype]]。对于 F 选项，考察 for in 是否按序打印，我理解的按序打印是顺序确定，而不是随机顺序，从这个角度来说，for in 是有序的。具体而已，先以升序方式输出整数属性，然后以加入顺序输出其他属性。所谓整数属性，指的是属性名是整数的字符串的属性，如 '42' 是整数属性，但 '+42', '42abc' 不是。**

## 8在ES6规范中，以下类型哪些属于基本数据类型（）
- 在 ES6 ***有 7 种基本数据类型：undefined、null、Boolean、String、- Number、Object、Symbol
- undefined（未定义）：表示变量未初始化，属性不存在，函数没有返回值
- null（空值）：表示变量为空值
- Boolean（布尔值）：true 或 false
- String（字符串）：单引号字符串 ‘’ 或 双引号字符串 ""
- Number（数值）：范围 [-2^53, 2^53]
- Object（对象）：表示属性的集合，其中每个属性由“名/值对”构成
- Symbol（符号）：表示独一无二（ES6 新增）

## 9 以下说法中正确的是
A  canvas 中绘制的元素不可以通过浏览器提供的接口获取到。

B SVG 中绘制的元素不可以通过浏览器提供的接口获取到。

C html 中 A标签 target 属性的默认取值是 _self，默认在当前窗口打开。
D 为了优化网页的SEO效果，常用 javascript 动态生成网页的title、description、keyword。

A C 对  

## 10以下关于Histroy对象的属性或方法描述正确的是（）
A back回到浏览器载入历史URL地址列表的当前URL的前一个URL
B go表示刷新当前页面
C length保存历史URL地址列表的长度信息
D forward转到浏览器载入历史URL地址列表的当前URL的下一个URL。

选A、D。考察的是 浏览器的内