import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-parques',
  templateUrl: './parques.component.html',
  styleUrls: ['./parques.component.css']
})
export class ParquesComponent implements OnInit {
  @Input() nombre: string;  // input dice q el valor viene de afuera

  public metros: number;
  public vegetacion: string;
  public abierto: boolean;

  constructor() {
      this.nombre='Parque de las Memorias';
      this.metros = 450;
      this.vegetacion = 'Alta';
      this.abierto = true;

     }

  ngOnInit() {
  }

}
