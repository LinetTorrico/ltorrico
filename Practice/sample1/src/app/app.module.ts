import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppComponent } from './app.component';
import { HttpModule } from '@angular/http';
import { FormsModule } from '@angular/forms'

// componentes

import { TiendaComponent } from './tienda/tienda.component';
import { ParquesComponent } from './parques/parques.component';
import { TableComponent } from './table/table.component';


@NgModule({
  declarations: [ // Directicas, componentes  y pipes
    AppComponent,
    TiendaComponent,
    ParquesComponent,
    TableComponent
  ],
  imports: [ //
    BrowserModule,
    FormsModule,
    HttpModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
