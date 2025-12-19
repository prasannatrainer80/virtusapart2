export class Vendor {
    private readonly vname : string;
    public billAmount : number;

    constructor(vname : string, billAmount : number) {
        this.vname = vname;
        this.billAmount = billAmount;
    }

    toString() : string {
        return `Vendor Name ${this.vname} Bill Amount ${this.billAmount}`;
    }
}