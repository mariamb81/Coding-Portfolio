import UIKit

//
// CodeWithChris Learn Swift for Beginners
// http://codewithchris.com/learn-swift
//
// Challenge #1: The Lost Animal Challenge
//
// Instructions: 
// Given the two arrays below, write a function that takes a String as an input parameter and returns a Boolean value. The function should return true if the String input is in either array and it should return false if the String input is in neither array.
//
// Examples:
// Call your function and pass in the String "cat" as the input. Your function should return true
// Call your function and pass in the String "cow" as the input. Your function should return false
 
var array1 = ["dog", "cat", "bird", "pig"]
var array2 = ["turtle", "snake", "lizard", "shark"]
array2 += ["bunny"]
// Write your function below:
func findAnimal(animaltoFind:String)-> Bool{
    let array3 = array2 + array1
    for animal in array3 {
        if animal.lowercased() == animaltoFind.lowercased(){
        return true
        }
    }
    return false
}
findAnimal(animaltoFind: "cat")
findAnimal(animaltoFind: "cow")
