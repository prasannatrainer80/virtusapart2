interface Product {
    id : number;
    name : string;
    price : number;
    description? : string;
}

const item1 : Product = {
    id : 1,
    name : "Laptop",
    price : 99423
}

console.log(` Item Id ${item1.id}  Item Name ${item1.name} 
    Price ${item1.price} Description ${item1.description} `);