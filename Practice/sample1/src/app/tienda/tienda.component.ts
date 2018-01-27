import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-tienda',
  templateUrl: './tienda.component.html',
  styleUrls: ['./tienda.component.css']
})
export class TiendaComponent implements OnInit {
  public titulo;
  public nombreDelParque: string;
  constructor() {
    this.titulo='es la tienda';
   }

   mostrarNombre(){
      console.log(this.nombreDelParque);
   }
  ngOnInit() {
  }

}
