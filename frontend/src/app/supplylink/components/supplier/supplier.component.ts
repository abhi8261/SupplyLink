import { Component, OnInit } from "@angular/core";
import { Supplier } from "../../types/Supplier";
import { FormBuilder, FormGroup, Validators } from "@angular/forms";
import { Observable, of } from "rxjs";
@Component({
    selector: 'app-supplier',
    templateUrl: "./supplier.component.html",
    styleUrls: ['./supplier.component.scss']
  })
export class SupplierComponent implements OnInit {
    supplierForm: FormGroup;
    suppliers : Supplier []=[];
    supplierSuccess$ : any;
    supplierError$ : any;
    
    supplier: Supplier = new Supplier(1, "Jessica Alba", "jessica@gmail.com", "7368289682", "california", "jessica", "July@12221", "USER");
    constructor(private formBuilder: FormBuilder){

    }
    ngOnInit(): void {
        this.supplierForm=this.formBuilder.group({
            name :['', [Validators.required]],
            email: ['', Validators.required],
            username:['',Validators.required],
            password:['', Validators.required]
        })
    }
    onSubmit(){
        if(this.supplierForm.valid){
            const newSupplier= this.supplierForm.value;
            this.suppliers.push(newSupplier);
            this.supplierSuccess$ ='Supplier added successfully.';
            this.supplierError$='';
        
        }else{
            this.supplierError$='Invalid data.';
            this.supplierSuccess$=''
        }
    }


       
}

