# VegaLayoutManager
a customized LayoutManager - fade and shrink the head itemView when scrolling. support horizontal & vertical

### 实现效果
![image](https://s2.loli.net/2023/07/27/UVK5rJmWNXFE7IY.png)
<img src="https://github.com/Victor2018/VegaLayoutManager/blob/main/SrceenShot/rendering.gif" width = "275" height = "569"  /><br>

### 代码思路
RecyclerView最顶部的itemView，会随着手指滑动实现收缩隐藏与放大显示，并伴随recycler的回收与复用。<br><br>
代码比较简单粗暴，使用自定义的LayoutManger，内置SnapHelper。<br>
由于想要在任意时刻都能snap到第一个子View，所以在LayoutManager中用了比较讨巧的方法去设定scroll的最大值。

### 使用方法
- Step 1. Add the JitPack repository to your build or setting file

```
build file:
allprojects {
    repositories {
        ...
     maven { url "https://jitpack.io" }
    }
}

or setting file:
dependencyResolutionManagement {
    repositories {
        ...
        maven { url "https://jitpack.io" }
    }
}
```
- Step 2. Add the dependency

```
dependencies {
    implementation 'com.github.Victor2018:VegaLayoutManager:latestVersion'
}
```

- Step 3.  set layoutManager for recyclerView by kotlin
```kotlin
 - 水平方向滚动
    recyclerView.ayoutManager = VegaLayoutManager(VegaLayoutManager.HORIZONTAL)

 - 垂直方向滚动
    recyclerView.ayoutManager = VegaLayoutManager(VegaLayoutManager.VERTICAL)
```

### demo下载
[点击下载](https://github.com/Victor2018/VegaLayoutManager/blob/master/SrceenShot/app-debug.apk?raw=true)

# 关注开发者：
- 邮箱： victor423099@gmail.com
- 新浪微博
- ![image](https://github.com/Victor2018/AppUpdateLib/raw/master/SrceenShot/sina_weibo.jpg)

### 感谢
https://github.com/xmuSistone/VegaLayoutManager

## License

Copyright (c) 2017 Victor

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

