import { Component, OnInit, DoCheck } from '@angular/core';

@Component({
  selector: 'app-contact',
  templateUrl: './contact.component.html',
  styleUrls: ['./contact.component.css']
})
export class ContactComponent implements OnInit, DoCheck {
  title='Contacto';
  emailContacto:string;
  constructor() { }

  ngOnInit() {
  }
  ngDoCheck(){
    //this.emailContacto = localStorage.getItem('emailContacto');
  }
  guardarEmail(){
    localStorage.setItem('emailContacto', this.emailContacto);
    console.log(localStorage.getItem('emailContacto'));
  }
  eliminarEmail(){
    localStorage.removeItem('emailContacto');
    localStorage.clear();
    this.emailContacto=null;
  }
}
