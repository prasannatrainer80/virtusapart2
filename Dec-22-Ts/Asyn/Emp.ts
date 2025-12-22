export class Emp {
    private _empno : number;
    private _name : string;
    private _basic : number;

    constructor(empno : number, 
            name : string, 
            basic : number) {
        this._empno = empno;
        this._name = name;
        this._basic = basic;
    }

    getEmpno() : number {
        return this._empno;
    }

    setEmpno(empno : number) {
        this._empno = empno;
    }

    getName() : string {
        return this._name;
    }

    setName(name : string) {
        this._name = name;
    }

    getBasic() : number {
        return this._basic;
    }

    setBasic(basic : number) {
        this._basic = basic;
    }

}