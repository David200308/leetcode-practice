class Solution:
    def licenseKeyFormatting(self, s: str, k: int) -> str:
        answer = ""
        temp = s.upper().replace("-", "")
        
        tempLen = len(temp) % k

        answer = temp[:tempLen]

        print(answer)

        for i in range(tempLen, len(temp), k):
            if (answer):
                answer += "-"
            answer += temp[i:i+k]

        return answer

