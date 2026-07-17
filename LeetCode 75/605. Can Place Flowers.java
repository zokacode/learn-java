class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length;
        
        // 遍歷每個位置，能種就種
        for (int i = 0; i < len && n > 0; i++) {
            // 條件：當前為空 & 左邊無花 & 右邊無花
            if (flowerbed[i] == 0
                && (i == 0 || flowerbed[i - 1] == 0)      // 左邊是邊界或為空
                && (i == len - 1 || flowerbed[i + 1] == 0)) { // 右邊是邊界或為空
                flowerbed[i] = 1;  // 種花
                n--;               // 還需種的數量-1
                i++;               // 跳過下一個位置（相鄰不能種）
            }
        }
        
        return n == 0;  // n歸0代表成功種完
    }
}
