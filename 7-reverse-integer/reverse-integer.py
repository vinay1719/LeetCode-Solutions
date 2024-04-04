class Solution:
    def reverse(self, x: int) -> int:
        result = 0
        flag = False
        if x < 0:
            x = -x
            flag = True
        while(x>0):
            rem = x%10
            result = result * 10 + rem
            x //= 10
        if result > 2 ** 31 - 1:
            return 0
        if flag:
            return -result
        return result