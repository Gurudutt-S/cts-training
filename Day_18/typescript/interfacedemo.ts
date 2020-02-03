interface Person{
    name:string;
    age:number;
}

interface Employee extends Person{
    gender:string;
    empcode:number;
}
let employee=<Employee>{};
employee.name='gds';
employee.age=22;
employee.gender='male';
employee.empcode=19;
console.log('name:  '+employee.name);
