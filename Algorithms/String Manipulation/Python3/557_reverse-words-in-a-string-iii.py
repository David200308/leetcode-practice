class Solution:
    def reverseWords(self, s: str) -> str:
        sSplit = s.split()
        print(sSplit)

        answer = ""

        for i in range(len(sSplit)):
            print(sSplit[i])
            for j in range(len(sSplit[i]) - 1, -1, -1):
                answer += sSplit[i][j]
            
            answer += " "

        answer = answer[:-1]
        return answer