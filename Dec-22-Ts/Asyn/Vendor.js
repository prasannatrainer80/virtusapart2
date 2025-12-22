"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Vendor = void 0;
var Vendor = /** @class */ (function () {
    function Vendor(vname, billAmount) {
        this.vname = vname;
        this.billAmount = billAmount;
    }
    Vendor.prototype.toString = function () {
        return "Vendor Name ".concat(this.vname, " Bill Amount ").concat(this.billAmount);
    };
    return Vendor;
}());
exports.Vendor = Vendor;
