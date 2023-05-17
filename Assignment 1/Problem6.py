def permuteUnique(nums):
    nums.sort()
    result = []
    visited = [False] * len(nums)

    def backtrack(current):
        if len(current) == len(nums):
            result.append(current)
            return

        for i in range(len(nums)):
            if visited[i] or (i > 0 and nums[i] == nums[i-1] and not visited[i-1]):
                continue

            visited[i] = True
            backtrack(current + [nums[i]])
            visited[i] = False

    backtrack([])
    return result

nums = [1, 1, 2]
permutations = permuteUnique(nums)
print(permutations)
