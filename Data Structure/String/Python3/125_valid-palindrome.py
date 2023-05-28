class Solution:
    def isPalindrome(self, s: str) -> bool:
        s = s.lower()
        temp = ""
        for i in range(len(s)):
            if (s[i].isalnum()):
                temp += s[i]
        print(temp)

        left = 0
        right = len(temp) - 1

        while (left < right):
            if not(temp[left] == temp[right]):
                return False
            left += 1
            right = right - 1
        return True
