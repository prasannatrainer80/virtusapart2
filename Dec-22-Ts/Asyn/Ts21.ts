import { Emp } from "./Emp";

var empObj = new Emp(1, "Rajesh",88424.22);

console.log("Employ No " +empObj.getEmpno());
console.log("Employ Name " +empObj.getName());
console.log("Basic  " +empObj.getBasic());

empObj.setEmpno(12);
empObj.setName("Manohar");
empObj.setBasic(84823);

console.log("---------------------");
console.log("values after setting data");
console.log("Employ No " +empObj.getEmpno());
console.log("Employ Name " +empObj.getName());
console.log("Basic  " +empObj.getBasic());
