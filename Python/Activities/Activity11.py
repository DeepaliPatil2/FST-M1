
fruitMart = {
    "Banana":44,
    "Mango":70,
    "Kivi":3,
    "Apple": 15
}

FruitCheck = input("Which fruit you want:")

if(FruitCheck in fruitMart):
    print("Yes, this fruit is available")
else:
    print("No, this fruit is not available")