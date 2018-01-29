import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-tienda',
  templateUrl: './tienda.component.html',
  styleUrls: ['./tienda.component.css']
})
export class TiendaComponent implements OnInit {
  public titulo;
  public nombreDelParque: string;
  public  metrosDelParque: number;
  public miParque;

  constructor() {
    this.titulo='es la tienda';
   }

   mostrar(){
      //console.log(this.metrosDelParque);
   }
   verDatosParque(event){
    //console.log(event);
    //this.miParque = event;
   }
  ngOnInit() {
  }

}
