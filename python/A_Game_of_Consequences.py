import random
woman = ["A scientist", "A queen", "A pirate", "A giant rabbit"]
man=["A police officer", "an artist", "Your grandfather", "a killer robot."]
place= ["on Pluto", "at the super market", "in a spooky, bat filled cave."]
sheWore=["scaba diving gear.", "fairy wings", "a paper bag."]
heWore=["a purple suit.", "a shark costume.", "a beach towel."]
womanSays=["'Who are you?'", "'How many beans make five'","'Why?'"]
manSays=["'Beep boop!'", "'Don't eat frogs!'","'What time do you call this?'"]
consequence=["world peace", "chaos", "a giant foot squashed them.", "rainbows."]
worldSaid=["'Errant nonsense'", "'Cheese is trending now.'", "I'm melting!"]
"""
while True:
    print("She was wearing",random.choice(sheWore))
    print("He was wearing", random.choice(heWore))
    print("She said,", random.choice(womanSays))
    print("He said,", random.choice(manSays))
    print("The consequence was,", random.choice(consequence))
    print("The world said,", random.choice(worldSaid))
    print()
    print("Press enter to play again")
    print()
"""    

exitChoice="Nothing"
while exitChoice !="EXIT":
    print("She was wearing",random.choice(sheWore))
    print("He was wearing", random.choice(heWore))
    print("She said,", random.choice(womanSays))
    print("He said,", random.choice(manSays))
    print("The consequence was,", random.choice(consequence))
    print("The world said,", random.choice(worldSaid))

exitChoice=input("Press return to play again or press exit to leave")


"""
This was not working for me 
while True
print()
print("Press enter to play again")
print()
"""
