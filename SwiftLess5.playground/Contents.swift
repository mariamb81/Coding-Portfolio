import UIKit

var str = "Hello, playground"

//for index in 1...5{
    print("Hello")
//}
//if not using index use underscore
for _ in 1...5{
    print("Hello")
}

for index in 1...5{
    var sum  = 0
    //sum = sum + index -> short form-> sum += index
    sum += index
    print(sum)
    
}
//While loops

var counter = -5

while counter > 0 {
    print("hello there")
    counter -= 1
}

//Repeat While Loops

repeat{
    print("hello")
    counter = counter - 1
} while counter > 0
