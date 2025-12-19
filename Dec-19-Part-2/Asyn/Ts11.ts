const greeting = (firstName : string, lastName : string, city : string = "Hyderabad") => {
    return "First Name " +firstName + " Last Name " +lastName + " City  " +city;
}

console.log(greeting("Shaili","Sunku"));
console.log(greeting("Lokesh","Punwani","Delhi"));