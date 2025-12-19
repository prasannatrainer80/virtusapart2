export class Agent {
    public firstName : string;
    public lastName : string;
    public city : string;
    public state : string;

    constructor({
        city,
        state,
        firstName,
        lastName
    }: {
        city: string;
        state: string;
        firstName: string;
        lastName: string;
    }) {
        this.city = city;
        this.state = state;
        this.firstName = firstName;
        this.lastName = lastName;
    }


    show = () => {
        console.log(`First Name ${this.firstName} 
                Last Name ${this.lastName} 
                City ${this.city}
                State ${this.state}
            `)
    }
}