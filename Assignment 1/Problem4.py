def nextPermutation(nums):
    n = len(nums)
    i = n - 1
    
    while i > 0 and nums[i-1] >= nums[i]:
        i -= 1
    
    if i > 0:
        j = n - 1
        while j >= i and nums[j] <= nums[i-1]:
            j -= 1
        nums[i-1], nums[j] = nums[j], nums[i-1]
    
    left = i
    right = n - 1
    
    while left < right:
        nums[left], nums[right] = nums[right], nums[left]
        left += 1
        right -= 1

nums = [1, 2, 3]
nextPermutation(nums)
print(nums) 

