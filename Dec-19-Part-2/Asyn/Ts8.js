"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var Employ_1 = require("./Employ");
var employs = [
    new Employ_1.Employ(1, "Subham", 88423),
    new Employ_1.Employ(2, "Shaili", 88124),
    new Employ_1.Employ(3, "Vaishnavi", 87311)
];
employs.forEach(function (x) {
    console.log("Employ No  " + x.empno + " Employ Name " + x.name + " Salary  " + x.salary);
});
