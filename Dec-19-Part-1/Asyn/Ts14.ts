import { User } from "./User";

let user = new User()

const show = (user : User) => {
    console.log(`Hello...${user.userName ?? "Guest"}`);
    console.log(`Password...${user.passCode ?? "No Password"}`);
    if(user.userName===undefined){
        user.utype = "Anonymous User...";
    } else {
        user.utype = "Authorized User...";
    }
    console.log(user.utype);
}

show(user);