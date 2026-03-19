### 基本型別 (Primitive Types)

基本型別是語言內建、直接儲存值的型別（非物件）。
Java 有 8 種基本型別：byte、short、int、long、float、double、char、boolean。

重點：
- 儲存語意：變數直接持有值(通常在 stack 或 JVM 儲存區), 非參考物件。
- 預設值：欄位(field)有預設值(數值型為 0、char 為 '\u0000'、boolean 為 false), *區域變數則需先賦值才能使用。
- 型別與範圍：整數(byte, short, int, long)、浮點(float, double)、字元(char，16-bit Unicode)、布林(boolean)。
- 文字常數(literals)：
  - 整數：
    - int 十進位 123、十六進位 0x7B、二進位 0b1111011
    - long 123L (需後綴 L)。
  - 浮點：
    - double 3.14，
    - float 3.14F (需後綴 F)。
  - 字元：'A'、'\n'、'\u4F60'。
  - 布林：true / false。
- 型別轉換：
  - 自動提升(widening)安全：byte -> short -> int -> long -> float -> double。
  - 需要顯式轉型(narrowing)：double -> int 等需 cast（例如 (int) d）。
- 自動裝箱/拆箱：基本型別與對應包裝類別（Integer, Long, Double, ...）間可自動轉換（autoboxing/unboxing）。

範例：
```java
int n = 100;
long L = 1_000L;
double d = 3.14;
float f = 3.14F;
char c = '中';
boolean ok = true;

int small = (int) 3.9; // narrowing cast
Integer boxed = n;     // autoboxing
int unboxed = boxed;   // unboxing
```

| 類型   | 型別  | 大小 (bits) | 預設值 | 範圍說明 |
| ------ | ----- | ------ | ------ | ------ |
| 整數   | byte  | 8           | 0      | -128 ~ 127                                             |
| 整數   | short | 16          | 0      | -32,768 ~ 32,767                                       |
| 整數   | int   | 32          | 0      | −2,147,483,648 (約 −2×10<sup>9</sup>) ~ 2,147,483,647 (約 2×10<sup>9</sup>)  |
| 整數   | long  | 64          | 0L     | −9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807 |
| 浮點數 | float | 32          | 0      | 1.4×10<sup>−45</sup> ~ 3.4×10<sup>38</sup> |
| 浮點數 | float | 32 | 0 | 4.9×10<sup>−324</sup> ~ 1.8×10<sup>308</sup> |
| 字元 | char | 16 | '\u0000' | \u0000 (0) ~ \uffff (65,535) |
| 布林 | boolean | 8 | false | true or false |

---

### 參考型別 (Reference Types)

參考型別變數儲存的是物件的記憶體位址參考，而不是物件本身的值。

核心概念：
- 儲存方式
  - 不直接儲存物件值, 而是儲存物件在記憶體(heap)中的參考位址
  - 物件實際資料存在 heap 記憶體中
- 常見參考型別：
  - 類別(class)：如 String、Object
  - 介面(interface)
  - 陣列(array)
  - 列舉(enum)

重點：
- 儲存位置：物件實例在 heap，變數儲存參考（pointer-like）
- 預設值：null(表示不指向任何物件)
- 比較：
  - == 比較參考是否相同(同一個物件)
  - equals() 比較物件邏輯相等(類別可覆寫)
- 型別轉換(casting)：
  - 向上轉型：子類別 → 父類別(自動)
  - 向下轉型：父類別 → 子類別(需明確轉型)
  - instanceof：檢查物件是否為某個類別的實例
- 記憶體管理：Java 使用垃圾回收(GC), 當無參考指向物件時可被回收。
- 方法傳遞：方法呼叫時傳遞的是參考的值(pass-by-value of reference), 不是傳遞物件本身。

範例：
```java
String a = "hi";             // 指向字串常量池
String b = new String("hi"); // 在 heap 創建新物件

System.out.println(a == b);       // false（不同參考）
System.out.println(a.equals(b));  // true（內容相等）

int[] arr = new int[3]; // 陣列也是參考型別
Object obj = null;      // 可為 null

if (obj instanceof String) {
  String s = (String) obj; // 安全轉型前先檢查
}
```