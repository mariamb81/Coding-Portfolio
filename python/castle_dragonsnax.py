print("You are in a dark room in a mysterious castle...")
print("In front of you there are three doors. You must choose one.")
playerChoice =input("Choose 1, 2 or 3")
if playerChoice=="1":
    print("You find a room full of treasures. You're rich")
    print("GAME OVER, YOU WIN!")
elif playerChoice=="2":
    print("The door opens and a angry ogre hits you with his club.")
    print("GAME OVER, YOU LOSE!")
elif playerChoice=="3":
    print("You go into a room and find a sleeping dragon")
    print("The dragon wakes up and eats you. You are delicious.")
    print("GAME OVER, YOU LOSE!")
else:
    print("Sorry, you didn't enter 1,2 or 3!")
    print("Run the game again and have another go.")
