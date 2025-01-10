class Solution:
    def isPalindrome(self, x: int) -> bool:
        if x < 0:
            return False

        number = str(x)
        start, end = 0, len(number) - 1

        while start < end:
            if number[start] != number[end]:
                return False
            start += 1
            end -= 1

        return True

