import UIKit

var str = "Hello, playground"

let a = 1
let b = 1
let c = 3
// or|| and&& != not equal to
if (a < 4  || b < 4) && c == 3 {
    print("branch 1")
}
else if a <= 8 {
    print("branch 2")
}
else if a >= 10 {
    print("branch 3")
}
else if !(a == 1 && b == 1){
    print("branch 4")
}
else {
    print("nothing was true")
}
