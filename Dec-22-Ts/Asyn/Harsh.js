"use strict";
var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
Object.defineProperty(exports, "__esModule", { value: true });
exports.Harsh = void 0;
var AbsEx1_1 = require("./AbsEx1");
var Harsh = /** @class */ (function (_super) {
    __extends(Harsh, _super);
    function Harsh() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    Harsh.prototype.name = function () {
        console.log("Name is Harsh...");
    };
    Harsh.prototype.email = function () {
        console.log("Email is harsh@gmail.com");
    };
    return Harsh;
}(AbsEx1_1.Training));
exports.Harsh = Harsh;
