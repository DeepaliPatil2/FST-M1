
numbersList1 = [22, 40,23,22,10,22]
numbersList2= [23,34,11,12,23,10]
print("First Number list : ", numbersList1)
print("Second Number list : ", numbersList2)

numberList3 = []

for num in numbersList1:
    if (num % 2 != 0):
        numberList3.append(num)
for num in numbersList2:
    if (num % 2 == 0):
        numberList3.append(num)


print("Result List is:")
print(numberList3)