"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Emp = void 0;
var Emp = /** @class */ (function () {
    function Emp(empno, name, basic) {
        this._empno = empno;
        this._name = name;
        this._basic = basic;
    }
    Emp.prototype.getEmpno = function () {
        return this._empno;
    };
    Emp.prototype.setEmpno = function (empno) {
        this._empno = empno;
    };
    Emp.prototype.getName = function () {
        return this._name;
    };
    Emp.prototype.setName = function (name) {
        this._name = name;
    };
    Emp.prototype.getBasic = function () {
        return this._basic;
    };
    Emp.prototype.setBasic = function (basic) {
        this._basic = basic;
    };
    return Emp;
}());
exports.Emp = Emp;
