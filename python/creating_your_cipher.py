alphabet="ABCDEFGHIKLMNOPQRSTUVWXYZABCDEFGHIKLMNOPQRSTUVWXYZ"
stringToEncrypt= input("Please enter string to encrypt:")
stringToEncrypt=stringToEncrypt.upper()
shiftAmount =int(input("Please enter a whole number from 1-25 to be your key."))
encryptedString=""
for currentCharacter in stringToEncrypt:
    position= alphabet.find(currentCharacter)
    newPosition= position+shiftAmount
    encryptedString=encryptedString+alphabet[newPosition]
    if currentCharacter in alphabet:
        encryptedString=encryptedString+alphabet[newPosition]
    else:
        encryptedString=encryptedString+currentCharacter
print("Your encrypted message is", encryptedString)
#this module crypts the currentCharacter twice for some reason?
#it adds a 'b' for each else character 
