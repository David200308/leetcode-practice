class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        i_f = ''
        a_l = []
        i_int = 0
        for i in digits:
            i_i = str(i)
            i_f = i_f + i_i

        i_int = int(i_f)
        a = i_int + 1

        i_f = str(a)
        i_map = map(int, i_f)
        a_l = list(i_map)

        return a_l