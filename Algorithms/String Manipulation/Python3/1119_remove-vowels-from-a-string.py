class Solution:
    def removeVowels(self, s: str) -> str:
        answer = ""
        temp = list(s)
        for i in range(len(temp)):
            if not(temp[i] == "a" or temp[i] == "e" or temp[i] == "i" or temp[i] == "o" or temp[i] == "u"):
                answer += s[i]

        return answer