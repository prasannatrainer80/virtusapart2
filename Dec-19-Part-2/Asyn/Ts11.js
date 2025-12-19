var greeting = function (firstName, lastName, city) {
    if (city === void 0) { city = "Hyderabad"; }
    return "First Name " + firstName + " Last Name " + lastName + " City  " + city;
};
console.log(greeting("Shaili", "Sunku"));
console.log(greeting("Lokesh", "Punwani", "Delhi"));
