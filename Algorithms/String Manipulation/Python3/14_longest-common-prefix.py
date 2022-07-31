class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        s_list = []
        w_list = []

        # for i 
        w = strs[0]

        for i in range(len(w)):
            flag = True
            for j in range(1, len(strs)):
                if len(strs[j]) < i + 1:
                    flag = False
                    break
                elif w[i] != strs[j][i]:
                    return "".join(w_list)

            if flag == True:
                w_list.append(w[i])



        return "".join(w_list)