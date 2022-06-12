class Solution:
    def isPalindrome(self, x: int) -> bool:
        x_list = list(str(x))

        for i in range(len(x_list)):
            if x_list[i] == x_list[- (i + 1)]:
                answer = True
                continue
            else:
                answer = False
                break
        return answer