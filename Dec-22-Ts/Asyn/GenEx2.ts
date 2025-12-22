function show<T, V>(t : T, v : V) : [T,V] {
    return [t, v];
}

let obj1 = show(1, "Prasanna");
let obj2 = show("Raj",true);
let obj3 = show("Majesh",84245.22);

console.log(obj1);
console.log(obj2);
console.log(obj3);