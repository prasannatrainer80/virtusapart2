import { Employ } from "./Employ"

const employs = [
    new Employ(1, "Subham",88423),
    new Employ(2, "Shaili",88124),
    new Employ(3,"Vaishnavi",87311)
]

employs.forEach(x => {
    console.log("Employ No  " +x.empno + " Employ Name " +x.name + " Salary  " +x.salary);
})