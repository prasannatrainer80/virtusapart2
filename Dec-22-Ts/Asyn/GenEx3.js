"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.GenEx3 = void 0;
var GenEx3 = /** @class */ (function () {
    function GenEx3() {
        this.store = new Map();
    }
    GenEx3.prototype.set = function (key, value) {
        this.store.set(key, value);
    };
    GenEx3.prototype.get = function (key) {
        return this.set.arguments(key);
    };
    return GenEx3;
}());
exports.GenEx3 = GenEx3;
var obj1 = new GenEx3();
obj1.set(1, "Prasanna");
var obj2 = new GenEx3();
obj2.set("Raj", true);
