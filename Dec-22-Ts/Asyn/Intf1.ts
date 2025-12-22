interface ITraining {
    studentname : string;
    email : string;
}

const data1 : ITraining = {
    studentname: "Rajesh",
    email: "Rajesh@gmail.com"
}

console.log(`Student Name  ${data1.studentname}, Email : ${data1.email} `);