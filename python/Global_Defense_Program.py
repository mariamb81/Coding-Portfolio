exitChoice="Nothing"
while exitChoice !="EXIT":
    aliens=2
    password="ALIENS"
    print("Quickly! Aliens are invading the planet.")
    print("You need to acivate the global defence platforms.")
    print("Hope you know the password for Earth's sake...")
    print()
    print("------------------------------------------------")
    print("       WELCOME TO GLOBAL DEFENSE NETWORK        ")
    print("------------------------------------------------")
    print()
    guess =input("Please enter password:").upper()
    while guess !=password:
        print()
        print("INCORRECT PASSWORD.")
        print()
        aliens= aliens**2
        print("There are", aliens,"aliens now on Earth.Try again!" )
        if aliens>7400000000:
            break
        print()
        print("Password hint:")
        print("The things that are attacking us!")
        print("ALL CAPS")
        guess = input("Quick! Please enter password:").upper()
    if aliens>7400000000:
        print("Nooooo! The aliens have outnumbered us. All is lost.")
        print("YOU LOSE.")
    else:
        print("Hooray! We won the fight and the world is saved!")
        print()
    exitChoice = input("Press RETURN to play again or type EXIT to leave")
