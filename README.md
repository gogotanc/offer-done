# 剑指 Offer 一书题集

最近在看《剑指 Offer》，这里使用 **Java** 解决书中的题目。

## 题目

### 面试题 1：赋值运算符函数

如下为类型 CMString 的声明，请为该类型添加赋值运算符函数。

```c++
class CMString
{
  public:
    CMString(char* pData = Null);
    CMString(const CMString& str);
    ~CMString(void);
  private:
    char* m_pData;
}
```

解答：无

### 面试题 2：实现 Singleton 模式

设计一个类，我们只能生成该类的一个实例。

解答：[代码地址]()

**注意：**使用双重检验锁的方式有很多需要注意的细节，为什么是双重检验，为什么使用 volatile 关键字，详情见[参考文章](#参考文章)第一篇。

### 面试题 3：二维数组的查找

在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。

解答：[代码地址]()

### 面试题 4：替换空格

请实现一个函数，把字符串中的每个空格替换成 ”%20“。例如输入 ”We are happy.“，则输出 ”We%20are%20happy.”。

解答：[代码地址]()

### 面试题 5：从尾到头打印链表



## 参考文章

1. [如何正确地写出单例模式](http://wuchong.me/blog/2014/08/28/how-to-correctly-write-singleton-pattern/)