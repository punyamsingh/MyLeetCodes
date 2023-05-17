class Solution:
    def findMinMoves(self, machines: List[int]) -> int:
        a=sum(machines)
        b=len(machines)
        if (a % b !=0):
            return -1
        a = a // b
        machines = [i-a for i in machines]
        # L=[sum(machines[:i]) for i in range(b)]
        return max(max(machines),max(map(abs,[sum(machines[:i]) for i in range(b)])))
