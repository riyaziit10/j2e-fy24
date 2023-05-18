def maxArea(height):
    n = len(height)
    left = 0
    right = n - 1
    maxArea = 0
    
    while left < right:
        currentArea = (right - left) * min(height[left], height[right])
        maxArea = max(maxArea, currentArea)
        
        if height[left] < height[right]:
            left += 1
        else:
            right -= 1
    
    return maxArea

height = [1, 8, 6, 2, 5, 4, 8, 3, 7]
max_water = maxArea(height)
print(max_water)
