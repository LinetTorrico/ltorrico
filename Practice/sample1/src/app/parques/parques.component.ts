import { Component, OnInit, Input, Output, EventEmitter, OnChanges, SimpleChanges} from '@angular/core';

@Component({
  selector: 'app-parques',
  templateUrl: './parques.component.html',
  styleUrls: ['./parques.component.css']
})
export class ParquesComponent implements OnChanges {
  @Input() nombre: string;  // input dice q el valor viene de afuera
  @Input() metros: number;
  public vegetacion: string;
  public abierto: boolean;
  @Output() pasameLosDatos = new EventEmitter();

  constructor() {
      this.nombre='Parque de las Memorias';
      this.metros = 450;
      this.vegetacion = 'Alta';
      this.abierto = true;
     }
     emitirEvento(){
      this.pasameLosDatos.emit({
        'nombre': this.nombre,
         'metros': this.metros,
       'vegetacion': this.vegetacion,
       'abierto': this.abierto
      })
     }

   ngOnChanges(changes: SimpleChanges){
    console.log(changes);
   }
  ngOnInit() {
  }

}
