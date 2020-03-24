from collections import Counter


def solution(nums):
    return int(len(nums) / 2) if len(Counter(nums)) > len(nums) / 2 else len(Counter(nums))
#     return min(len(nums)/2, len(set(ls)))


nums = [3, 1, 2, 3]
print(solution(nums))
