"use strict";
exports.__esModule = true;
var Employee = /** @class */ (function () {
    function Employee(id, name, dob) {
        this.id = id;
        this.name = name;
        this.dob = dob;
    }
    return Employee;
}());
exports.Employee = Employee;
var employee = new Employee(12, 'gds', new Date());
console.log('id: ' + employee.id + ' Name: ' + employee.name + ' Date of birth: ' + employee.dob);
