
def sumCalculation(number):
    if number:
        return number + sumCalculation(number-1)
    else:
        return 0
result = sumCalculation(10)
print(result)