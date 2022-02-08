
input1 = input("Enter Player 1's name ")
input2 = input("Enter  Player 2's name ")
answer1 = input(input1 + ", do you want to choose rock, paper or scissors? ").lower()
answer2 = input(input2 + ", do you want to choose rock, paper or scissors? ").lower()

if answer1 == answer2:
    print("It's a tie!")
elif answer1 == 'rock':
    if answer2 == 'scissors':
        print("Rock wins!")
    else:
        print("Paper wins!")
elif answer1 == 'scissors':
    if answer2 == 'paper':
        print("Scissors win!")
    else:
        print("Rock wins!")
elif answer1 == 'paper':
    if answer2 == 'rock':
        print("Paper wins!")
    else:
        print("Scissors win!")
else:
    print("Invalid input..You have not entered rock, paper or scissors")