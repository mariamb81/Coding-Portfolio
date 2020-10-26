console.log('Hello World');

//VARIABLES

//let keyword declares a variabe 

let name = 'Mariam'; //String Literal
let age = 18; //Name Literal
let isApproved = false; //Boolean Literal
let elfName = undefined; 
let selectedColour = null; //Clear the value of a variable
console.log(name);

//Cannot be a reserved keyword 
//Should be meaningful
//Cannot start with a number
//Cannot contain a space or hyphen(-)
//Are case-sensitive

let firstName = 'Mariam', lastName = 'Busari' ; //Not best practice 
//let lastName = 'Busari'

let interestRate = 0.3;
interestRate = 1; 
console.log(interestRate)

//OBJECT
let person = {
    nickname: 'Mari',
    birthMonth: 12
};
console.log(person)

//ARRAYS 
let selectedBeanColour = ['red', 'blue'];
selectedBeanColour[2] = 'green';
console.log(selectedBeanColour.length);

//FUNCTIONS

//Performing a task
//(parameters aka.'name')
function greet(name, lastName) {
    console.log('Hello ' + name + '' + lastName);
}
//Call function
//Mariam = an argument
greet('Mango ', 'Busari');
greet('Mary ', 'Smith');

//calculate a value
function square(number){
    return number * number
}
let number = square(3);
console.log(number);
//console.log(square(3);