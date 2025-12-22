"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Agent = void 0;
var Agent = /** @class */ (function () {
    function Agent(_a) {
        var city = _a.city, state = _a.state, firstName = _a.firstName, lastName = _a.lastName;
        var _this = this;
        this.show = function () {
            console.log("First Name ".concat(_this.firstName, " \n                Last Name ").concat(_this.lastName, " \n                City ").concat(_this.city, "\n                State ").concat(_this.state, "\n            "));
        };
        this.city = city;
        this.state = state;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    return Agent;
}());
exports.Agent = Agent;
