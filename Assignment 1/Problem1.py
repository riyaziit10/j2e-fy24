def checking(candies, extraCandies):
    maxCandies = max(candies)
    result = []
    
    for candy in candies:
        if candy + extraCandies >= maxCandies:
            result.append(True)
        else:
            result.append(False)
    
    return result

candies = [2, 3, 5, 1, 3]
extraCandies = 3
result = checking(candies, extraCandies)
print(result)
    