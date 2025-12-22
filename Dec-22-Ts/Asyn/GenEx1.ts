function show <type_parameter> 
    (parameter : type_parameter) : type_parameter {
        return parameter;
}

let res1 = show<string>("Welcome to Typescript Generics...");
let res2 = show<number>(21);
let res3 = show<boolean>(true);

console.log(res1);
console.log(res2);
console.log(res3);