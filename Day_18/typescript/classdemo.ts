export class Employee{
    id:number;
    name:string;
    dob:Date;

    constructor(id:number,name:string,dob:Date){
        this.id=id;
        this.name=name;
        this.dob=dob;
    }

}

let employee=new Employee(12,'gds',new Date());
console.log('id: '+employee.id+' Name: '+employee.name+ ' Date of birth: '+employee.dob);
