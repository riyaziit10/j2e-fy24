def maxProfit(prices):
    max_profit = 0
    valley = prices[0]

    for i in range(1, len(prices)):
        if prices[i] > valley:
            max_profit += prices[i] - valley
        valley = prices[i]

    return max_profit

prices = [7, 1, 5, 3, 6, 4]
profit = maxProfit(prices)
print(profit)
