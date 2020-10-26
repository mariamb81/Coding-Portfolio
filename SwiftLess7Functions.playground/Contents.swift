import UIKit

//Functions

// func name (){}

func addTwoNumbers(){
    let a = 2
    let b = 2
    let c = a + b
    
    print(c)
}
func substractTwoNumbers(){
    let d  = 1
    let a = 0
    let e = a - d
    print(e)
}
addTwoNumbers()

addTwoNumbers()

//Functions part 2
//Functions have a return value
// after() -> DataType
//Parameters(in between parentheses)
//Syntax: func name (argumentLabel parameterName: DataType){}/
//Syntax mult. para: func name(arg1 param1:DataType, arg2 param2:DataType){}

func name(_ number1:Int, _ number2:Int) -> Int{
    //let air = number1
    //let bat = number2
    //let cat = air + bat
    return number1 + number2
}

let sum = name(2, 3)
print(sum)

