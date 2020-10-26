frenchDictionary={"we":"Nous","Come":"verront","in":"en","peace":"paix","hello":"bonjour!","can":"puis","i":"je","borrow":"emprunter","some":"des","rockets":"fusee","fuel":"combustible","please":"s'il vous plait","don't":"ne","shoot":"tirer","welcome":"bienvenue","our":"notre","new":"nouveaux/nouvelle","alien":"extraterrestre"}


englishPhrase= input("Please enter an English word or phrase to translate:")
englishWords=englishPhrase.lower().split()
frenchWords=[ ]
for word in englishWords:
    if word in frenchDictionary:
        frenchWords.append(frenchDictionary)
    else:
        frenchWords.append(word)
print("In french, say:"," ".join(frenchWords))
