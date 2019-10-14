"use strict";

function noSpace(myString){
    // let space = ' ';
  // let array = myString.split(space); 
  // let result = ''; 

    let result = myString.replace(/ /g, '');
    return result;
//
//   for(let i = 0; i < myString.length; i++){
//   let currentChar = myString.charAt(i);
//   if(currentChar != space) 
//     result += currentChar; 
// }
//   for(let string of array){
//     result += string; 
// }
//     return result;
}

document.write(noSpace("Howdy Y'all!"));