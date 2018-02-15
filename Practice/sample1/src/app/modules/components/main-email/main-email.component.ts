import { Component, OnInit, DoCheck } from '@angular/core';

@Component({
  selector: 'app-main-email',
  templateUrl: './main-email.component.html',
  styleUrls: ['./main-email.component.css']
})
export class MainEmailComponent implements OnInit, DoCheck {
    title='Mostrar Email';
    emailContact: String;

  ngOnInit() {

  }

  ngDoCheck(){

  }
}
