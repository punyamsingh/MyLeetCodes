class Solution:
    def finalValueAfterOperations(self, operations: List[str]) -> int:
        sum=len(operations)
        for x in operations:
            if x[1]=="-":
                sum-=2
        return sum
