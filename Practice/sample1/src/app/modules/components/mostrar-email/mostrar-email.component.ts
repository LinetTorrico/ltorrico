import { Component, OnInit, DoCheck } from '@angular/core';

@Component({
  selector: 'app-mostrar-email',
  templateUrl: './mostrar-email.component.html',
  styleUrls: ['./mostrar-email.component.css']
})
export class MostrarEmailComponent implements OnInit, DoCheck {
  title='Mostrar email';
  emailContact:String;

  constructor() { }

  ngOnInit() {
  }
  ngDoCheck(){


  }
}
