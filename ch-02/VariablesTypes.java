public class VariablesTypes {
	public static void main(String[] args) {
    // 基本型別
    byte byteValue = 100;
    short shortValue = 1000;
    int intValue = 10000;
    long longValue = 100000L;
    float floatValue = 3.14f;
    double doubleValue = 3.14159;
    char charValue = 'm';
    boolean booleanValue = true;

    // 參考型別
    String name = "test";
    Integer intObj = 100;
    Double doubleObj = 3.14;
    Boolean boolObj = true;
    int[] numbers = {1, 2, 3, 4, 5};
    String[] names = {"Alice", "Bob", "Charlie"};

    // 將字串轉換為數值類型
    int num1 = Integer.parseInt("100");        // 將字串 "100" 轉換為整數 100
    long num2 = Long.parseLong("100");         // 將字串 "100" 轉換為長整數 100L
    float num3 = Float.parseFloat("100.0");    // 將字串 "100.0" 轉換為單精度浮點數 100.0f
    double num4 = Double.parseDouble("100.0"); // 將字串 "100.0" 轉換為雙精度浮點數 100.0

    // 將數值轉換為字串類型
    String str1 = String.valueOf(100);    // 將整數 100 轉換為字串 "100"
    String str2 = String.valueOf(100L);   // 將長整數 100L 轉換為字串 "100"
    String str3 = String.valueOf(100.0f); // 將單精度浮點數 100.0 轉換為字串 "100.0"
    String str4 = String.valueOf(100.0);  // 將雙精度浮點數 100.0 轉換為字串 "100.0"

    // 自增運算子示例
    int pig = 2;
    int a = pig++; // 先把 pig 的值 2 賦值給 a, 然後 pig 自增變成 3
    int b = ++pig; // 先把 pig 自增變成 4, 然後把 pig 的值 4 賦值給 b
    int c = pig--; // 先把 pig 的值 4 賦值給 c, 然後 pig 自減變成 3
    int d = --pig; // 先把 pig 自減變成 2, 然後把 pig 的值 2 賦值給 d
	}
}