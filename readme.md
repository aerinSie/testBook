
#  ** java如何區分 string==null 和 string.equals("")**

## java中預設的equals方法：
比較記憶體位置
```java
public boolean equals(Object obj) {
    return (this == obj);
}
```

## java中String的equals方法：
String類覆寫Object類的equals方法
```java
public boolean equals(Object anObject) {
    if (this == anObject) {
        return true;
    }
    if (anObject instanceof String) {
        String anotherString = (String)anObject;
        int n = count;
        if (n == anotherString.count) {
            char v1[] = value;
            char v2[] = anotherString.value;
            int i = offset;
            int j = anotherString.offset;
            while (n-- != 0) {
                if (v1[i++] != v2[j++])
                    return false;
            }
            return true;
        }
    }
    return false;
}
```
