import { Component, DoCheck, OnInit } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements DoCheck, OnInit {
  title = 'Curso de angular ';
  emailContacto : string;
ngOnInit(){
  //this.emailContacto = localStorage.getItem('emailContacto');
}
  ngDoCheck(){
this.emailContacto = localStorage.getItem('emailContacto');
  }
}
